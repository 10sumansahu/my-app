
import java.util.Scanner;

class calculator{
	public int var1;
	public int var2;
	
	
	public calculator()
	{
		this.var1=5;
		this.var2=8;
	}
	
	public calculator(int value1, int value2)
	{
		this.var1=value1;
		this.var2=value2;
	}
	
	public int add()
	{
		int c= this.var1+this.var2;
		return c;
		
	}
	
	public int subt()
	{
		int c= this.var1-this.var2;
		return c;
		
	}
	
	public int multi()
	{
		int c= this.var1*this.var2;
		return c;
		
	}
	
	public float divide()
	{
		float c= this.var1/this.var2;
		return c;
		
	}
	
	
}
public class my_app{

	public static void main(String[] args)
	{
		Scanner sr=new Scanner(System.in);
	 System.out.println("Enter firts number:");
	 int a=sr.nextInt();
	 System.out.println("Enter second number:");
	 int b=sr.nextInt();
	 System.out.println("Enter operation(+,-,*,/ :");
	 String operation=sr.next();
	 calculator obj=new calculator(a,b);
	 
	 float c=0;
	 switch(operation)
	 {
	 case "+": c=obj.add();
	           break;
	
	 case "-": c=obj.subt();
     break;
     
	 case "*": c=obj.multi();
     break;

	 case "/": c=obj.divide();
     break;

     default: System.out.println("Invalid operation code!!!!");

	 }
    
	 System.out.printf(a + operation + b + "=" + c);
	}

	

}
