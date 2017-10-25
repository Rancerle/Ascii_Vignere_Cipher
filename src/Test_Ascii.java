import java.lang.String;
import java.util.Vector;

public class Test_Ascii {

	/*public static void main(String[] args) 
	{
		for(int i = 0; i < Ascii_Vigner_Cipher.VIGNERE.length; i++)
		{
			for(int j = 0; j < Ascii_Vigner_Cipher.VIGNERE.length; j++)
			{
				System.out.print(Ascii_Vigner_Cipher.VIGNERE[i][j] + " ");
			}
			System.out.print('\n');
		}
		System.out.print(Ascii_Vigner_Cipher.VIGNERE.length);
	}*/
	
	public static void main(String[] args) 
	{
		String start = "NO, THIS IS PATRICK!!!!";
		Vector<Character> key = new Vector<Character>();
		key = Ascii_Vigner_Cipher.encode(start);
		System.out.println(key);
	}

}
