package LiskovSubstitution;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * �������Ҫ��Ϊ�˴������ļ���ȡ�����������
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
            document=builder.parse("G:\\\\eclipse\\\\eclipse\\\\resource\\\\Worker\\\\src\\\\LiskovSubstitution/LSP.xml");//�����ļ�����ĿĿ¼�� ���������ļ�
        }catch (SAXException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        NodeList nList=document.getElementsByTagName("EncryptionClassName");
        return nList.item(0).getFirstChild().getNodeValue();//��ȡ���ڵ�ֵ
    }
}
