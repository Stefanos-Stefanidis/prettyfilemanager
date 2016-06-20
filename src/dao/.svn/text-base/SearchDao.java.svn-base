package dao;

import java.io.File;
import javax.swing.JTextArea;

/**
 *
 * @author stef
 */
public class SearchDao {

    String tmp = "";

    public void walkin(File dir, String SearchKey, JTextArea searchDisplay, String type) {

        String pattern = type;
        String patternSmall = type.toLowerCase();
        File listFile[] = dir.listFiles();
        if (listFile != null) {
            for (int i = 0; i < listFile.length; i++) {
                // for(int i = listFile.length -1; i>=0;i-- ) {
                if (listFile[i].isDirectory()) {
                    walkin(listFile[i], SearchKey, searchDisplay, type);
                }
                else {
                    if (listFile[i].getName().endsWith(pattern) || listFile[i].getName().endsWith(patternSmall)) {
                        System.out.println(listFile[i].getPath());
                        if ((listFile[i].getPath().toString()).contains(SearchKey)) {
                            tmp = tmp + listFile[i].getPath().toString() + "\n";

                        }
                    }
                }
            }
            if (tmp.isEmpty()) {
                searchDisplay.setText("File not found");
            }
            else {
                searchDisplay.setText(tmp);
            }
        }
    }
}
