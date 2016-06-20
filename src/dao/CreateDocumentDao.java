package dao;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateDocumentDao {

    public void createFile(String path, String name, String type) {
        File file = new File(path + "\\" + name + type);
        try {
            file.createNewFile();
        }
        catch (IOException ex) {
            Logger.getLogger(CreateDocumentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
