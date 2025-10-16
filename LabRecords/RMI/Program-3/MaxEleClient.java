import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.*;
import java.util.Scanner;

public class MaxEleClient {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        try {
            Registry reg = LocateRegistry.getRegistry(8000);
			
            MaxEleInterface temp = (MaxEleInterface) reg.lookup("maxele");
			
			System.out.println("Client is accessing....");
		
            System.out.print("Enter the size of an array: ");
            int n = sc.nextInt();
			int num[] = new int[n];

            System.out.print("Enter  " + n + " elements: ");
			for(int i=0; i<num.length;i++){
				num[i]=sc.nextInt();
			}
			
			int max = temp.findMax(num);
			System.out.println("The maximum element among the given array is: " +max);		
        } 
		catch (Exception e) {
            System.out.println(e.getMessage());}
    }
}

