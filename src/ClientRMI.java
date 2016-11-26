import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import org.banque.entities.Compte;
import org.banque.rmi.BanqueRMIRemote;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ClientRMI {
	/*public static void main(String[] args)
	{
		try {
			BanqueRMIRemote proxy = (BanqueRMIRemote) Naming.lookup("rmi://localhost:1099/BK");
			Compte cp = proxy.getCompte("CC4");
			System.out.println(cp.getSolde());
			System.out.println(cp.getDateCreation());
			System.out.println(cp.getClient());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	public static void main(String[] args)
	{
		String cryptedPassword = new BCryptPasswordEncoder().encode("123456789");
		System.out.println(cryptedPassword);

	}

}
