package TP6.com.tp6;

import TP6.com.tp6.Exceptions.SoldeInfExce;
import TP6.com.tp6.Exceptions.SoldeInsExce;

public class CompteEpargne extends Compte implements Icompte {
	
	double TAUXINTERET;
	
	
	public CompteEpargne(String nom, int numerocompte, double solde) {
		super(nom, numerocompte, solde);
		TAUXINTERET= 1.5;
	}
	
	public void retirer(double d) throws SoldeInsExce {
		
		if(this.getSolde() <d) { throw new SoldeInsExce("Solde Insufisant"); }
		else {
			this.setSolde(this.getSolde()-d);
		}	
	}
	
	public void deposer(double d) throws SoldeInfExce {
		if(d <=0 ) { throw new SoldeInfExce("Solde minimal non correct");
		
		}
		else {
			this.setSolde(this.getSolde()+d);
		}
	}
	public double calculerinteret() {
		return this.solde*this.TAUXINTERET;
	}
}
