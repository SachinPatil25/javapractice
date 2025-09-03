package Program;

import java.util.Arrays;

public class ShiftingAllZeroBeginning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4, 5, 0, 9, 7, 0, 9, 8, 0};
		int count=0;
		// find the count of zeros
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==0)
			{
				count++;
			}
			
		}
		System.out.println(count);
		
		// shift non zero elements at last
	    int index = a.length - 1;  // Start filling from the end of the array
        for (int i = a.length - 1; i >= 0; i--) 
        {
            if (a[i] != 0)
            {
                a[index--] = a[i];  // Shift non-zero elements to the right
            }
        }
		
		for(int i=0;i<count;i++)
		{
			a[i]=0;
		}
		
		System.out.println(Arrays.toString(a));
	}

}
