package LiskovSubstitution;

public class CipherA {

    public CipherA() {
        // TODO Auto-generated constructor stub
    }
    public String encrypt(String plainText)
    {
         
        byte []a=plainText.getBytes();
        for(int i=0;i<a.length;i++)
        {
            a[i]^=8;//��ÿ���ַ�����������
            
        }
        String reString=new String(a);
        return reString ;
    }
}