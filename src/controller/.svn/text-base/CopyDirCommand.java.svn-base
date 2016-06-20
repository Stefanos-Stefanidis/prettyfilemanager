/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CopyDirDao;
import dao.CutDirDao;
import java.io.File;
import ui.ICommand;

/**
 *
 * @author stef
 */
public class CopyDirCommand implements ICommand {

    String src;
    String dest;

    public CopyDirCommand(String src, String dest) {
        this.src = src;
        this.dest = dest;
    }

    @Override
    public void undo() {
        File f = new File(src);
        dest = dest + File.separator + f.getName();
        File destination = new File(dest);
        String[] files = destination.list();
        for (String file : files) {
            File destFile = new File(dest, file);
            destFile.delete();
        }

        destination.delete();

    }

    @Override
    public void redo() {
        perform();
    }

    @Override
    public void perform() {
        CopyDirDao copy = new CopyDirDao();
        copy.copyDir(src, dest);
    }

}
