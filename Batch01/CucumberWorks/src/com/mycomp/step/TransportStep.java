package com.mycomp.step;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TransportStep {

	@Given("^ive to reach office at (\\d+) in morning$")
	public void ive_to_reach_office_at_in_morning(int arg1) throws Throwable {
		System.out.println("ive to reach office at "+ arg1+" in morning>>>>");
	}

	@Then("^i may reach the office at correct time$")
	public void i_may_reach_the_office_at_correct_time() throws Throwable {
		System.out.println("i may reach the office at correct time>>>>>>");
	}

	@When("^i take out vehicle$")
	public void i_take_out_vehicle(DataTable dataTable){
		System.out.println("i take out vehicle>>>>");
		System.out.println("------------------------------");
		
		List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
		
		
		for(Map<String, String> temp: dataList){
			System.out.println("Vehicle Travelling is : "  + temp.get("vehicle"));
			System.out.println("How you move is : " + temp.get("how"));
			System.out.println("Fuel Capacity : " + temp.get("capacity"));
		}
		
		System.out.println("------------------------------");
		
	}
}
















