package q2;

public class qqq {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		 System.out.println();
		
		MyArray obj = new MyArray(arr);
		
		System.out.println("the array size is "+obj.getSize(arr));
		System.out.println("the maximum number in the array is "+obj.max(arr));
		System.out.println("the minimum number in the array is "+obj.min(arr));
		System.out.println("the average of the array elements is "+obj.average(arr));
		
		obj.printArray(arr);
		
		
	}

}
