/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.xml.transformer;
import javax.swing.*;
import java.io.File;
import java.io.StringWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Рита
 */
public class ToHTML {
    
    public Document TryGetHTML(String xmlFileName, String xslFileName, 
            ErrorListenerTable errlst, JTabbedPane tpane, JScrollPane spane){
        
        StringWriter sw = new StringWriter();
        try 
        {
            File xmlFile = new File(xmlFileName);
            File xslFile = new File(xslFileName);

            TransformerFactory transFact = TransformerFactory.newInstance( );
            // register the table model as an error listener
            transFact.setErrorListener(errlst);

            Transformer trans = transFact.newTransformer(new StreamSource(xslFile));
            trans.transform(new StreamSource(xmlFile), new StreamResult(sw));
        }
        catch (TransformerConfigurationException tce) 
        {
            try 
            {
                errlst.fatalError(tce);
            } 
            catch(TransformerException ignored) {}
        } 
        catch (TransformerException te) 
        {
            try 
            {
                errlst.fatalError(te);
            } 
            catch (TransformerException ignored) {}
        } 
        catch (Exception unexpected) 
        {
            System.err.println("The XSLT processor threw an unexpected exception");
        }
        
        // show the error tab
        if (errlst.hasErrors()) 
        {
            tpane.setSelectedComponent(spane);
        }
         
        String html = sw.toString();
        // use for more pleasant formatting
        Document doc = Jsoup.parse(html);
        return doc;
    }   
}
