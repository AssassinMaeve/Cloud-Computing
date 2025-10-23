import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;
import java.util.Scanner; 

public class DelRepCharClient{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		try{
			Registry reg = LocateRegistry.getRegistry(5000); 
			DelRepCharInterface temp = (DelRepCharInterface) reg.lookup("delrepchar");
			System.out.println("Client is accessing...");
			System.out.print("\nEnter a line of text: ");

			String st = sc.nextLine(); 
			String strArray[] = st.split(" "); 

			System.out.println("\nWords after deleting repeated Characters....."); 
			for (int i = 0 ; i < strArray.length; i++){ 
				String str = strArray[i]; 
				System.out.print(temp.delRepChar(str)+" "); 
            }
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			sc.close();
		}
	}
}
