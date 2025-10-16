import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
public class FactSumImpl extends UnicastRemoteObject implements FactSumInter
{
	public FactSumImpl() throws RemoteException
	{
		super();
	}
	public int sumFact(int num) throws RemoteException{
		int rem=0,sum=0,fact;
		while(num>0)
		{
			rem=num%10;
			if(rem==0)
				fact=0;
			else
				fact=1;
			for(int i=2;i<=rem;i++)
				fact=fact*i;
			sum+=fact;
			num=num/10;
		}
		return sum;
	}
}
