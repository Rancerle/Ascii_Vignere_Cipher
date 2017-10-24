
public class Test_Ascii {

	public static void main(String[] args) 
	{
		for(int i = 0; i < 92; i++)
		{
			for(int j = 0; j < 92; j++)
			{
				System.out.print(Ascii_Vigner_Cipher.VIGNERE[i][j] + " ");
			}
			System.out.print('\n');
		}

	}

}
