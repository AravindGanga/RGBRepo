public class ConsDemo6
{
	int a = 10; //non-static variable 
	ConsDemo6()
	{
		System.out.println("construccot of ConsDemo5");
		int i=15; //now the 'int a' is the local variable to the constructor 
		a=i;
		
	}
	public static void main(String [] args){
		System.out.println("Main method starts");
		ConsDemo6 c1 = new ConsDemo6();
		System.out.println(c1.a);
		System.out.println("Done");
	}
}
