package q3;


public class city {

	private String cityName;
	private double longitude;
	private double latitude;
	private int temperature;
	
	public  city(String newName, double newLongitude,double newLatitude,int newTempreture) {
		cityName=newName;
		longitude=newLongitude;
		latitude=newLatitude ;
		temperature=newTempreture;
	}
	

	
	
	public  String getCityName() {
		return cityName;
	}
	public void setCityName(String CityName) {
		this.cityName=CityName;
	}
	
	
	
	public  double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude=longitude;
	}
	
	
	
	
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude=latitude;
	}
	
	
	
   public int getTemperature() {
	return temperature; 
    }
   public void setTemperature(int temp) {
	this.temperature=temp;
    }
   
   
   
   public void printCityInfo() {
	  
	
	System.out.println("City name is "+cityName + 
			 " longitude "+longitude+" latitude "
		+latitude + " temperature "+ temperature);

}
   
   
   
   
   
   
   
	
}
