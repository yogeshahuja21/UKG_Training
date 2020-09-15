package Lab1;

public class ques4 {
	public static int[] copyOf(int[] array)
	{
		int [] newarray=new int[array.length];
		int i=0;
		for(int element:array)
		{
			newarray[i++]=element;
		}
		return newarray;
	}
	
	public static void print(int [] array)
	{
		System.out.print("Copied Array is : ");
		for(int element:array)
		{
			System.out.print(element+" ");
		}
	}
	public static void main(String[] args) {
		int [] arr= {1,3,5,8,3};
		int [] newarr=copyOf(arr);
		
		print(newarr);
		
	}

}
