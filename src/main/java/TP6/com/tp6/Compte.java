package TP6.com.tp6;



public class Compte  {
String nom;
int numerocompte;
double solde;
public Compte(String nom, int numerocompte, double solde) {
	
	this.nom = nom;
	this.numerocompte = numerocompte;
	this.solde = solde;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getNumerocompte() {
	return numerocompte;
}
public void setNumerocompte(int numerocompte) {
	this.numerocompte = numerocompte;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}


	
}
