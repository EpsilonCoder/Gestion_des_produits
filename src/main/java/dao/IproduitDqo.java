package dao;

import java.util.List;

import produit.entities.Produit;

public interface IproduitDqo {
	//tres important pour retourné le meme objet creer 
	public Produit save(Produit p);
	//methode permettant de chercher qui retourn une liste
	public List<Produit> produitsParMC(String mc);
	public Produit getProduit(Long id);
	public Produit update(Produit p);
	public void deleteProduit(Long id);

}
