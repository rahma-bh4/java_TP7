package tp8;

public class Appartement extends ProprietePrivée {
	private int numEt;

	public Appartement(int id, Personne resp, String ad, double surf, int nbPiece, int numEt) {
		super(id, resp, ad, surf, nbPiece);
		this.numEt = numEt;
	}

	
	public String toString() {
		return super.toString()+"Appartement numEt=" + numEt+"la valeur des impôts est "+this.calculImpot()  ;
	}

	
	

}
