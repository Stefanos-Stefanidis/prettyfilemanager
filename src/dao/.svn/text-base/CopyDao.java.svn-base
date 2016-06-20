package dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.apache.commons.io.FileUtils;

public class CopyDao {

    public void pasteFile(String src, String dest) throws IOException {
        File destDir = new File(dest);
        File srcFile = new File(src);
        FileUtils.copyFileToDirectory(srcFile, destDir);

    }

}
