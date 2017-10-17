package com.mycompany.assignment1;
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

class BOFAException extends Exception{
	String msg; 
	
	BOFAException(){
		this.msg = "BOFA  Exception Called without msg";
	}
	
	BOFAException(String msg){
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "BOFA  [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {
		return "::::::" + this.msg +"::::::";
	}
}

class NameTooSmallException extends Exception{
	String msg; 
	
	NameTooSmallException(){
		this.msg = "Sorry the name given is too small";
	}
	
	NameTooSmallException(String msg){
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "NameTooSmall [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {
		return "::::::" + this.msg +"::::::";
	}
}


public class UserDefException {

	public static void checkIncome(String empName, int salary, String companyName)
		throws CitiException, NameTooSmallException, BOFAException{
		if(empName.length()<5){
			throw new NameTooSmallException();
			
		}
		if(companyName.equals("citi") && salary < 4000){
			
			throw new CitiException("Sorry Mr/Ms/Mrs:" +empName 
					+" you Income is not processed, for salary" + salary);
			
		}if(companyName.equals("bofa") && salary < 4500){
			
			throw new BOFAException("Sorry Mr/Ms/Mrs:" +empName 
					+" you Income is not processed, for salary" + salary);
			
		}else if(companyName.equals("citi")&& salary>=4000){
			System.out.println("Your Income tax is getting processed Mr/Ms/Mrs: "
					+ empName +", your claimed salary is " + salary);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkIncome("Harry Potter", 3500, "bofa");
		} catch (CitiException e) {
			e.printStackTrace();
		} catch(NameTooSmallException ntse){
			ntse.printStackTrace();
		} catch(BOFAException bofae){
			System.out.println(bofae.getMessage());
		}
	}
}


















