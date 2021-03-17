package DependenceInversion;

public class Main {
	private AbstractSource source=null;
    private AbstractTransformer transformer=null;
    private XMLHelper hepler=null;
    public Main() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
         hepler=new XMLHelper();
         String classNames=hepler.getSourceTransferClassName();
         String[]res= classNames.split(" ");	//�ӷ��ص������зֱ��ҵ�sourceName��transformerName
          source=(AbstractSource)Class.forName(res[0]).newInstance() ;
         transformer=(AbstractTransformer)Class.forName(res[1]).newInstance();
         transformer.transformerData(source);
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
         
       new Main();
    }
}
