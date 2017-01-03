/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.xml.transformer;
import java.io.*;
import java.util.*;
import javax.swing.table.*;

// XML-related imports
import javax.xml.transform.ErrorListener;
import javax.xml.transform.SourceLocator;
import javax.xml.transform.TransformerException;
import org.json.JSONException;

/**
 *
 * @author Рита
 */

/**
 * A JTable data model that provides detail information about a list
 * of javax.xml.transform.TransformerException objects.
 */
public class ErrorListenerTable extends AbstractTableModel
        implements ErrorListener {

    // column positions in the table
    private static final int MESSAGE_COL = 0;
    private static final int EXCEPTION_COL = 1;
    private static final int CAUSE_COL = 3;

    private static final String[] COLUMN_NAMES = {
        "Message",
        "Exception",
        "Cause"
    };

    // the actual data
    private List exceptionList = null;

    /**
     * @return a detailed text report of the exception at the specified row.
     */
    public String getDetailReport(int row) {
        if (this.exceptionList == null
                || row < 0 || row >= this.exceptionList.size()) {
            return "";
        }

        TransformerException te = (TransformerException)
                this.exceptionList.get(row);

        // buffer the report
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        pw.println(te.getClass().getName());
        pw.println("Message            : " + te.getMessage());
        pw.println("Exception          : " + te.getException());
        
        if (te.getException() != null) {
            te.getException().printStackTrace(pw);
        }

        pw.println("Cause              : " + te.getCause());
        if (te.getCause() != null && (te.getCause() != te.getException())) {
            te.getCause().printStackTrace(pw);
        }

        return sw.toString();
    }

    /**
     * Part of the TableModel interface.
     */
    public Object getValueAt(int row, int column) {
        if (this.exceptionList == null) {
            return "No errors or warnings";
        } else {
            TransformerException te = (TransformerException)
                    this.exceptionList.get(row);
            SourceLocator loc = te.getLocator();

            switch (column) {
            case MESSAGE_COL:
                return te.getMessage();
            case EXCEPTION_COL:
                return te.getException();
            case CAUSE_COL:
                return te.getCause();
            default:
                return "[error]"; // shouldn't happen
            }
        }
    }

    /**
     * Part of the TableModel interface.
     */
    public int getRowCount() {
        return (this.exceptionList == null) ? 1 :
                this.exceptionList.size();
    }

    /**
     * Part of the TableModel interface.
     */
    public int getColumnCount() {
        return (this.exceptionList == null) ? 1 :
                COLUMN_NAMES.length;
    }

    /**
     * Part of the TableModel interface.
     */
    public String getColumnName(int column) {
        return (this.exceptionList == null)
                ?  "HTML transformation problems"
                : COLUMN_NAMES[column];
    }

    /**
     * @return true if any errors occurred.
     */
    public boolean hasErrors() {
        return this.exceptionList != null;
    }

    /**
     * This is part of the javax.xml.transform.ErrorListener interface.
     * Indicates that a warning occurred. Transformers are required to
     * continue processing after warnings, unless the error listener
     * throws TransformerException.
     */
    public void warning(TransformerException te) throws TransformerException {
        report(te);
    }

    /**
     * This is part of the javax.xml.transform.ErrorListener interface.
     * Indicates that a recoverable error occurred.
     */
    public void error(TransformerException te) throws TransformerException {
        report(te);
    }

    /**
     * This is part of the javax.xml.transform.ErrorListener interface.
     * Indicates that a non-recoverable error occurred.
     */
    public void fatalError(TransformerException te) throws TransformerException {
        report(te);
    }
    
    public void fatalError(IOException te) throws TransformerException {
        report(te);
    }
    
    public void fatalError(JSONException te) throws TransformerException {
        report(te);
    }

    // adds the exception to exceptionList and notifies the JTable that
    // the content of the table has changed.
    private void report(Exception te) {
        if (this.exceptionList == null) {
            this.exceptionList = new ArrayList();
            this.exceptionList.add(te);
            fireTableStructureChanged();
        } else {
            this.exceptionList.add(te);
            int row = this.exceptionList.size()-1;
            super.fireTableRowsInserted(row, row);
        }
    }   
}
