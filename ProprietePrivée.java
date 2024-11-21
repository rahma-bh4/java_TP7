package tp8;

public class ProprietePrivée extends Propriété {
	
	protected int nbPiece;

	public ProprietePrivée(int id, Personne resp, String ad, double surf, int nbPiece) {
		super(id, resp, ad, surf);
		this.nbPiece = nbPiece;
	}

	public double calculImpot()
	{
		return (this.surf /100)*50+10*this.nbPiece;
	}
	
	public String toString() {
		return super.toString() +"ProprietePrivée nbPiece=" + nbPiece+"la valeur des impôts est "+this.calculImpot()  ;
	}
	
	
	
	
	

}
