// Write a Java RMI program to accept an integer and check whether it is a Prime   

import java.rmi.registry.*;
import java.rmi.*;
import java.util.Scanner;
import Program1.PrimeCheckInterface;
public class PrimeCheckClient {
    public static void main(String[] args) {
        try{
            Registry reg = LocateRegistry.getRegistry(4000);
            PrimeCheckInterface imp = (PrimeCheckInterface) reg.lookup("PrimeCheck");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number to check if it's prime: ");
            int number = scanner.nextInt();

            if(imp.checkPrime(number)){
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }

        }catch(Exception e){
            System.out.println("Unexpected error: "+e);
         }
    }
}
