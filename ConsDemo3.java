/*NOTE: constructor does't load in the object it just created and outside the object and perform the logic and terminate
 * Some ware in the instance 
 * 
 */
public class ConsDemo3
	{
		ConsDemo3()// This is constructor with same as class name ConsDemo1 and it has no return type
		{
			System.out.println("Constructor ConsDemo3 called ");
		}
		public static void main(String[] args) 
		{
			//new ConsDemo1();
			System.out.println("Main method statrs");
			ConsDemo3 d1 = new ConsDemo3(); // When we create an object to the class the the constructor called automatically because of new ConsDemo3();[RHS]
			System.out.println("Done");

		}
	}
