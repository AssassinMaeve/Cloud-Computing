import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FactSumInter extends Remote
{
	public int sumFact(int num) throws RemoteException;
}
