package tp8;

public abstract class Propriété {
	protected int Id;
	protected Personne resp;
	protected String ad;
	protected double surf;
	
	public Propriété(int id, Personne resp, String ad, double surf) {
		
		Id = id;
		this.resp = resp;
		this.ad = ad;
		this.surf = surf;
	}
	@Override
	public String toString() {
		return "Propriété son Id est " + Id + ", son responsable est " + resp + ", adresse:" + ad + ", surface:" + surf ;
	}
	
	abstract public double calculImpot();
	public Personne getResp() {
		return resp;
	}
	public void setResp(Personne resp) {
		this.resp = resp;
	}
	
	
	
	

}
