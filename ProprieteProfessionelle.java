package tp8;

public class ProprieteProfessionelle extends Propriété {
	private int nbEmp;
	private boolean estEtat;
	public ProprieteProfessionelle(int id, Personne resp, String ad, double surf, int nbEmp, boolean estEtat) {
		super(id, resp, ad, surf);
		this.nbEmp = nbEmp;
		this.estEtat = estEtat;
	}
	
	public String toString() {
		return super.toString()+"ProprieteProfessionelle nbEmp=" + nbEmp + ", estEtat=" + estEtat+"la valeur des impôts est "+this.calculImpot() ;
	}
	
	public double calculImpot()
	{
		if(!estEtat)
		{
			return (this.surf /100)*100+30*nbEmp;
		}
		else {
			return 0;
		}
	}
	

}
