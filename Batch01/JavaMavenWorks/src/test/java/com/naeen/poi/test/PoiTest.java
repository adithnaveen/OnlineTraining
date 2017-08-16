package com.naeen.poi.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.naveen.poi.ApachePOIExcelRead;

@RunWith(Parameterized.class)
public class PoiTest {
	private List<Object> objects; 
	private static String fileName= "C:/Training Material/TempFiles/MyFirstExcel.xlsx";
	
	@Parameterized.Parameters
	public static List<List<Object>> excelValues(){
		 return new ApachePOIExcelRead().getExcelContent(fileName);
	 }
	
	public PoiTest(List<Object> objects){
		this.objects = objects;
	}
	
	@Test
	public void test() {

		System.out.println(objects);
		
	}

}
