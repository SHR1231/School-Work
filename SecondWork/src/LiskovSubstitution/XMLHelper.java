package LiskovSubstitution;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * 这个类主要是为了从配置文件获取加密类的类名
 * 
 * 
 * */
public class XMLHelper {

    public XMLHelper() {
         
    }
    public String getClassName()
    {
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder=null;
        try
        {
            builder=factory.newDocumentBuilder();
        }catch(ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        Document document=null;
        try {
            document=builder.parse("G:\\\\eclipse\\\\eclipse\\\\resource\\\\Worker\\\\src\\\\LiskovSubstitution/LSP.xml");//配置文件在项目目录下 加载配置文件
        }catch (SAXException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        NodeList nList=document.getElementsByTagName("EncryptionClassName");
        return nList.item(0).getFirstChild().getNodeValue();//获取到节点值
    }
}
