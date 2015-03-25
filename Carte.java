package Examen;

public class Carte {
	// les attributs=============================
	private int valeur;
	private String couleur;
	private int force;
	private String face;

	// le constructeur====================================
	public Carte(int valeur) {
		this.valeur =valeur; 
	}

	// constructeur sans parametre==========================
	public Carte() {
		setValeur ((int)(Math.random()*52+1));
	}

	// set et get========================================
	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(int valeur) {
		if(valeur>=1 && valeur <=13){
		couleur="coeur";
		}
		else if(valeur>=14 && valeur <=26){
		couleur="carreau";	
		}
		else if(valeur>=27 && valeur <=39){
		couleur="trefle";
		}
		else if(valeur>=40 && valeur <=52){
		couleur="pique";
		}
		this.couleur = couleur;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int valeur) {
		force=valeur/4+2;
		this.force = force;
	}

	

	public String toString(int force) {
		String message="";
		
		if  (force==11){
			message="Valet";
			}
			else if (force==12){
			message="Dame";
			}
			else if (force==13){
			message="Roi";
			}
			else if (force==14){
			message="As";
			}
			else if (force<11){
			message=" " + force;
			}
		return message;
	}	
}
	
