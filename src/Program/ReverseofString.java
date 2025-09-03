package Program;

public class ReverseofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "We have done";
		String output="";
		for(int i=str.length()-1;i>=0;i--)
		{
			output=output+str.charAt(i);
		}
		
		System.out.println(output);
			}

}
