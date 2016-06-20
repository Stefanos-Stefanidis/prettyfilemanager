package ui;

import controller.CmdController;
import controller.CreateDocumentController;
import controller.CreateFolderController;
import controller.CutOrCopyController;
import controller.DeleteController;
import controller.FillRootComboBoxController;
import controller.OpenFileController;
import controller.OpenHelpController;
import controller.RedoController;
import controller.RenameController;
import controller.SearchController;
import controller.UndoController;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.tree.TreePath;
import model.FileTableModel;
import model.MyTreeModel;
import org.apache.commons.io.FileUtils;

public class FileManagerForm extends javax.swing.JFrame {

    public static String absolutePath = "";
    private static String copypath = "";
    private static String cutpath = "";
    private static String searchWord;
    private static String newName;
    private static String PathToGo;
    URI HelpPage;
    IMyOptionPane myOptionPane;
    Thread t;

    public FileManagerForm() {

        initComponents();

        getContentPane().setBackground(Color.PINK);
        this.setLocationRelativeTo(this);
        FillRootComboBoxController Fill = new FillRootComboBoxController();
        Fill.FillComboxWithRoots(selectRootComboBox);
        tree.setSelectionRow(0);

        ShowTable.setAutoCreateRowSorter(true);
        ShowTable.setFillsViewportHeight(true);
        ShowTable.setShowHorizontalLines(false);
        ShowTable.setSelectionMode(0);

    }

    public void update_Table() {
        FileTableModel tableModel = new FileTableModel((new File(absolutePath)));
        if (tableModel.getDir().isDirectory()) {

            ShowTable.setModel(tableModel);
//            ShowTable.setValueAt(t, WIDTH, WIDTH);

        } else {
            tableModel.fillTable(ShowTable, absolutePath);
        }
        if (ShowTable.getRowCount() == 0) {
            tableModel.fillTable(ShowTable, absolutePath);
        }

    }

//    private void setColumnWidth(int column, int width) {
//        TableColumn tableColumn = ShowTable.getColumnModel().getColumn(column);
//        if (width < 0) {
//            // use the preferred width of the header..
//            JLabel label = new JLabel((String) tableColumn.getHeaderValue());
//            Dimension preferred = label.getPreferredSize();
//            // altered 10->14 as per camickr comment.
//            width = (int) preferred.getWidth() + 14;
//        }
//        tableColumn.setPreferredWidth(width);
//        tableColumn.setMaxWidth(width);
//        tableColumn.setMinWidth(width);
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createDocumentDialog = new javax.swing.JDialog();
        createDocumentPathLabel = new javax.swing.JLabel();
        createDocumentButton = new javax.swing.JButton();
        documentNameTextField = new javax.swing.JTextField();
        documentTypeComboBox = new javax.swing.JComboBox();
        createFolderDialog = new javax.swing.JDialog();
        createFolderPathLabel = new javax.swing.JLabel();
        createDirButton = new javax.swing.JButton();
        dirNameTextField = new javax.swing.JTextField();
        renameDialog = new javax.swing.JDialog();
        infoLabel = new javax.swing.JLabel();
        renameButton = new javax.swing.JButton();
        renameTextField = new javax.swing.JTextField();
        searchDialog = new javax.swing.JDialog();
        searchLabel = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        searchForComboBox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        displaySearchTextArea = new javax.swing.JTextArea();
        popupMenu = new javax.swing.JPopupMenu();
        openPopupMenuItem = new javax.swing.JMenuItem();
        cutPopupMenuItem = new javax.swing.JMenuItem();
        copyPopupMenuItem = new javax.swing.JMenuItem();
        pastePopupMenuItem = new javax.swing.JMenuItem();
        renamePopupMenuItem = new javax.swing.JMenuItem();
        searchPopupMenuItem = new javax.swing.JMenuItem();
        cmdPopupMenuItem = new javax.swing.JMenuItem();
        propertiesPopupMenuItem = new javax.swing.JMenuItem();
        propertiesDialog = new javax.swing.JDialog();
        searchGoPopupMenu = new javax.swing.JPopupMenu();
        GoTo = new javax.swing.JMenuItem();
        tablePopupMenu = new javax.swing.JPopupMenu();
        openTablePopupMenuItem = new javax.swing.JMenuItem();
        cutTablePopupMenuItem = new javax.swing.JMenuItem();
        copyTablePopupMenuItem = new javax.swing.JMenuItem();
        pasteTablePopupMenuItem = new javax.swing.JMenuItem();
        filePathTextField = new javax.swing.JTextField();
        refreshButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        selectRootComboBox = new javax.swing.JComboBox();
        goToButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        jScrollPane4 = new javax.swing.JScrollPane();
        ShowTable = new javax.swing.JTable();
        UndoButton = new javax.swing.JButton();
        RedoButton = new javax.swing.JButton();
        fileManagerMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        searchMenuItem = new javax.swing.JMenuItem();
        createFolderMenuItem = new javax.swing.JMenuItem();
        createDocumentMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        renameMenuItem = new javax.swing.JMenuItem();
        ViewMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();
        helpjMenuItem = new javax.swing.JMenuItem();

        createDocumentDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        createDocumentDialog.setBackground(new java.awt.Color(214, 217, 223));
        createDocumentDialog.setResizable(false);

        createDocumentButton.setText("Create Document");
        createDocumentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDocumentButtonActionPerformed(evt);
            }
        });

        documentTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".txt", ".html", ".pdf", ".php" }));

        javax.swing.GroupLayout createDocumentDialogLayout = new javax.swing.GroupLayout(createDocumentDialog.getContentPane());
        createDocumentDialog.getContentPane().setLayout(createDocumentDialogLayout);
        createDocumentDialogLayout.setHorizontalGroup(
            createDocumentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createDocumentDialogLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(createDocumentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createDocumentDialogLayout.createSequentialGroup()
                        .addGroup(createDocumentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createDocumentPathLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(createDocumentDialogLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(documentTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(createDocumentDialogLayout.createSequentialGroup()
                        .addGroup(createDocumentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(documentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createDocumentButton))
                        .addContainerGap(150, Short.MAX_VALUE))))
        );
        createDocumentDialogLayout.setVerticalGroup(
            createDocumentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createDocumentDialogLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(createDocumentPathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(createDocumentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(documentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(documentTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(createDocumentButton)
                .addGap(40, 40, 40))
        );

        createFolderDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        createFolderDialog.setResizable(false);

        createDirButton.setText("Create Folder");
        createDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createFolderDialogLayout = new javax.swing.GroupLayout(createFolderDialog.getContentPane());
        createFolderDialog.getContentPane().setLayout(createFolderDialogLayout);
        createFolderDialogLayout.setHorizontalGroup(
            createFolderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createFolderDialogLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(createFolderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createFolderPathLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(createFolderDialogLayout.createSequentialGroup()
                        .addComponent(dirNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(createDirButton)))
                .addContainerGap())
        );
        createFolderDialogLayout.setVerticalGroup(
            createFolderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createFolderDialogLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(createFolderPathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(createFolderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dirNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createDirButton))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        renameDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        renameDialog.setResizable(false);

        infoLabel.setText("Enter New Name");

        renameButton.setText("Do");
        renameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout renameDialogLayout = new javax.swing.GroupLayout(renameDialog.getContentPane());
        renameDialog.getContentPane().setLayout(renameDialogLayout);
        renameDialogLayout.setHorizontalGroup(
            renameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, renameDialogLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(renameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(renameButton)
                .addGap(29, 29, 29))
            .addGroup(renameDialogLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(infoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        renameDialogLayout.setVerticalGroup(
            renameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(renameDialogLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(infoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(renameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(renameButton)
                    .addComponent(renameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        searchDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        searchDialog.setResizable(false);

        searchLabel.setText("Search for:");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchForComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", ".JPG", ".AVI", ".TXT" }));

        displaySearchTextArea.setEditable(false);
        displaySearchTextArea.setColumns(20);
        displaySearchTextArea.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        displaySearchTextArea.setRows(5);
        displaySearchTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                displaySearchTextAreaMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(displaySearchTextArea);

        javax.swing.GroupLayout searchDialogLayout = new javax.swing.GroupLayout(searchDialog.getContentPane());
        searchDialog.getContentPane().setLayout(searchDialogLayout);
        searchDialogLayout.setHorizontalGroup(
            searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(searchDialogLayout.createSequentialGroup()
                        .addComponent(searchLabel)
                        .addGap(18, 18, 18)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchForComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton)
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        searchDialogLayout.setVerticalGroup(
            searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchDialogLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLabel)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchForComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        openPopupMenuItem.setText("Open");
        openPopupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openPopupMenuItemActionPerformed(evt);
            }
        });
        popupMenu.add(openPopupMenuItem);

        cutPopupMenuItem.setText("Cut");
        cutPopupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutPopupMenuItemActionPerformed(evt);
            }
        });
        popupMenu.add(cutPopupMenuItem);

        copyPopupMenuItem.setText("Copy");
        copyPopupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyPopupMenuItemActionPerformed(evt);
            }
        });
        popupMenu.add(copyPopupMenuItem);

        pastePopupMenuItem.setText("Paste");
        pastePopupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastePopupMenuItemActionPerformed(evt);
            }
        });
        popupMenu.add(pastePopupMenuItem);

        renamePopupMenuItem.setText("Rename");
        renamePopupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renamePopupMenuItemActionPerformed(evt);
            }
        });
        popupMenu.add(renamePopupMenuItem);

        searchPopupMenuItem.setText("Search");
        searchPopupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPopupMenuItemActionPerformed(evt);
            }
        });
        popupMenu.add(searchPopupMenuItem);

        cmdPopupMenuItem.setText("Command Prompt");
        cmdPopupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPopupMenuItemActionPerformed(evt);
            }
        });
        popupMenu.add(cmdPopupMenuItem);

        propertiesPopupMenuItem.setText("Properties");
        propertiesPopupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertiesPopupMenuItemActionPerformed(evt);
            }
        });
        popupMenu.add(propertiesPopupMenuItem);

        javax.swing.GroupLayout propertiesDialogLayout = new javax.swing.GroupLayout(propertiesDialog.getContentPane());
        propertiesDialog.getContentPane().setLayout(propertiesDialogLayout);
        propertiesDialogLayout.setHorizontalGroup(
            propertiesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        propertiesDialogLayout.setVerticalGroup(
            propertiesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        GoTo.setText("Go");
        GoTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToActionPerformed(evt);
            }
        });
        searchGoPopupMenu.add(GoTo);

        openTablePopupMenuItem.setText("Open");
        openTablePopupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openTablePopupMenuItemActionPerformed(evt);
            }
        });
        tablePopupMenu.add(openTablePopupMenuItem);

        cutTablePopupMenuItem.setText("Cut");
        cutTablePopupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutTablePopupMenuItemActionPerformed(evt);
            }
        });
        tablePopupMenu.add(cutTablePopupMenuItem);

        copyTablePopupMenuItem.setText("Copy");
        copyTablePopupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTablePopupMenuItemActionPerformed(evt);
            }
        });
        tablePopupMenu.add(copyTablePopupMenuItem);

        pasteTablePopupMenuItem.setText("Paste");
        pasteTablePopupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteTablePopupMenuItemActionPerformed(evt);
            }
        });
        tablePopupMenu.add(pasteTablePopupMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        filePathTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filePathTextFieldKeyPressed(evt);
            }
        });

        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/regenerate_16.png"))); // NOI18N
        refreshButton.setBorder(null);
        refreshButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                refreshButtonComponentResized(evt);
            }
        });
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/house-icon.png"))); // NOI18N
        homeButton.setBorder(null);
        homeButton.setFocusPainted(false);
        homeButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                homeButtonComponentResized(evt);
            }
        });
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        selectRootComboBox.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                selectRootComboBoxComponentResized(evt);
            }
        });
        selectRootComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectRootComboBoxActionPerformed(evt);
            }
        });

        goToButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/goto-icon.png"))); // NOI18N
        goToButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToButtonActionPerformed(evt);
            }
        });

        tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                treeMouseReleased(evt);
            }
        });
        tree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                treeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tree);

        ShowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ShowTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ShowTableMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(ShowTable);

        UndoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/back_undo.png"))); // NOI18N
        UndoButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                UndoButtonComponentResized(evt);
            }
        });
        UndoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoButtonActionPerformed(evt);
            }
        });

        RedoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/redo.png"))); // NOI18N
        RedoButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                RedoButtonComponentResized(evt);
            }
        });
        RedoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedoButtonActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        searchMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        searchMenuItem.setText("Search");
        searchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(searchMenuItem);

        createFolderMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        createFolderMenuItem.setText("Create Folder");
        createFolderMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFolderMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(createFolderMenuItem);

        createDocumentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        createDocumentMenuItem.setText("Create Document");
        createDocumentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDocumentMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(createDocumentMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        fileManagerMenuBar.add(fileMenu);

        editMenu.setText("Edit");

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        cutMenuItem.setText("Cut");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        copyMenuItem.setText("Copy");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        pasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        pasteMenuItem.setText("Paste");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        deleteMenuItem.setText("Delete");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem);

        renameMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        renameMenuItem.setText("Rename");
        renameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(renameMenuItem);

        fileManagerMenuBar.add(editMenu);

        ViewMenu.setText("View");
        fileManagerMenuBar.add(ViewMenu);

        helpMenu.setText("Help");

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        helpjMenuItem.setText("Contents");
        helpjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpjMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(helpjMenuItem);

        fileManagerMenuBar.add(helpMenu);

        setJMenuBar(fileManagerMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectRootComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(RedoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UndoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(goToButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goToButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(RedoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectRootComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UndoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        tree.updateUI();
        update_Table();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        tree.setModel(new MyTreeModel(new File(System.getProperty("user.home") + "\\Desktop")));
        filePathTextField.setText(System.getProperty("user.home") + "\\Desktop");
        tree.setSelectionRow(0);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void refreshButtonComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_refreshButtonComponentResized
        refreshButton.setSize(40, 46);
    }//GEN-LAST:event_refreshButtonComponentResized

    private void homeButtonComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_homeButtonComponentResized
        homeButton.setSize(40, 46);
    }//GEN-LAST:event_homeButtonComponentResized

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        JOptionPane.showMessageDialog(this, "This Prety file manager \n is a demo project");
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        OpenFileController open = new OpenFileController();
        open.openFile(absolutePath);
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void searchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMenuItemActionPerformed
        searchDialog.setSize(600, 340);
        searchDialog.setLocationRelativeTo(this);
        searchDialog.setVisible(true);
    }//GEN-LAST:event_searchMenuItemActionPerformed

    private void createFolderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFolderMenuItemActionPerformed
        createFolderPathLabel.setText(absolutePath);
        createFolderDialog.setSize(358, 198);
        createFolderDialog.setLocationRelativeTo(this);
        createFolderDialog.setVisible(true);
    }//GEN-LAST:event_createFolderMenuItemActionPerformed

    private void createDocumentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDocumentMenuItemActionPerformed
        createDocumentPathLabel.setText(absolutePath);
        createDocumentDialog.setSize(365, 224);
        createDocumentDialog.setLocationRelativeTo(this);
        createDocumentDialog.setVisible(true);
    }//GEN-LAST:event_createDocumentMenuItemActionPerformed

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed

        DeleteController delete = new DeleteController();
        delete.deleteFile(absolutePath);
        int[] selectedRow = tree.getSelectionRows();
        tree.setSelectionRow(selectedRow[0] - 1);
        tree.updateUI();
        update_Table();
    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void goToButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToButtonActionPerformed
        tree.setModel(new MyTreeModel(new File(filePathTextField.getText())));
    }//GEN-LAST:event_goToButtonActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        copypath = absolutePath;
        cutpath = "";
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
        CutOrCopyController decide = new CutOrCopyController();
        decide.doCutOrCopy(cutpath, copypath, absolutePath);

        tree.updateUI();
        update_Table();
    }//GEN-LAST:event_pasteMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        cutpath = absolutePath;
        copypath = "";
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void treeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_treeValueChanged
        GetFilePath Path = new GetFilePath();
        Path.getPath(tree, filePathTextField);
        update_Table();
    }//GEN-LAST:event_treeValueChanged

    private void selectRootComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectRootComboBoxActionPerformed
        tree.setModel(new MyTreeModel(new File(selectRootComboBox.getSelectedItem().toString())));
    }//GEN-LAST:event_selectRootComboBoxActionPerformed

    private void selectRootComboBoxComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_selectRootComboBoxComponentResized
        selectRootComboBox.setSize(50, 50);
    }//GEN-LAST:event_selectRootComboBoxComponentResized

    private void renameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameMenuItemActionPerformed
        renameDialog.setSize(366, 129);
        renameDialog.setLocationRelativeTo(this);
        renameDialog.setVisible(true);
        renameTextField.setText(absolutePath);
    }//GEN-LAST:event_renameMenuItemActionPerformed

    private void createDocumentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDocumentButtonActionPerformed
        CreateDocumentController createDocument = new CreateDocumentController();
        createDocument.createDoc(absolutePath, documentNameTextField.getText(), (String) documentTypeComboBox.getSelectedItem());
        createDocumentDialog.dispose();
        tree.updateUI();
        update_Table();
    }//GEN-LAST:event_createDocumentButtonActionPerformed

    private void createDirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDirButtonActionPerformed
        CreateFolderController create = new CreateFolderController();
        create.createFolder(absolutePath, dirNameTextField.getText());
        createFolderDialog.dispose();
        tree.updateUI();
        update_Table();
    }//GEN-LAST:event_createDirButtonActionPerformed

    private void renameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameButtonActionPerformed
        RenameController rename = new RenameController();
        newName = renameTextField.getText();
        rename.renameFile(absolutePath, newName);
        renameDialog.dispose();
        tree.updateUI();
        update_Table();
    }//GEN-LAST:event_renameButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        //(new Thread(new SearchDao())).start();
        // (new Thread(new ReverseSearchDao())).start();
        SearchController searchFile = new SearchController();
        File path = new File(absolutePath);
        searchWord = searchTextField.getText();
        searchFile.searchFile(path, searchWord, displaySearchTextArea, searchForComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_searchButtonActionPerformed

    private void treeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeMouseReleased
        if (evt.isPopupTrigger()) {

            //Select the row with the click
            int row = tree.getClosestRowForLocation(evt.getX(), evt.getY());
            tree.setSelectionRow(row);

            //Get the path based in wich coordinates we released the button
            TreePath path = tree.getPathForLocation(evt.getX(), evt.getY());

            //Specify the area around the selected path of the tree
            Rectangle pathBounds = tree.getUI().getPathBounds(tree, path);

            //If you click on a path POPUPMENU appears
            if (pathBounds != null && pathBounds.contains(evt.getX(), evt.getY())) {
                popupMenu.show(this, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_treeMouseReleased

    private void propertiesPopupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertiesPopupMenuItemActionPerformed
        propertiesDialog.setVisible(true);
        propertiesDialog.setResizable(false);
        propertiesDialog.setSize(300, 400);
        propertiesDialog.setLocationRelativeTo(this);
    }//GEN-LAST:event_propertiesPopupMenuItemActionPerformed

    private void openPopupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openPopupMenuItemActionPerformed
        OpenFileController open = new OpenFileController();
        open.openFile(absolutePath);
    }//GEN-LAST:event_openPopupMenuItemActionPerformed

    private void filePathTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filePathTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tree.setModel(new MyTreeModel(new File(filePathTextField.getText())));
        }
    }//GEN-LAST:event_filePathTextFieldKeyPressed

    private void cmdPopupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPopupMenuItemActionPerformed
        CmdController starteCmd = new CmdController();
        starteCmd.openCMD();
    }//GEN-LAST:event_cmdPopupMenuItemActionPerformed

    private void helpjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpjMenuItemActionPerformed
        OpenHelpController getHelp = new OpenHelpController();
        getHelp.help(HelpPage);
    }//GEN-LAST:event_helpjMenuItemActionPerformed

    private void displaySearchTextAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displaySearchTextAreaMouseReleased
        PathToGo = displaySearchTextArea.getSelectedText();
        if (evt.isPopupTrigger()) {
            searchGoPopupMenu.show(displaySearchTextArea, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_displaySearchTextAreaMouseReleased

    private void GoToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToActionPerformed
        if (PathToGo != null) {
            tree.setModel(new MyTreeModel(new File(PathToGo)));
        }
    }//GEN-LAST:event_GoToActionPerformed

    private void renamePopupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renamePopupMenuItemActionPerformed
        renameDialog.setSize(366, 129);
        renameDialog.setLocationRelativeTo(this);
        renameDialog.setVisible(true);
        renameTextField.setText(absolutePath);
    }//GEN-LAST:event_renamePopupMenuItemActionPerformed

    private void copyPopupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyPopupMenuItemActionPerformed
        copypath = absolutePath;
        cutpath = "";
    }//GEN-LAST:event_copyPopupMenuItemActionPerformed

    private void cutPopupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutPopupMenuItemActionPerformed
        cutpath = absolutePath;
        copypath = "";
    }//GEN-LAST:event_cutPopupMenuItemActionPerformed

    private void searchPopupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPopupMenuItemActionPerformed
        searchDialog.setSize(600, 340);
        searchDialog.setLocationRelativeTo(this);
        searchDialog.setVisible(true);
    }//GEN-LAST:event_searchPopupMenuItemActionPerformed

    private void copyTablePopupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTablePopupMenuItemActionPerformed
        int row = ShowTable.getSelectedRow();
        String tablePath = tree.getSelectionPath().toString().replaceAll("[\\[\\]]", "").replace(", ", "\\") + "\\" + ShowTable.getModel().getValueAt(row, 0).toString();
        copypath = tablePath;
        cutpath = "";
    }//GEN-LAST:event_copyTablePopupMenuItemActionPerformed

    private void pastePopupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastePopupMenuItemActionPerformed
        CutOrCopyController decide = new CutOrCopyController();
        decide.doCutOrCopy(cutpath, copypath, absolutePath);
        tree.updateUI();
        update_Table();
    }//GEN-LAST:event_pastePopupMenuItemActionPerformed

    private void cutTablePopupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutTablePopupMenuItemActionPerformed
        int row = ShowTable.getSelectedRow();
        String tablePath = tree.getSelectionPath().toString().replaceAll("[\\[\\]]", "").replace(", ", "\\") + "\\" + ShowTable.getModel().getValueAt(row, 0).toString();
        cutpath = tablePath;
        copypath = "";
    }//GEN-LAST:event_cutTablePopupMenuItemActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    }//GEN-LAST:event_formMouseMoved

    private void openTablePopupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openTablePopupMenuItemActionPerformed
        int row = ShowTable.getSelectedRow();
        String tablePath = tree.getSelectionPath().toString().replaceAll("[\\[\\]]", "").replace(", ", "\\") + "\\" + ShowTable.getModel().getValueAt(row, 0).toString();
        OpenFileController open = new OpenFileController();
        open.openFile(tablePath);
    }//GEN-LAST:event_openTablePopupMenuItemActionPerformed

    private void pasteTablePopupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteTablePopupMenuItemActionPerformed
        int row = ShowTable.getSelectedRow();
        String tablePath = tree.getSelectionPath().toString().replaceAll("[\\[\\]]", "").replace(", ", "\\") + "\\" + ShowTable.getModel().getValueAt(row, 0).toString();
        CutOrCopyController decide = new CutOrCopyController();
        decide.doCutOrCopy(cutpath, copypath, tablePath);
        update_Table();
        tree.updateUI();
    }//GEN-LAST:event_pasteTablePopupMenuItemActionPerformed

    private void ShowTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowTableMouseReleased

        if (evt.isPopupTrigger()) {

            Point p = evt.getPoint();
            int row = ShowTable.rowAtPoint(p);
            int col = ShowTable.columnAtPoint(p);
            ShowTable.setRowSelectionInterval(col, row);
            if (row != -1 && col == 0) {
                tablePopupMenu.show(ShowTable, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_ShowTableMouseReleased

    private void UndoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoButtonActionPerformed
        UndoController undo = new UndoController();
        undo.doUndo();
        tree.updateUI();
    }//GEN-LAST:event_UndoButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        File file = new File(System.getProperty("user.home") + "\\Desktop" + "\\Junk");
        if (file.exists()) {
            try {
                FileUtils.deleteDirectory(file);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void UndoButtonComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_UndoButtonComponentResized
        UndoButton.setSize(40, 46);
    }//GEN-LAST:event_UndoButtonComponentResized

    private void RedoButtonComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_RedoButtonComponentResized
        RedoButton.setSize(40, 46);
    }//GEN-LAST:event_RedoButtonComponentResized

    private void RedoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedoButtonActionPerformed
        RedoController redo = new RedoController();
        redo.doRedo();
        tree.updateUI();
    }//GEN-LAST:event_RedoButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
//
//                Runnable t2 = new Thread2();
//                new Thread(t2).start();

                try {
                    UIManager.setLookAndFeel(
                            UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(FileManagerForm.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

                new FileManagerForm()
                        .setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GoTo;
    private javax.swing.JButton RedoButton;
    private javax.swing.JTable ShowTable;
    private javax.swing.JButton UndoButton;
    private javax.swing.JMenu ViewMenu;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem cmdPopupMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem copyPopupMenuItem;
    private javax.swing.JMenuItem copyTablePopupMenuItem;
    private javax.swing.JButton createDirButton;
    private javax.swing.JButton createDocumentButton;
    private javax.swing.JDialog createDocumentDialog;
    private javax.swing.JMenuItem createDocumentMenuItem;
    private javax.swing.JLabel createDocumentPathLabel;
    private javax.swing.JDialog createFolderDialog;
    private javax.swing.JMenuItem createFolderMenuItem;
    private javax.swing.JLabel createFolderPathLabel;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem cutPopupMenuItem;
    private javax.swing.JMenuItem cutTablePopupMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JTextField dirNameTextField;
    private javax.swing.JTextArea displaySearchTextArea;
    private javax.swing.JTextField documentNameTextField;
    private javax.swing.JComboBox documentTypeComboBox;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuBar fileManagerMenuBar;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JTextField filePathTextField;
    private javax.swing.JButton goToButton;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem helpjMenuItem;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem openPopupMenuItem;
    private javax.swing.JMenuItem openTablePopupMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem pastePopupMenuItem;
    private javax.swing.JMenuItem pasteTablePopupMenuItem;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JDialog propertiesDialog;
    private javax.swing.JMenuItem propertiesPopupMenuItem;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton renameButton;
    private javax.swing.JDialog renameDialog;
    private javax.swing.JMenuItem renameMenuItem;
    private javax.swing.JMenuItem renamePopupMenuItem;
    private javax.swing.JTextField renameTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JDialog searchDialog;
    private javax.swing.JComboBox searchForComboBox;
    private javax.swing.JPopupMenu searchGoPopupMenu;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JMenuItem searchMenuItem;
    private javax.swing.JMenuItem searchPopupMenuItem;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JComboBox selectRootComboBox;
    private javax.swing.JPopupMenu tablePopupMenu;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables
}
