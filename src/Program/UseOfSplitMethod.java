package Program;

public class UseOfSplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java,c,SQL,Selenium,Testing";
		String[] s=str.split(",");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}

	}

}
