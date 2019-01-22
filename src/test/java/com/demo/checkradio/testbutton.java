package com.demo.checkradio;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;	

public class testbutton {

	public static void main(String[] args) {
		
		// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");					
        WebDriver driver = new ChromeDriver();					

        driver.get("http://demo.guru99.com/test/radio.html");					
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
        		
        //Radio Button1 is selected		
        radio1.click();			
        System.out.println("Radio Button Option 1 Selected");					
        		
        //Radio Button1 is de-selected and Radio Button2 is selected		
        radio2.click();			
        System.out.println("Radio Button Option 2 Selected");					
        
        
        
        //check whether the radio button 1 is toggled on
        if (radio1.isSelected()) {
        	System.out.println("radio button 1 is toggled on");
        }else {
        	System.out.println("radio button 1 is toggled off");
        }
        //check whether the radio button 2 is toggled on
        if (radio2.isSelected()) {
        	System.out.println("radio button 2 is toggled on");
        }else {
        	System.out.println("radio button 2 is toggled off");
        }
        
        
        
        // Selecting CheckBox		
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));	
        
        // This will Toggle the Check box 		
        option1.click();			

        // Check whether the Check box1 is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Checkbox1 is Toggled On");					

        } else {			
            System.out.println("Checkbox1 is Toggled Off");					
        }		
        
        
        
        
        // Selecting CheckBox2		
        WebElement option2 = driver.findElement(By.id("vfb-6-1"));							

        // This will Toggle the Check box 		
        option2.click();			

        // Check whether the Check box2 is toggled on 		
        if (option2.isSelected()) {					
            System.out.println("Checkbox2 is Toggled On");					

        } else {			
            System.out.println("Checkbox2 is Toggled Off");					
        }		
         
        
        
        /*		
        		
        //Selecting Checkbox and using isSelected Method		
        driver.get("http://demo.guru99.com/test/facebook.html");					
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }		
		//driver.close();		
        	
        */
        
    }		
}