package tp8;

public class Villa extends ProprietePrivée{
	private boolean Pisc;
	
	
	public Villa(int id, Personne resp, String ad, double surf, int nbPiece, boolean pisc) {
		super(id, resp, ad, surf, nbPiece);
		Pisc = pisc;
	}

	public double calculImpot()
	{
		if(Pisc==true)
		{
			return super.calculImpot()+200;
		}
		else {
			return super.calculImpot();
		}
	}
	
	public String toString() {
		return super.toString()+"Villa Pisc=" + Pisc +"la valeur des impôts est "+this.calculImpot() ;
	}


	
	

}
