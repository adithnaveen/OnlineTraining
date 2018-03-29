package com.sdettraining.day07;


class StandardChartedException extends Exception{
	String msg; 
	public StandardChartedException() {
		this.msg ="Standard Charted Exception called with no msg";
	}

	public StandardChartedException(String msg){
		this.msg = msg; 
	}
	
	@Override
	public String getMessage() {
		return this.msg; 
	}

	@Override
	public String toString() {
		return "[ " + this.msg + " ]";
	}
}

public class UserDefException {

	public static void grantLoan(String name, int loanAmount, 
				int creditScore, String bankName)
				throws CitiException, StandardChartedException{
		
		if(creditScore<450){
			if(bankName.equalsIgnoreCase("citi")){
				throw new CitiException("CITI: Sorry with less than 450 no loans for "+ name 
						+", for Amount " + loanAmount);
			}else if(bankName.equalsIgnoreCase("standard")){
				throw new StandardChartedException("SC: Sorry with less than 450"
						+ " no loans for "+ name 
						+", for Amount " + loanAmount);
			}
		}else{
			System.out.println("Loan is under process from Bank " +  
					bankName +", For " + name +", for Amount " + loanAmount);
		}
	}
	
	public static void main(String[] args) {
		try {
			grantLoan("Harry", 50000, 345, "citi");
		} catch (CitiException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (StandardChartedException e) {
			System.out.println(e);
		}
	}
}











