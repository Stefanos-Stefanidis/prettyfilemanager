package controller;

import dao.CopyDirDao;
import dao.CutDirDao;
import java.io.File;
import localStorage.LocalStorage;
import ui.ICommand;
import ui.MyOptionPane;

public class CutOrCopyController {

    public void doCutOrCopy(String cutpath, String copypath, String pastepath) {
        MyOptionPane pane = new MyOptionPane();
        ICommand commandCP = new CopyCommand(copypath, pastepath);
        ICommand commandCT = new CutCommand(cutpath, pastepath);
        File copydir = new File(copypath);
        File cutdir = new File(cutpath);
        if (!cutpath.equals("")) {
            if (cutdir.isDirectory()) {
                ICommand cut = new CutDirCommand(cutpath, pastepath);
                cut.perform();
                LocalStorage.getInstance().pushUndo(cut);

//                CutDirDao cut = new CutDirDao();
//                cut.cutDir(cutpath, pastepath);
            }

            commandCT.perform();
            LocalStorage.getInstance().pushUndo(commandCT);

        } else if (!copypath.equals("")) {
            if (copydir.isDirectory()) {
                ICommand copy = new CopyDirCommand(copypath, pastepath);
                copy.perform();
                LocalStorage.getInstance().pushUndo(copy);
//                CopyDirDao copy = new CopyDirDao();
//                copy.copyDir(copypath, pastepath);
            }
            commandCP.perform();
            LocalStorage.getInstance().pushUndo(commandCP);
        }
    }
}
