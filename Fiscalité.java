package tp8;

public class Fiscalité {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1= new Personne(11464772,"Daklaoui","Rihem");
        Personne p2= new Personne(11679239,"Ben Hassine","Rahma");
        Personne p3= new Personne(12387862,"Khemiri","Cheima");

        Lotissement lotissement= new Lotissement(10);

        lotissement.ajouter(new ProprietePrivée(1, p1, "Corniche", 350, 4));
        lotissement.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
        lotissement.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 3));
        lotissement.ajouter(new ProprieteProfessionelle(4, p3, "Korba", 1000, 50, true));
        lotissement.ajouter(new ProprieteProfessionelle(5, p1, "Bir Bouragba", 2500, 400, false));
     

        lotissement.afficherPropriétés();
        
        System.out.println("Nombre des pieces: "+lotissement.getnbPièces());
        
                double min=lotissement.tabProp[0].calculImpot() ;
         Personne prop=lotissement.tabProp[0].getResp();
         for(int i=0;i<lotissement.nb;i++)
         {
        	 if(lotissement.tabProp[i] instanceof ProprietePrivée )
        	 {
        		 if(min>lotissement.tabProp[i].calculImpot())
        		 {
        			 min=lotissement.tabProp[i].calculImpot();
        			 prop=lotissement.tabProp[i].getResp();
        		 }
        	 }
         }
         System.out.println("le minimun d'impot est "+min+"de propriétére :"+prop);
         
         Propriété ap1 = new Appartement(3, p2, "Hammamet", 1200, 8, 3);

	    lotissement.supprimer(ap1);
	    System.out.println("Apres la supression");
	    lotissement.afficherPropriétés();
	    
	    Lotissement lt=new LotissementPrivée(10);
	    lt.ajouter(ap1);
	    System.out.println(lt.getpropriétéByIndex(0));
	    System.out.println("Nombre des pieces: "+lt.getnbPièces());
	    
	
	
	
	
	}
}
