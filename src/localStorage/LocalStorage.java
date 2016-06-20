/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localStorage;

import java.util.List;
import java.util.ArrayList;
import ui.ICommand;

/**
 *
 * @author stef
 */
public class LocalStorage {

    private List<ICommand> undo = new ArrayList<ICommand>();
    private List<ICommand> redo = new ArrayList<ICommand>();
    private static LocalStorage instance = null;

    private LocalStorage() {

    }

    public static LocalStorage getInstance() {
        if (instance == null) {
            instance = new LocalStorage();
        }
        return instance;
    }

   public void pushUndo(ICommand command) {
        undo.add(command);
    }

    public void pushRedo(ICommand command) {
        redo.add(command);
    }

    public ICommand popUndo() {
        if (!undo.isEmpty()) {
            int lastPosition = undo.size() - 1;
            return undo.remove(lastPosition);
        }
        return null;
    }

   public ICommand popRedo() {
        if (!redo.isEmpty()) {
            int lastPosition = redo.size() - 1;
            return redo.remove(lastPosition);
        }
        return null;
    }

}
