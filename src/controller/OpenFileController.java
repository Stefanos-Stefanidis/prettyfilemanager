package controller;

import ui.MyOptionPane;
import dao.OpenFileDao;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFileController {

    public void openFile(String path) {
        MyOptionPane pane = new MyOptionPane();
        try {
            File selection = new File(path);
            if (selection.exists()) {
                if (Desktop.isDesktopSupported()) {
                    OpenFileDao open = new OpenFileDao();
                    try {
                        open.openFileDao(path);
                    }
                    catch (IOException ex) {
                        pane.ioExceptionPane(ex);
                    }
                }
                else {
                    pane.showMessage("AWT Desktop is not supported");
                }
            }
            else {
                pane.showMessage("Can not open thi type of file");
            }
        }
        catch (NullPointerException ex) {
            pane.nullPointerExceptionMessage(ex);
        }
    }
}
