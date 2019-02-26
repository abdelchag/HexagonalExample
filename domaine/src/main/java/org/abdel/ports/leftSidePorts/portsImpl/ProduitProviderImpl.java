package org.abdel.ports.leftSidePorts.portsImpl;

import org.abdel.ports.leftSidePorts.IProvideProduit;
import org.abdel.pojo.Produit;
import org.abdel.ports.rightSidePorts.IGetProduit;

import java.util.List;

/**
 * Created by ABDELCHAG on 24/02/2019.
 */
public class ProduitProviderImpl implements IProvideProduit {

    private IGetProduit produitGetter;

    ProduitProviderImpl(IGetProduit produitGetter){
        this.produitGetter = produitGetter;
    }


    public Produit provideProduitById(Long idProduit) {
        return this.produitGetter.getProduitById(idProduit);
    }

    public Produit provideProduitByDesign(String design) {
        return this.produitGetter.getProduitByDesign(design);
    }

    public List<Produit> provideAllProduit() {
        return this.produitGetter.getAllProduit();
    }
}
