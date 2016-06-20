package controller;

import dao.MoveDao;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import ui.ICommand;

public class CutCommand implements ICommand {

    private String source;
    private String dest;
    private String filepath;
    public CutCommand(String source, String dest) {
        this.source = source;
        this.dest = dest;
        File pathFile = new File(source);
        filepath = pathFile.getParent();
    }

    @Override
    public void perform() {
        CopyCommand paste = new CopyCommand(source, dest);
        paste.perform();
        DeleteController dlt = new DeleteController();
        dlt.deleteFile(source);
    }

    @Override
    public void redo() {
        perform();
    }

    @Override
    public void undo() {

        File f = new File(source);
        dest = dest + File.separator + f.getName();
        File destFile = new File(dest);
        File srcFile = new File(filepath);
        try {
            FileUtils.copyFileToDirectory(destFile, srcFile);
         
        } catch (IOException ex) {
        }
        FileUtils.deleteQuietly(destFile);

    }
}
