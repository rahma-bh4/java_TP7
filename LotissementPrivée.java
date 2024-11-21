package tp8;

public class LotissementPrivée extends Lotissement {

	public LotissementPrivée(int cap) {
		super(cap);
		
	}
	
	public boolean ajouter(Propriété p)
	{
		if (p instanceof ProprietePrivée) 
        {
            return super.ajouter(p);
        } 
        else 
        {
            System.out.println("Seules les proprietes privées peuvent être ajoutées au LotissementPrivée.");
            return false;
        }
	}
	
	public ProprietePrivée getpropriétéByIndex(int i) {
        if (i>=0 && i<nb && tabProp[i] instanceof ProprietePrivée) 
        {
            return (ProprietePrivée) tabProp[i];
        } 
        else 
        {
            System.out.println("Indice invalide ou la propriete n'est pas privée.");
            return null;
        }}
	
	public int getnbPièces() 
    {
        int s = 0;
        for (int i = 0; i < nb; i++) 
        {
            if (tabProp[i] instanceof ProprietePrivée) 
            {
            	s=s + ((ProprietePrivée)tabProp[i]).nbPiece;
            }
        }
        return s;
    }

	
}
