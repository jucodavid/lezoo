
public interface Chenille {
	public void faireCalin();
	public void faireLechouille();
	public void faireLeBeau();
	public static void dormir() {
		System.out.println("Je dors sur le canapé du salon !");
	}
	default void empathie() {
		System.out.println("Je perçois les émotion de mon maître !");
	}
}
