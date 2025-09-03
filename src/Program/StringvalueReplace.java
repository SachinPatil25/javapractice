package Program;

public class StringvalueReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*String str="tomorrow";
	String output=str.replace('o', '3');
	System.out.println(output);*/

	     String input = "tomorrow";  // The input word

	        // Convert the input string to a character array
	        char[] chars = input.toCharArray();

	        // Loop through the character array and replace 'o' with '3'
	        for (int i = 0; i < chars.length; i++)
	        {
	            if (chars[i] == 'o') 
	            {
	                chars[i] = '3';  // Replace 'o' with '3'
	            }
	        }

	        // Convert the character array back to a string
	        String output = new String(chars);

	        // Output the transformed word
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output);
	    }
		
}
