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
public class CopyDirDao {

    public void copyDir(String src, String dest){
        File source = new File(src);
        dest = dest + File.separator + source.getName();
        File destination = new File(dest);
        destination.mkdir();
         String files[] = source.list();
         for (String file : files) {
    		  
    		   File srcFile = new File(src, file);
    		   File destFile = new File(dest, file);
            try {
                //recursive copy
                FileUtils.copyFile(srcFile, destFile);
            } catch (IOException ex) {
            }
  		}

    }
}
