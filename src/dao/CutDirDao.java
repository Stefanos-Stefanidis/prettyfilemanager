
package dao;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author stef
 */
public class CutDirDao {

    public void cutDir(String src, String dest) {
        File source = new File(src);
        dest = dest + File.separator + source.getName();
        File destination = new File(dest);
        String files[] = source.list();
        destination.mkdir();
        for (String file : files) {
            //construct the src and dest file structure
            File srcFile = new File(src, file);
            File destFile = new File(dest, file);
            try {
                //recursive copy
                FileUtils.copyFile(srcFile, destFile);
            } catch (IOException ex) {
            }
        }
        for (String file : files) {
            File sourceFile = new File(src, file);
            sourceFile.delete();
        }

        source.delete();

    }

}
