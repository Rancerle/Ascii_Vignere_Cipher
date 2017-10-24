
public class Test_Ascii {

	public static void main(String[] args) 
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
	}

}
