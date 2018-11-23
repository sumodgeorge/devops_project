package simplilearn.devops_proj;

import simplilearn.devops_proj.NumberWordConv;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class NumberWordConvTests 
    extends TestCase
{
    
	public void test1 () {
    	int input = 1;
    	String output = NumberWordConv.convert(input);
    	Assert.assertEquals("One", output);	
    }
	
	public void test20 () {
		int input = 20;
		String output = NumberWordConv.convert(input);
		Assert.assertEquals("Twenty", output);
	}
	
	public void test99 () {
		int input = 99;
		String output = NumberWordConv.convert(input);
		Assert.assertEquals("Ninety Nine", output);	
	}
	
	public void test396 () {
		int input = 396;
		String output = NumberWordConv.convert(input);
		Assert.assertEquals("Three Hundred Ninety Six", output);	
	}
	
	
	public void test4852 () {
		int input = 4852;
		String output = NumberWordConv.convert(input);
		Assert.assertEquals("Four Thousand Eight Hundred Fifty Two", output);	
	}
	
	
}
