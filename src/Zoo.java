
public class Zoo {

	public static void main(String[] args) {
		Loup l = new Loup("Bleu Azur", 45);
		l.boire();
		l.manger();
		l.deplacement();
		l.crier();
		System.out.println(l.toString());
		
		Chien c = new Chien("Brun", 23);
		c.boire();
		c.manger();
		c.deplacement();
		c.crier();
		System.out.println(c.toString());
		c.faireCalin();
		c.faireLeBeau();
		c.faireLechouille();
		Chenille.dormir();
		c.empathie();
		
		Chenille r = new Chien();
		r.faireLeBeau();
		r.faireCalin();
		r.faireLechouille();
		r.empathie();
	}

}
