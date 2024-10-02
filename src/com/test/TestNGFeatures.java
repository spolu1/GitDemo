package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test
	public void LoginTest() {
		System.out.println("LoginTest");
		//int i = 9/0;
		
	}
	@Test(dependsOnMethods="LoginTest")
	public void HomePage() {
		System.out.println("HomePage");
	
}
	@Test
	public void SearhcPage() {
		System.out.println("SearhcPage");
}
	@Test(dependsOnMethods="LoginTest")
	public void RegPageTest() {
		System.out.println("RegPageTest");

}
}


