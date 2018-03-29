package com.sdet.basics.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	LoginTest01.class, 
	SampleTest02.class
})
public class MyBusinessSuite {
}
