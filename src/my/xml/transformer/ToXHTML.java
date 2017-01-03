/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.xml.transformer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Рита
 */
public class ToXHTML {
    /*
    we have a <meta> tag in the header that isn't closed which 
    is valid in HTML but not XHTML. We need to close those, <meta ... />
    */
    public String TryGetXHTML(String html)
    {
        int index1 = html.indexOf("<meta");
        int index2 = html.indexOf(">", index1);
        String part1 = html.substring(0, index2 + 1);
        return part1 + "</meta>" + html.substring(index2 + 1, html.length());
    }  
}
