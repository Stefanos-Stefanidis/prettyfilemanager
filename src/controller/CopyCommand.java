/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import ui.ICommand;

/**
 *
 * @author stef
 */
public class CopyCommand implements ICommand {

    private String source;
    private String dest;

    public CopyCommand(String source, String dest) {
        this.source = source;
        //File f = new File(source);
        this.dest = dest;
        //+ File.pathSeparator + f.getName()

    }

    @Override
    public void undo() {
        File f = new File(source);
        dest = dest + File.separator + f.getName();
        //System.out.print(dest);
        DeleteController dlt = new DeleteController();
        dlt.deleteFile(dest);
    }

    @Override
    public void redo() {
        perform();
    }

    @Override
    public void perform() {
        File destDir = new File(dest);
        File srcFile = new File(source);
        try {
            FileUtils.copyFileToDirectory(srcFile, destDir);
        } catch (IOException ex) {
        }
    }

}
