package ui;

import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

public class MyOptionPane implements IMyOptionPane {

    @Override
    public int createDocumentPane(String message) {
        return JOptionPane.showConfirmDialog(null, "File exist. Do you want to overright with:" + message, null, JOptionPane.YES_NO_OPTION);
    }

    public void ioExceptionPane(IOException message) {
        JOptionPane.showMessageDialog(null, message, null, JOptionPane.ERROR_MESSAGE);
    }

    public void headlessExceptionPane(HeadlessException message) {
        JOptionPane.showMessageDialog(null, message, null, JOptionPane.ERROR_MESSAGE);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message, null, JOptionPane.INFORMATION_MESSAGE);
    }

    public int deleteDocumentPane() {
        return JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this?", null, JOptionPane.YES_NO_OPTION);
    }

    public void exceptionMessage(Exception message) {
        JOptionPane.showMessageDialog(null, message, null, JOptionPane.ERROR_MESSAGE);
    }

    public void nullPointerExceptionMessage(NullPointerException message) {
        JOptionPane.showMessageDialog(null, message, null, JOptionPane.ERROR_MESSAGE);
    }

    public void uriSyntaxExceptionMessage(URISyntaxException message) {
        JOptionPane.showMessageDialog(null, message, null, JOptionPane.ERROR_MESSAGE);
    }

}
