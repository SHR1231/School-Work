package LiskovSubstitution;

public class Main {
	    /*
	     * 主函数 调用加密算法 并输出
	     * */
	    private XMLHelper xmlHepler=null;
	    private DataOperator operator=null;
	    private CipherA cipher=null;//定义一个加密类 
	    private String testString="earn money";//测试文本
	    public Main() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	        
	        xmlHepler=new XMLHelper();
	        operator=new DataOperator();
	        cipher = (CipherA)Class.forName(xmlHepler.getClassName()).newInstance();//根据xml读取的类名 来实例化相应的对象
	        operator.setCipherA(cipher );
	    String result=    operator.encrypt(testString);
	        System.out.println(result);
	    }

	    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	         
	          new Main();
	           
	    }

	}

