package controller;

import dao.CmdDao;
import ui.MyOptionPane;
import java.io.IOException;

public class CmdController {
    
    public void openCMD() {
        MyOptionPane pane = new MyOptionPane();
        CmdDao openCmd = new CmdDao();
        try {
            openCmd.runCMD();
        }
        catch (IOException ex) {
            pane.ioExceptionPane(ex);
        }
    }
    
}
