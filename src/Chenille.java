
public interface Chenille {
	public void faireCalin();
	public void faireLechouille();
	public void faireLeBeau();
	public static void dormir() {
		System.out.println("Je dors sur le canap� du salon !");
	}
	default void empathie() {
		System.out.println("Je per�ois les �motion de mon ma�tre !");
	}
}
