/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.xml.transformer;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

/**
 *
 * @author Рита
 */
/**
* Used with JFileChooser to only show files ending with .xml or .XML(.xslt or .XSLT).
 */
public class FileDialog {
    public String openFileSelectDialog(String ext, MainWindow parent) {
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select " + ext.toUpperCase() + " File");
        
        FileFilter fileFilter = new FileFilter(ext);
        fileChooser.setFileFilter(fileFilter);
        int retVal = fileChooser.showOpenDialog(parent);
    
        return retVal == JFileChooser.APPROVE_OPTION ? 
                fileChooser.getSelectedFile().getAbsolutePath() : "";
    }
    
    public class FileFilter extends javax.swing.filechooser.FileFilter  {
        String fileExt;
        
        public FileFilter(String ext){
            fileExt = ext;
        }
        
        @Override
        public boolean accept(File f) 
        {
            String name = f.getName( );
            return f.isDirectory( ) || name.endsWith(fileExt.toLowerCase()) 
                                    || name.endsWith(fileExt.toUpperCase());
        }

        @Override
        public String getDescription( ) 
        {
            return fileExt.toUpperCase() + " Files";
        }
    }
}
