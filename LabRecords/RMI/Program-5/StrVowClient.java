import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;
import java.util.Scanner; 

public class StrVowClient{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		try{
			Registry reg = LocateRegistry.getRegistry(4000); 
			StrVowInterface temp = (StrVowInterface) reg.lookup("checkvow");
			System.out.println("Client is accessing...");
			System.out.print("\nEnter a line of text: ");
			String st = sc.nextLine(); 
            
			String strArray[] = st.split(" ");

			System.out.println("\nWords With Vowels: "); 
			for (int i = 0 ; i < strArray.length; i++){ 
				String str = strArray[i]; 
				if(temp.findVow(str)) 
					System.out.println(str);} 
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			sc.close();
		}
	}
}
