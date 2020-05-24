
public class Chien extends Canin implements Chenille {
	
	public Chien() {
		
	}
	
	public Chien(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}
	
	void crier() {
		System.out.println("J'aboie sans raison !");
	}
	
	public void faireCalin() {
		System.out.println("Gros calin et pas canin ( ;");
	}
	
	public void faireLechouille() {
		System.out.println("SLURP !");
	}
	
	public void faireLeBeau() {
		System.out.println("I'm a boss !");
	}
}
