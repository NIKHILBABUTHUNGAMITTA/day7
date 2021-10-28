package NIKHILcorejavalab;
import java.util.Scanner;
public class TrafficLights 
{

	public static void main(String[] args) 
	{
  Scanner s = new Scanner(System.in);
		
		System.out.println("select one of three lights:\n"+ "1.red\n2.yellow\n3.green ");
		
		int n = s.nextInt();
		if(n==1) {
			System.out.println("Stop");
		}
		if(n==2) {
			System.out.println("Ready");
			
		}
		if(n==3) {
			System.out.println("go");
			
		}
	}

}