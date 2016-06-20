/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;

/**
 *
 * @author stef
 */
public class RenameDao {

    public void newName(String oldNameFile, String newNameFile) {

        File renameFile = new File(oldNameFile);
        File newname = new File(newNameFile);
        renameFile.renameTo(newname);
    }

}
