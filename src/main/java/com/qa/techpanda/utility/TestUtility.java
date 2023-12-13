package com.qa.techpanda.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.techpanda.Base.TestBase;

public class TestUtility extends TestBase{
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	
	public void takeScreenShots(String name)
	{
		File ts=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination="D:\\JavaWorkshop\\NewLiveProject1\\Screenshots"+name+".png";
		try {
			FileUtils.copyFile(ts, new File(destination));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void windowHandleing()
	{
		
	}

}
