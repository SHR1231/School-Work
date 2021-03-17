package DependenceInversion;

public class XLSTransformer extends AbstractTransformer{
	public XLSTransformer() {         
    }
    @Override
        public   void transformerData(AbstractSource source) 
        {
            System.out.println("XLSTransformer×ª»»ÁË->"+source.getData());
        }

}
