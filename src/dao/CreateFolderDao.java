package dao;

import java.io.File;

public class CreateFolderDao {

    public void createDirectoryFromButton(String path, String name) {
        File file = new File(path + "\\" + name);
        file.mkdirs();
    }

}
