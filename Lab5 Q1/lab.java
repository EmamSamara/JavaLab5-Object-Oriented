package lab;

import java.util.Date;
public class lab {

	public static void findLargestSalary(employee arr[]) {
		
		double max=arr[0].getBasicSalary();
		String name = null;
		
		
for (int i=0;i<arr.length;i++) {
arr[i].printEmployeeInfo();;	

if(arr[i].getBasicSalary()>max) {
	max=arr[i].getBasicSalary();
	name = arr[i].getName();
}


}
	
		System.out.println("the largest salary is  "+max +"   its for "+name);
		
		
	}
	
	
	
	public static void main(String[] args) {

	employee arr[]= new employee[5];
	arr[0]=new employee(290,"Sewar",1200043,new Date(6,4,2002),new Date(15,5,1894),3500);
	arr[1]=new employee(300,"emam",1220022,new Date(25,2,2005),new Date(15,3,2000),4000);
	arr[2]=new employee(300,"emam",1220022,new Date(25,2,2005),new Date(15,3,2000),4000);
	arr[3]=new employee(300,"emam",1220022,new Date(25,2,2005),new Date(15,3,2000),4000);
	arr[4]=new employee(300,"emam",1220022,new Date(25,2,2005),new Date(15,3,2000),4000);

	
	findLargestSalary(arr);
	
	

	}

}
