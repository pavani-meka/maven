package com.LoginApp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
	@Test
	public void test1()
	{
		LoginProgram l=new LoginProgram();
		Assert.assertEquals(0, l.checkLogin("pavani", "pavani@27"));
	}
	@Test
	public void test2()
	{
		LoginProgram l=new LoginProgram();
		Assert.assertEquals(1, l.checkLogin("pavani", "pavani27"));
	}
}
