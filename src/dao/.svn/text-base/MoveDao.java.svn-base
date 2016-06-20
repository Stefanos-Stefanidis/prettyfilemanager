/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author stef
 */
public class MoveDao {

    public void move(String dest, String source) {
        try {

            File fname = new File(source);
            dest = dest + File.separator + fname.getName();
            CopyDao paste = new CopyDao();
            paste.pasteFile(dest, source);
        } catch (IOException ex) {
        }
        File f = new File(dest);
        FileUtils.deleteQuietly(f);
    }

}
