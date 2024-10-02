package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	/*@BeforeSuite -- setup system property for chrome -- I
      @BeforeTest -- launchBrowser -- II
      @BeforeClass -- login to gp -- III

      @BeforeMethod -- enter URL -- 4
      @Test -- google logo test
      @AfterMethod -- logout from gpp

      @BeforeMethod -- enter URL
      @Test --- Google Title Test
      @AfterMethod -- logout from gpp.

      @BeforeMethod -- enter URL
      @Test -- search test
      @AfterMethod -- logout from gpp

      @AfterClass -- Close Browser
      @AfterTest -- deleteAllCookies  */
	
	//Pre-conditions annotations --starting with Before
	@BeforeSuite
	public void setup() {
		System.out.println("setup system property for chrome");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("login to app");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launchBrowser");
	}
	/*
	* @BeforeMethod
	* @Test -1
	* @AfterMethod

	* @BeforeMethod
	* @Test -2
	* @AfterMethod

	* @BeforeMethos
	* @Test -3
	* @AfterMethod */
	
    @BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}
    
    //test cases--starting with @Test
    @Test(priority=2,groups="Title")
    public void googleTitleTest() {
    	System.out.println("Google Title Test");
    }
    @Test(priority=1,groups="Title")
    public void searchTest() {
    	System.out.println("search test");
    }
    @Test(priority=3,groups="Test")
    public void test1() {
    	System.out.println("test1");
    }
    @Test(priority=4,groups="Test")
    public void test2() {
    	System.out.println("test2");
    }
    //post conditions- starting with After
    @AfterMethod
    public void logout() {
    	System.out.println("logout from app");
    }
    @AfterTest
    public void deleteAllcookies() {
    	System.out.println("deleteAllcookies");
    }
    @AfterClass
    public void closeBrowser() {
    	System.out.println("closeBrowser");
    }
    @AfterSuite
    public void generateTestReport() {
    	System.out.println("generateTestReport");
    	
    }
    
    
    
    
    
}
