package Program;

public class CharcterRepetationcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = charRepetationcount("ssuytgsjjhhs",'s');
		System.out.println(a);

	}
	
	public static int charRepetationcount(String word, char chrarcter)
	{
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==chrarcter)
			{
				count++;
			}
		}
		return count;
	}

}
