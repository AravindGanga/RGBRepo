public class ConsDemo5
{
	int a = 10; //non-static variable 
	ConsDemo5()
	{
		System.out.println("construccot of ConsDemo5");
		int a=15; //now the 'int a' is the local variable to the constructor 
	}
	public static void main(String [] args){
		System.out.println("Main method starts");
		ConsDemo5 c1 = new ConsDemo5();
		System.out.println(c1.a);
		System.out.println("Done");
	}
}
