package model;

import java.io.File;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.io.FilenameUtils;

public class FileTableModel extends AbstractTableModel implements TableModelListener {

    protected File dir;
    protected String[] filenames;
    protected String path;

    protected String[] columnNames = new String[]{
        "Name", "Size", "Last Modified", "isDirectory?", "isReadable?", "isWritable?"
    };

    protected Class[] columnClasses = new Class[]{
        String.class, Long.class, Date.class,
        Boolean.class, Boolean.class, Boolean.class
    };

    public File getDir() {
        return dir;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setDir(File dir) {
        this.dir = dir;
    }

    public FileTableModel(File dir) {
        this.dir = dir;

        this.filenames = dir.list();

    }

    public int getColumnCount() {
        return 6;
    }

    public int getRowCount() {

        return filenames.length;

    }  // # of files in dir

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Class getColumnClass(int col) {
        return columnClasses[col];
    }

    public Object getValueAt(int row, int col) {
        File f = new File(dir, filenames[row]);

        switch (col) {
            case 0:
                return filenames[row];
            case 1:
                return new Long(f.length());
            case 2:
                return new Date(f.lastModified());
            case 3:
                return f.isDirectory() ? Boolean.TRUE : Boolean.FALSE;
            case 4:
                return f.canRead() ? Boolean.TRUE : Boolean.FALSE;
            case 5:
                return f.canWrite() ? Boolean.TRUE : Boolean.FALSE;
            default:
                return null;
        }

    }

    public void fillTable(JTable ShowTable, String path) {
        Object[][] data = null;
        String[] columnNames = new String[4];
        columnNames = new String[]{"Name", "Size(Bytes)", "Type", "Last Modified"};
        data = new Object[1][4];
        File getFilePathName = new File(path);
        data[0][0] = getFilePathName.getName();
        File getSize = new File(path);
        data[0][1] = getSize.length();
        data[0][2] = FilenameUtils.getExtension(path);
        File getModification = new File(path);
        Date date = new Date(getModification.lastModified());
        data[0][3] = date;
        ShowTable.setModel(new DefaultTableModel(data, columnNames));
    }

    @Override
    public void tableChanged(TableModelEvent e) {

        fireTableDataChanged();
        fireTableChanged(e);

    }

}
