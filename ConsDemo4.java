/*lets see constructor and  non-static members in the below program
 * how to use non-static variables and the constructor 
 * NOTE: when constructor called, the local variable inside the constructor is updated 
 */
public class ConsDemo4 
{
	int a = 10; //non-static variable 
	ConsDemo4()
	{
		System.out.println("construccot of ConsDemo4");
		a=15; //variable value update JVM will assign the value to global variable as these are with the same name 
	}
	public static void main(String [] args){
		System.out.println("Main method starts");
		ConsDemo4 c1 = new ConsDemo4();
		System.out.println(c1.a);
		System.out.println("Done");
	}
	
//gopal 
}
