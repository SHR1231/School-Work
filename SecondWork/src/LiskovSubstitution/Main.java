package LiskovSubstitution;

public class Main {
	    /*
	     * ������ ���ü����㷨 �����
	     * */
	    private XMLHelper xmlHepler=null;
	    private DataOperator operator=null;
	    private CipherA cipher=null;//����һ�������� 
	    private String testString="earn money";//�����ı�
	    public Main() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	        
	        xmlHepler=new XMLHelper();
	        operator=new DataOperator();
	        cipher = (CipherA)Class.forName(xmlHepler.getClassName()).newInstance();//����xml��ȡ������ ��ʵ������Ӧ�Ķ���
	        operator.setCipherA(cipher );
	    String result=    operator.encrypt(testString);
	        System.out.println(result);
	    }

	    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	         
	          new Main();
	           
	    }

	}

