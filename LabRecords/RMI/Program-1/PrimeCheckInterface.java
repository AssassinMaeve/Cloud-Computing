package LabRecords.RMI.Program1;
import java.rmi.RemoteException;
import java.rmi.Remote;


public interface PrimeCheckInterface extends Remote {
    public boolean checkPrime(int number) throws RemoteException;
}


