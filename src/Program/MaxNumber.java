package Program;

public class MaxNumber {

	public static void main(String[] args) {
		int a[]= {10,12,8,25,15,20};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
        System.out.println(max);
	}

}
