package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

	public static void main(String[] args) {
		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.google.com");
	}

}
