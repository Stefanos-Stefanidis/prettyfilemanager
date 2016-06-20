package ui;

import javax.swing.JTextField;
import javax.swing.JTree;
import static ui.FileManagerForm.absolutePath;

public class GetFilePath {

    public void getPath(JTree tree, JTextField FilePathTextField) {

        try {

            absolutePath = tree.getSelectionPath().toString().replaceAll("[\\[\\]]", "").replace(", ", "\\");
            FilePathTextField.setText(absolutePath);
        }
        catch (NullPointerException ex) {

        }
    }

}
