
abstract class Animal {
	protected String couleur;
	protected int poids;
	
	protected void manger() {
		System.out.println("Je mange de la viande... MIAM");
	}
	
	protected void boire() {
		System.out.println("Je bois de l'eau... GLOU");
	}
	
	abstract void deplacement();
	
	abstract void crier();
	
	public String toString() {
		String str = "Je suis un objet de la "+this.getClass()+", je suis "+this.couleur+", je p�se "+this.poids+" Kg.";
		return str;
	}
}
