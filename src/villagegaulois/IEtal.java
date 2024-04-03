package villagegaulois;
import personnages.Gaulois;
import Produit.*;
public interface IEtal {
	
	boolean isEtalOccupe();

	Gaulois getVendeur();

	int getQuantite();

	P getProduit();

	void occuperEtal(Gaulois vendeur, P produit, int quantite);

	boolean contientProduit(String produit);

	int acheterProduit(int quantiteAcheter);

	void libererEtal();
}