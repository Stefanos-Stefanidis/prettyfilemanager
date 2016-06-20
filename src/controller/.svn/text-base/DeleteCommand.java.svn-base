/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CopyDao;
import dao.DeleteDao;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui.ICommand;

/**
 *
 * @author stef
 */
public class DeleteCommand implements ICommand {

    String path;
    private String filename;
    private String filepath;
    private String deleteFolderLocation = System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "Junk";

    public DeleteCommand(String path) {
        this.path = path;
        File pathFile = new File(path);
        filename = pathFile.getName();
        filepath = pathFile.getParent();

    }

    @Override
    public void undo() {

        CopyDao paste = new CopyDao();
        try {
            paste.pasteFile(deleteFolderLocation + File.separator + filename, filepath);
//        System.out.println(f.getParent());
//        System.out.println(f.getPath());

        } catch (IOException ex) {
            Logger.getLogger(DeleteCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void redo() {
        perform();
    }

    @Override
    public void perform() {

        DeleteDao delete = new DeleteDao();
        try {
            delete.deleteFile(path);

        } catch (IOException ex) {
        }
    }

}
