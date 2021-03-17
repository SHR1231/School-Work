package DependenceInversion;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class XMLHelper {

    /*
     * 从xml文件读取类名
     * 
     * */
    public XMLHelper() {
         
    }
    public String  getSourceTransferClassName()
    {
        
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder=null;
        try {
            builder=factory.newDocumentBuilder();
        }catch(ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        Document document=null;
        try {
            document=builder.parse("G:\\eclipse\\eclipse\\resource\\Worker\\src\\DependenceInversion/DIP.xml");//从xml文件读取类名
        }catch(SAXException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        NodeList nList1=document.getElementsByTagName("sourceName");
        NodeList nList2=document.getElementsByTagName("transformerName");
         
        String reString=  nList1.item(0).getFirstChild().getNodeValue()+" "+ nList2.item(0).getFirstChild().getNodeValue();
        return reString;
    }
}
