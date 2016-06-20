package controller;

import dao.FillRootComboBoxDao;
import ui.MyOptionPane;
import javax.swing.JComboBox;

public class FillRootComboBoxController {

    public void FillComboxWithRoots(JComboBox selectRoot) {
        MyOptionPane pane = new MyOptionPane();
        try {
            FillRootComboBoxDao Fill = new FillRootComboBoxDao();
            Fill.FillComboxWithRoots(selectRoot);
        } catch (Exception e) {
            pane.exceptionMessage(e);
        }

    }

}
