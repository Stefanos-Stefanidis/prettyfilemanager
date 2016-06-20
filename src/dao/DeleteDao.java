package dao;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class DeleteDao {

    public void deleteFile(String path) throws IOException {
        CopyDao paste = new CopyDao();
        File file = new File(System.getProperty("user.home") + "\\Desktop" + "\\Junk");
        if (file.exists()) {
            paste.pasteFile(path, (System.getProperty("user.home") + "\\Desktop" + "\\Junk"));
        } else {
            file.mkdir();
            paste.pasteFile(path, (System.getProperty("user.home") + "\\Desktop" + "\\Junk"));
        }
        File sourceFile = new File(path);
        FileUtils.deleteQuietly(sourceFile);
    }
}
