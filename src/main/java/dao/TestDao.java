package dao;

import java.util.List;

import produit.entities.Produit;

public class TestDao {

	public static void main(String[] args) {
		
		
		ProduitDaoImpl dao= new ProduitDaoImpl();
		
	    Produit p1=dao.save(new Produit("YEBDQHD", 900, 33));
	    Produit p2=dao.save(new Produit("EPSILON", 970, 53));
		
	    
	    System.out.println("Chercher des produits");
	    List<Produit> prods=dao.produitsParMC("%H%");
	    
	    for(Produit p :prods) {
	    	System.out.println(p.toString());
	    }
	    
		
		
		

	}

}
