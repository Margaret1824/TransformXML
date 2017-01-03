/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.xml.transformer;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Рита
 */
public class MainWindow extends javax.swing.JFrame {

    String xmlFP = "", xslFP = "", xhtmlFP = "", 
            html = "", json = "", xhtml = "";
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorListenerTable = new my.xml.transformer.ErrorListenerTable();
        tabbedPane = new javax.swing.JTabbedPane();
        HTMLtab = new javax.swing.JScrollPane();
        HTMLTxtPane = new javax.swing.JTextPane();
        XHTMLtab = new javax.swing.JScrollPane();
        XHTMLTxtPane = new javax.swing.JTextPane();
        JSONTab = new javax.swing.JScrollPane();
        JSONTxtPane = new javax.swing.JTextPane();
        JTreeTab = new javax.swing.JPanel();
        JTreePane = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        fileDialogPanel = new javax.swing.JPanel();
        xmlFilePath = new javax.swing.JTextField();
        xslFilePath = new javax.swing.JTextField();
        selectXMLBtn = new javax.swing.JButton();
        selectXSLBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        exportFilesLabel = new javax.swing.JLabel();
        selectFilesLabel = new javax.swing.JLabel();
        toHTMLBtn = new javax.swing.JButton();
        toJSONBtn = new javax.swing.JButton();
        toPDFBtn = new javax.swing.JButton();
        toXHTMLBtn = new javax.swing.JButton();
        transformBtn = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        fileDialogLabel = new javax.swing.JLabel();
        ErrorPane = new javax.swing.JScrollPane();
        errorTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My XML Transformer");
        setBackground(getBackground());
        setForeground(java.awt.Color.lightGray);
        setIconImage(new ImageIcon("xmlico.png").getImage());
        setLocation(new java.awt.Point(300, 300));
        setName("My XML Transformer"); // NOI18N
        setResizable(false);

        tabbedPane.setAutoscrolls(true);
        tabbedPane.setName("tabbedPane"); // NOI18N

        HTMLTxtPane.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        HTMLTxtPane.setAutoscrolls(false);
        HTMLtab.setViewportView(HTMLTxtPane);
        HTMLTxtPane.getAccessibleContext().setAccessibleDescription("");

        tabbedPane.addTab("HTML", HTMLtab);

        XHTMLTxtPane.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        XHTMLtab.setViewportView(XHTMLTxtPane);

        tabbedPane.addTab("XHTML", XHTMLtab);

        JSONTxtPane.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        JSONTab.setViewportView(JSONTxtPane);

        tabbedPane.addTab("JSON", JSONTab);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("empty");
        jTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree.setAutoscrolls(true);
        jTree.setCellRenderer(null);
        jTree.setEditable(true);
        jTree.setExpandsSelectedPaths(false);
        jTree.setFocusable(false);
        jTree.setRequestFocusEnabled(false);
        jTree.setScrollsOnExpand(false);
        jTree.setSelectionModel(null);
        jTree.setVerifyInputWhenFocusTarget(false);
        JTreePane.setViewportView(jTree);

