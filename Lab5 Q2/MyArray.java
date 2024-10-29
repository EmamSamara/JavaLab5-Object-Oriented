package q2;

public class MyArray {

	int arr[];
	
	
	public MyArray (int array[]) {
		arr=array;
	}
	
	public static int min(int arr[]) {
	int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		return min;
	}
	
	public static int max(int arr[]) {
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		
		
		
		return max;
	}
	 public static double average(int arr[]) {
		 int sum=0;
		 double avg;
		 for(int i=0;i<arr.length;i++) {
			 sum =sum+arr[i];
		 }
		 avg=sum/arr.length;
		return avg;
	}
	
	public void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
	public static int getSize(int arr[]) {
		return arr.length;
	}
	
}
