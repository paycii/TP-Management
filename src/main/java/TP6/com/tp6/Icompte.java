package TP6.com.tp6;

import TP6.com.tp6.Exceptions.SoldeInfExce;
import TP6.com.tp6.Exceptions.SoldeInsExce;

public interface Icompte {
	public void retirer(double d) throws SoldeInsExce;
	
	public void deposer(double d) throws SoldeInfExce;
	
}
