package controller;

import ui.MyOptionPane;
import dao.RenameDao;
import java.io.File;
import localStorage.LocalStorage;
import ui.ICommand;

public class RenameController {

    public void renameFile(String oldNameFile, String newNameFile) {
        MyOptionPane pane = new MyOptionPane();
        File newname = new File(newNameFile);
        if (newname.exists()) {

            pane.showMessage("File name exist try another one");
        }
        else {
            ICommand rename = new RenameCommand(oldNameFile,newNameFile);
            rename.perform();
             LocalStorage.getInstance().pushUndo(rename);
        }
    }

}
