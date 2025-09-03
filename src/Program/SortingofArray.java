package Program;

public class SortingofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,6,2,4,9,10,3};
		int temp;
		for(int i=0;i<a.length;i++)  //a[i]=7
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];   
					a[i]=a[j];   
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}		

	}

}
