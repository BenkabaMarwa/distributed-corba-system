package Servant;

import corbaBanque.Compte;
import corbaBanque.IBanqueRemotePOA;

public class BanqueServiceImpl extends IBanqueRemotePOA {

	@Override
	public double conversion(double mt) {
		return mt*270;
	}

	@Override
	public Compte getCompte(int code) {
		return new Compte(code,Math.random()*7000);
	}

}