        javax.swing.GroupLayout JTreeTabLayout = new javax.swing.GroupLayout(JTreeTab);
        JTreeTab.setLayout(JTreeTabLayout);
        JTreeTabLayout.setHorizontalGroup(
            JTreeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTreePane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );
        JTreeTabLayout.setVerticalGroup(
            JTreeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTreePane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        tabbedPane.addTab("JTREE", JTreeTab);

        fileDialogPanel.setFocusable(false);

        xmlFilePath.setEditable(false);
        xmlFilePath.setBackground(new java.awt.Color(255, 255, 255));
        xmlFilePath.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        xmlFilePath.setAutoscrolls(false);
        xmlFilePath.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        xmlFilePath.setFocusable(false);

        xslFilePath.setEditable(false);
        xslFilePath.setBackground(new java.awt.Color(255, 255, 255));
        xslFilePath.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        xslFilePath.setFocusable(false);

        selectXMLBtn.setText("Select XML");
        selectXMLBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectXMLBtnActionPerformed(evt);
            }
        });

        selectXSLBtn.setText("Select XSL");
        selectXSLBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectXSLBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear all");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        exportFilesLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        exportFilesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exportFilesLabel.setText("And export to HTML, XHTML, JSON, PDF");

        selectFilesLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        selectFilesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectFilesLabel.setText("Select XML & XSL files for start");

        toHTMLBtn.setText("to HTML");
        toHTMLBtn.setEnabled(false);
        toHTMLBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toHTMLBtnActionPerformed(evt);
            }
        });

        toJSONBtn.setText("to JSON");
        toJSONBtn.setEnabled(false);
        toJSONBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toJSONBtnActionPerformed(evt);
            }
        });

        toPDFBtn.setText("to PDF");
        toPDFBtn.setToolTipText("Get XHTML!");
        toPDFBtn.setEnabled(false);
        toPDFBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toPDFBtnActionPerformed(evt);
            }
        });

        toXHTMLBtn.setText("to XHTML");
        toXHTMLBtn.setEnabled(false);
        toXHTMLBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toXHTMLBtnActionPerformed(evt);
            }
        });

        transformBtn.setText("Transform");
        transformBtn.setEnabled(false);
        transformBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transformBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fileDialogPanelLayout = new javax.swing.GroupLayout(fileDialogPanel);
        fileDialogPanel.setLayout(fileDialogPanelLayout);
        fileDialogPanelLayout.setHorizontalGroup(
            fileDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fileDialogPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fileDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fileDialogPanelLayout.createSequentialGroup()
                        .addComponent(toHTMLBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toXHTMLBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toJSONBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toPDFBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(fileDialogPanelLayout.createSequentialGroup()
                        .addGroup(fileDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(transformBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fileDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(xmlFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                .addComponent(xslFilePath)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fileDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectXMLBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectXSLBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(fileDialogPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(selectFilesLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fileDialogPanelLayout.createSequentialGroup()
                .addGroup(fileDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fileDialogPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(exportFilesLabel))
                    .addGroup(fileDialogPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        fileDialogPanelLayout.setVerticalGroup(
            fileDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fileDialogPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectFilesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fileDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xmlFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectXMLBtn))
                .addGap(12, 12, 12)
                .addGroup(fileDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xslFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectXSLBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fileDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn)
                    .addComponent(transformBtn))
                .addGap(1, 1, 1)
                .addComponent(exportFilesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fileDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toPDFBtn)
                    .addComponent(toHTMLBtn)
                    .addComponent(toJSONBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toXHTMLBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );

        fileDialogLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/xml/transformer/xml_layot.png"))); // NOI18N
        fileDialogLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        fileDialogLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        fileDialogLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        errorTable.setModel(errorListenerTable);
        errorTable.setEnabled(false);
        errorTable.setName("ErrorTable"); // NOI18N
        errorTable.setOpaque(false);
        ErrorPane.setViewportView(errorTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ErrorPane))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fileDialogPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(fileDialogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fileDialogPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fileDialogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ErrorPane, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbedPane.getAccessibleContext().setAccessibleName("HTMLtab");

        getAccessibleContext().setAccessibleName("MainWindow");
        getAccessibleContext().setAccessibleDescription("MainWindow");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String saveFile(String ext, String file) {
        String fullpath = new FileDialog().openFileSelectDialog(ext, this) + "." + ext;
        
        try {
            Files.write(Paths.get(fullpath), file.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fullpath;
    }
    
    private void toXHTMLBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toXHTMLBtnActionPerformed
        xhtmlFP = saveFile("xhtml", xhtml);
        this.toPDFBtn.setEnabled(true);
    }//GEN-LAST:event_toXHTMLBtnActionPerformed

    //Use iText library for PDF transform
    private void toPDFBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toPDFBtnActionPerformed
        String newPDFFP = new FileDialog().openFileSelectDialog("pdf", this);

        Document document = new Document();
        PdfWriter writer;
        try {
            writer = PdfWriter.getInstance(document, new FileOutputStream(newPDFFP + ".pdf"));
            document.open();
            XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream(xhtmlFP));
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        document.close();
    }//GEN-LAST:event_toPDFBtnActionPerformed

    private void toJSONBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toJSONBtnActionPerformed
        saveFile("json", json);
    }//GEN-LAST:event_toJSONBtnActionPerformed

    private void toHTMLBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toHTMLBtnActionPerformed
        saveFile("html", html);
    }//GEN-LAST:event_toHTMLBtnActionPerformed

    private void clearFlds(){
        this.xmlFilePath.setText("");
        this.xslFilePath.setText("");
        xmlFP = xslFP = "";   
    }
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearFlds();
        setActiveTransformBtns(false);
        this.toPDFBtn.setEnabled(false);
        this.HTMLTxtPane.setText("");
        this.XHTMLTxtPane.setText("");
        this.JSONTxtPane.setText("");
        this.jTree.setModel(null);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void selectXSLBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectXSLBtnActionPerformed
        xslFP = new FileDialog().openFileSelectDialog("xsl", this);

        if(!"".equals(xslFP)){
            this.xslFilePath.setText(xslFP);
            if(!"".equals(xmlFP))
                this.transformBtn.setEnabled(true);
        }
    }//GEN-LAST:event_selectXSLBtnActionPerformed

    private void selectXMLBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectXMLBtnActionPerformed
        xmlFP = new FileDialog().openFileSelectDialog("xml", this);

        if(!"".equals(xmlFP)){
            this.xmlFilePath.setText(xmlFP);
            if(!"".equals(xslFP))
                this.transformBtn.setEnabled(true);
        }
    }//GEN-LAST:event_selectXMLBtnActionPerformed

    private void transformBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transformBtnActionPerformed
        // get and show the results
        html = new ToHTML().TryGetHTML(xmlFP, xslFP,
            this.errorListenerTable, this.tabbedPane,
            this.ErrorPane).toString();

        json = new ToJSON().TryGetJSON(xmlFP);
        xhtml = new ToXHTML().TryGetXHTML(html);

        this.HTMLTxtPane.setText(html);
        this.JSONTxtPane.setText(json);
        this.XHTMLTxtPane.setText(xhtml);

        JTreeParser parser = new JTreeParser();
        this.jTree.setModel(parser.parse(xmlFP));
        
        setActiveTransformBtns(true);
        this.transformBtn.setEnabled(false);
        clearFlds();
    }//GEN-LAST:event_transformBtnActionPerformed
        
    private void setActiveTransformBtns(boolean mode)
    {
        this.toHTMLBtn.setEnabled(mode);
        this.toJSONBtn.setEnabled(mode);
        this.toXHTMLBtn.setEnabled(mode);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ErrorPane;
    private javax.swing.JTextPane HTMLTxtPane;
    private javax.swing.JScrollPane HTMLtab;
    private javax.swing.JScrollPane JSONTab;
    private javax.swing.JTextPane JSONTxtPane;
    private javax.swing.JScrollPane JTreePane;
    private javax.swing.JPanel JTreeTab;
    private javax.swing.JTextPane XHTMLTxtPane;
    private javax.swing.JScrollPane XHTMLtab;
    private javax.swing.JButton clearBtn;
    private my.xml.transformer.ErrorListenerTable errorListenerTable;
    private javax.swing.JTable errorTable;
    private javax.swing.JLabel exportFilesLabel;
    private javax.swing.JLabel fileDialogLabel;
    private javax.swing.JPanel fileDialogPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel selectFilesLabel;
    private javax.swing.JButton selectXMLBtn;
    private javax.swing.JButton selectXSLBtn;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JButton toHTMLBtn;
    private javax.swing.JButton toJSONBtn;
    private javax.swing.JButton toPDFBtn;
    private javax.swing.JButton toXHTMLBtn;
    private javax.swing.JButton transformBtn;
    private javax.swing.JTextField xmlFilePath;
    private javax.swing.JTextField xslFilePath;
    // End of variables declaration//GEN-END:variables
}