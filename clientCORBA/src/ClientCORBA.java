import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.omg.CORBA.Object;

import corbaBanque.Compte;
import corbaBanque.IBanqueRemote;
import corbaBanque.IBanqueRemoteHelper;


public class ClientCORBA {

	public static void main(String[] args) {

		try {
			Context ctx=new InitialContext(); //initialiser l'annuaire java
			
			Object ref_od=(Object)ctx.lookup("ServiceBanque"); //recuperer le ref vers OD
			
			IBanqueRemote stub=IBanqueRemoteHelper.narrow(ref_od);
			
			System.out.println("34 euro= "+stub.conversion(34)+ "DA");
		
			Compte cp=stub.getCompte(123);
			
			System.out.println("Code Compte: "+ cp.code);
			
			System.out.println("Solde: "+cp.solde);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
