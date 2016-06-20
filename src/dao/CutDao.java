package dao;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class CutDao {

    public void cutAction(String cutpath, String pastepath) throws IOException {
        CopyDao paste = new CopyDao();
        paste.pasteFile(cutpath, pastepath);
        File sourceFile = new File(cutpath);
        FileUtils.deleteQuietly(sourceFile);
        cutpath = "";
    }

}
