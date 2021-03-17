package DependenceInversion;

public class XMLTransformer extends AbstractTransformer{
	public XMLTransformer() {     
    }
    @Override
    public   void transformerData(AbstractSource source)
    {
        System.out.println("XMLTransformer×ª»»ÁË->"+source.getData());
    }
}
