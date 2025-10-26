import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import Servant.BanqueServiceImpl;
import javax.naming.Context;
import javax.naming.InitialContext;

public class ServeurCORBA {

	public static void main(String[] args) {

		try {
			ORB orb=ORB.init(args,null); //initialiser l'ORB
			
			Object ref_POA=orb.resolve_initial_references("RootPOA"); //récupérer la ref vers POA
			
			POA rootPOA=POAHelper.narrow(ref_POA); //Caster la ref vers un POA
			
			rootPOA.the_POAManager().activate(); //Activate le POA
			
			BanqueServiceImpl od=new BanqueServiceImpl(); //instancier l'OD
			
			Object ref_od=rootPOA.servant_to_reference(od); //récupérer la ref vers l'OD
			
			Context ctx=new InitialContext(); //initialiser l'annuaire java

			ctx.rebind("ServiceBanque",ref_od); //publier la ref de l'OD
			
			System.out.println("Server is running..");
			
			orb.run(); //lacer l'ORB
			
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
