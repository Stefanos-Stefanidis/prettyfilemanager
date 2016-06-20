package controller;

import ui.MyOptionPane;
import java.awt.HeadlessException;
import java.io.File;
import localStorage.LocalStorage;
import ui.ICommand;

public class DeleteController {

    MyOptionPane pane = new MyOptionPane();
   // int answer = pane.deleteDocumentPane();

    public void deleteFile(String path) {
        File dltFile = new File(path);
       // if (answer == JOptionPane.YES_OPTION) {

            try {
                if (dltFile.exists()) {
                    ICommand deleteCommand = new DeleteCommand(path);
                    deleteCommand.perform();
                    LocalStorage.getInstance().pushUndo(deleteCommand);
                }
            }
            catch (HeadlessException e) {
                pane.headlessExceptionPane(e);
            }
       // }
    }
}
