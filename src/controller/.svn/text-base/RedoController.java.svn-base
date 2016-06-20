/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import localStorage.LocalStorage;
import ui.ICommand;

/**
 *
 * @author stef
 */
public class RedoController {

    public void doRedo() {
        ICommand command = LocalStorage.getInstance().popRedo();
        command.redo();
         LocalStorage.getInstance().pushUndo(command);
    }
}
