package com.mycompany.day6;
//Citi -> 4000$ per month ->Done 
//BOFA -> 4100$ PER month 
//Infy -> 4500$ per month 
// do not do the processing of the income tax if the name length is less than 5 chars 
// if name is less then 5 chars then raise an Exception called NameTooSmallException 

class CitiException extends Exception{
	String msg; 
	
	CitiException(){
		this.msg = "Citi Exception Called without msg";
	}
	
	CitiException(String msg){
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "CitiException [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {
		return "::::::" + this.msg +"::::::";
	}
}





public class UserDefException {

	public static void checkIncome(String empName, int salary, String companyName)
		throws CitiException{
		if(companyName.equals("citi") && salary < 4000){
			
			throw new CitiException("Sorry Mr/Ms/Mrs:" +empName 
					+" you Income is not processed, for salary" + salary);
			
		}else if(companyName.equals("citi")&& salary>=4000){
			System.out.println("Your Income tax is getting processed Mr/Ms/Mrs: "
					+ empName +", your claimed salary is " + salary);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkIncome("H", 3500, "citi");
		} catch (CitiException e) {
			e.printStackTrace();
		}
	}
}


















