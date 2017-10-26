import java.lang.String;
import java.util.Vector;

public class Test_Ascii {

	public static void main(String[] args) 
	{
		String start = "NO, THIS IS PATRICK!!!!";
		String cipher = "";
		String plain = "";
		char[] key;
		
		
		key = Ascii_Vigner_Cipher.createKey(start);
		System.out.println(key.toString());
		
		cipher = Ascii_Vigner_Cipher.encrypt(key, start);
		
		plain = Ascii_Vigner_Cipher.decrypt(key, cipher);
		
		System.out.println(start);
		System.out.println(cipher);
		System.out.println(plain);
	}

}
