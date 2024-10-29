package q3;

public class driver {

	public static void BelowAverage(city arr[], int temp) {
		System.out.println("the Cities that it's tempreture is under "+temp + " is "); 
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i].getTemperature()<temp) {
				arr[i].printCityInfo();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {

		city arr[]=new city[4];
		arr[0] = new city("Ramallah", 22, 11, 24) ;
		arr[1] = new city("Tulkarem", 22, 11, 27) ;
		arr[2] = new city("Jerusalem", 22, 11, 21) ;
		arr[3] = new city("Gaza", 22, 11, 22) ;

		
		BelowAverage(arr, 24);
	}

}
