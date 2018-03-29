package com.sdettraining.day02;

public class ArrayEx02 {
	public static void main(String[] args) {
		Employee [] employees = new Employee[3];
		
		// this will call garbage collection 
		Runtime.getRuntime().gc(); 
		
		employees[0] = new Employee(101, "Aswini", 6000, "aswini@gmail.com");
		employees[1] = new Employee(102, "Harry", 4545, "harry@gmail.com");
		employees[2] = new Employee(103, "Kumar", 3434, "kumar@gmail.com");
		
		/*employees[0] = new Employee();
		employees[1] = new Employee();
		employees[2] = new Employee();


		employees[0].setEmpId(101);
		employees[0].setEmpName("Aswini");
		employees[0].setEmpSal(6000);
		employees[0].setEmail("aswini@yahoo.com");
		
		employees[1].setEmpId(102);
		employees[1].setEmpName("Harry");
		employees[1].setEmpSal(4500);
		employees[1].setEmail("harry@gmail.com");

		employees[2].setEmpId(103);
		employees[2].setEmpName("Kumar");
		employees[2].setEmpSal(3444);
		employees[2].setEmail("kumar@gmail.com");*/

		System.out.println("----------first way ----------------");

		// way 1 
		for(int i=0; i<employees.length; i++){
			System.out.println(
						employees[i].getEmpId() +", " +
						employees[i].getEmpName() +", " + 
						employees[i].getEmpSal() +", " + 
						employees[i].getEmail()
						);
		}
		System.out.println("------------second way --------------");
		
		for(Employee temp : employees){
			System.out.println(temp.getEmpId() +", " + 
							   temp.getEmpName() +", " + 
							   temp.getEmpSal() + ", " + 
							   temp.getEmail());
		}
		
		System.out.println("---------------third way-----------------");
		for(Employee temp : employees){
			System.out.println(temp); // temp.toString() 
 		}
		
		
	}
}
