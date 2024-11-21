package tp8;

public class Lotissement implements GestionPropriete{

	protected Propriété[] tabProp;
	protected int nb;
	
	public Lotissement(int cap)
	{
		tabProp=new Propriété[cap];
		
	}
	public Propriété getpropriétéByIndex(int i)
	{
		return tabProp[i];
	}
	public int getnbPièces()
	{
		int s=0;
		for(int i=0;i<nb;i++)
		{
		if(tabProp[i] instanceof ProprietePrivée)
		{
			s=s + ((ProprietePrivée)tabProp[i]).nbPiece;
		}
	}
		return s;
		
	}
	
	public void afficherPropriétés()
	{
		for(int i=0;i<nb;i++) {
		System.out.println(tabProp[i]);
	}}
	public boolean ajouter(Propriété p)
	{
		if(nb<MaxProp) {
		tabProp[nb]=p;
		nb++;
		return true;}
		else {
			return false;
		}
		
	}
	
	public boolean supprimer(Propriété p)
	{
		int i=0;
		while(i<nb && tabProp[i].Id!=p.Id)
		{
			i++;
		}
		if(i==nb)
		{
			return false;
		}
		else {
			for(int j=i;j<nb-1;j++)
			{
				tabProp[j]=tabProp[j+1];
			}
			nb--;
			return true;
			
		}
	}
	
	
}
