package tp8;

public interface GestionPropriete {
	public static final int MaxProp=100 ;
	
	abstract public void afficherPropriétés();
	public boolean ajouter(Propriété p);
	public boolean supprimer(Propriété p);

}
