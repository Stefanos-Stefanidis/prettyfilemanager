package controller;

import dao.CreateDocumentDao;
import ui.IMyOptionPane;
import ui.MyOptionPane;
import java.io.File;
import java.io.IOException;

public class CreateDocumentController {

    public String add = "";
    public static int counter = 2;
    int option;

    public void createDoc(String path, String name, String type) {
        File file = new File(path + "\\" + name + type);
        MyOptionPane pane = new MyOptionPane();
        CreateDocumentDao createDocument = new CreateDocumentDao();

        if (file.exists()) {
            add = "(" + String.valueOf(counter) + ")";
            option = pane.createDocumentPane(name + add + "?");

            if (option == IMyOptionPane.YES) {

                file = new File(path + "\\" + name + type);

                createDocument.createFile(path, name, type);

                counter++;
                createDoc(path, name + add, type);
            }

        }
        else {
            try {
                file.createNewFile();
            }
            catch (IOException ex) {
                pane.ioExceptionPane(ex);
            }
        }

    }

}
