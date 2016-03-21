public class Personne {
	private String nom;
	private String prenom;
	private int age;
	
	public Personne(String n, String p, int a) {
		// dans repriseMaster
		System.out.println("Ajout dans le projet initial");
		nom = n;
		prenom = p;
		age = a;
	}
	
	@Override public String toString() {
		return nom+ " " + prenom;
	}
}
