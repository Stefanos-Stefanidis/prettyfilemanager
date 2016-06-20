/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.RenameDao;
import ui.ICommand;

/**
 *
 * @author stef
 */
public class RenameCommand implements ICommand{
    
private String oldName;
private String newName;

    public RenameCommand(String oldName, String newName) {
        this.oldName = oldName;
        this.newName = newName;
    }

  

    @Override
    public void undo() {
         RenameDao rename = new RenameDao();
         rename.newName(newName, oldName);
         
        
    }

    @Override
    public void redo() {
        perform();
    }

    @Override
    public void perform() {
            RenameDao rename = new RenameDao();
            rename.newName(oldName, newName);
        
    }
    
}
