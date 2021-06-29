package locators;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class calculator {
	 @Test(dataProvider = "dp", groups= {"addition"})
	  public void add(Integer n, Integer s) {
		  System.out.println("\n Additon is "+ (n+s));
	  }

	  @Test(dataProvider = "dp", groups= {"addition", "substr"} , priority=2)
	  public void sub(Integer i, Integer i1)
	  {
		  System.out.println("\n Substraction " + (i-i1));
		  
	  }
	  
	  @Test(dataProvider ="dp", groups={"Multi"}, priority=3)
	  public void multiplication(Integer a, Integer b)
	  {
		  System.out.println("\n Multiplication is " +(a*b));
	  }
	 @Test(dataProvider ="dp", groups={"Div", "addiotion", "multi"}, priority=4)
	  public void divi(Integer a, Integer b){
		  System.out.println("Division is " +(a/b));
	  }
	  
	  @DataProvider
	  public Object[][] dp() {
		  Object [] [] a= new Object [1][2];
		  
		  a[0][0]=4 ;
		  a[0][1]=2;
		  
		  return a;
	   
	  }
 
}
