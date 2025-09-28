import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class PrimeCheckImplement extends UnicastRemoteObject implements  PrimeCheckInterface  {
    public PrimeCheckImplement() throws RemoteException{
        super();
    }

    public boolean checkPrime(int number) throws RemoteException{
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}