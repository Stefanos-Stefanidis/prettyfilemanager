package dao;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFileDao {

    public void openFileDao(String path) throws IOException {

        File selection = new File(path);

        Desktop.getDesktop().open(selection);

    }
}
