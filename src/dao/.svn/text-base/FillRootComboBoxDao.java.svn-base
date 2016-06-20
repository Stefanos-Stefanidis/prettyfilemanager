package dao;

import java.io.File;
import javax.swing.JComboBox;

public class FillRootComboBoxDao {

    @SuppressWarnings("unchecked")
    public void FillComboxWithRoots(JComboBox selectRoot) {

        File[] roots = File.listRoots();
        for (int i = 0; i < roots.length; i++) {
            selectRoot.addItem(roots[i]);
        }
    }
}
