package com.company;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;

public class alerts {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("==========");// chrome me link enter kro
        d.findElement(By.id("====")).click(); // jha alert aana h us button ki id
        Alert al= d.switchTo().alert();// alert pr jane k liye switch object
        String alertMessage =d.switchTo().alert().getText();// alert msg get krne k liye
        System.out.println(alertMessage);// message print
        al.accept();// alert accept krne k liye

        // popup ke liye=========
        //============================
        d.findElement(By.id("=========")).click();// popup buttton ki id
        Robot r= new Robot();// object for mouse movement
        r.mouseMove(400,5);// mouse will move 400 x axis and 5 y axis i.e. reached on red cross
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);// mouse button will be pressed by mouse release method as below
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        d.quit().nevigate.hello;//ye add kiya h bhai
        d.;//ye add kiya h bhai new
        d.navigate();// ye add kiya h bhai

}}
