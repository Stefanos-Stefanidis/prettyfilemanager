/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CutDirDao;
import java.io.File;
import ui.ICommand;

/**
 *
 * @author stef
 */
public class CutDirCommand implements ICommand {

    String src;
    String dest;

    public CutDirCommand(String src, String dest) {
        this.src = src;
        this.dest = dest;
    }

    @Override
    public void undo() {
        dest = dest + File.separator + src;
        File destination = new File(dest);
        File source = new File(src);
        destination.delete();
        source.mkdir();

    }

    @Override
    public void redo() {
    }

    @Override
    public void perform() {
        CutDirDao cut = new CutDirDao();
        cut.cutDir(src, dest);
    }

}
