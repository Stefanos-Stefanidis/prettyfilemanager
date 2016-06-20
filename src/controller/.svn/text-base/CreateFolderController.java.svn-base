package controller;

import dao.CreateFolderDao;
import ui.MyOptionPane;
import java.awt.HeadlessException;
import java.io.File;

public class CreateFolderController {

    MyOptionPane pane = new MyOptionPane();

    public void createFolder(String path, String name) {
        File file = new File(path + "\\" + name);
        try {

            if (!file.exists()) {
                CreateFolderDao createFolder = new CreateFolderDao();
                createFolder.createDirectoryFromButton(path, name);

                pane.showMessage("Directory created succesfully.");

            }
            else {
                pane.showMessage("Directory Exists. Try another name.");

            }
        }
        catch (HeadlessException e) {
            pane.headlessExceptionPane(e);

        }

    }

}
