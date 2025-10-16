
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MaxEleInterface extends Remote {
   public int findMax(int num[]) throws RemoteException;
}

