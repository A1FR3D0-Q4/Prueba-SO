package com.winium.DeskoptAutomatico;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class CalculadoraDesktop {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesktopOptions opciones = new DesktopOptions();
		
		opciones.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),opciones);
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("Nueve")).click();
		
		driver.findElement(By.name("Multiplicar por")).click();
		
		driver.findElement(By.name("Seis")).click();

		

	}

}
