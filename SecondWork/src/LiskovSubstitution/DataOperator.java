package LiskovSubstitution;

public class DataOperator {
	private  CipherA cipher =null;//������
    public DataOperator() {
        
    }
    public void setCipherA(CipherA cipherA)
    {
        this.cipher =cipherA;
    }
    public String encrypt(String plainText)
    {
        return cipher.encrypt(plainText);
    }
}
