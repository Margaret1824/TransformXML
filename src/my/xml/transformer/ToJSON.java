/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.xml.transformer;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author Рита
 */
public class ToJSON {
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    
    public String TryGetJSON(String xmlFileName) {
        JSONObject jobj = null;
        try
        {
            String xml = new String(Files.readAllBytes(Paths.get(xmlFileName)));
            jobj = new XML().toJSONObject(xml);
        }
        catch(JSONException jexcp){   
        }
        catch(IOException ioexcp){   
        }
        
        return jobj.toString(PRETTY_PRINT_INDENT_FACTOR);
    }
}
