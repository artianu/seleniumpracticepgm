package com.webTestingWebElementScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver= new EdgeDriver();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver.get("https://www.google.com");
		
		WebElement el1=Driver.findElement(By.id("APjFqb"));
		el1.sendKeys("japan");
		List<WebElement> alloption=Driver.findElements(By.xpath("(//ul[@class='G43f7e']//li)"));
		
		System.out.println(alloption.size());
		for(WebElement i:alloption)
		{
		
			System.out.println(i.getText());
		}

	}

}
