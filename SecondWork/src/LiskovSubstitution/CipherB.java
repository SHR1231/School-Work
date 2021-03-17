package LiskovSubstitution;

public class CipherB extends CipherA{

    public CipherB() {
         
    }
    public String encrypt(String plainText)
    {
           //为了看到效果 此处就不再进行加密 验证是否调用了此方法
          return  "这是子类方法";
    }

}