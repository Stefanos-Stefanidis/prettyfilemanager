package controller;

import ui.MyOptionPane;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author stef
 */
public class OpenHelpController {

    public void help(URI url) {
        MyOptionPane pane = new MyOptionPane();
        try {
            url = new URI("http://83.212.99.34/phpmail/about.php");
        }
        catch (URISyntaxException ex) {
            pane.uriSyntaxExceptionMessage(ex);
        }
        try {
            java.awt.Desktop.getDesktop().browse(url);
        }
        catch (IOException ex) {
            pane.ioExceptionPane(ex);
        }
    }

}
