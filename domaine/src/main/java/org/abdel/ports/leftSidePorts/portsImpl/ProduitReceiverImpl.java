package org.abdel.ports.leftSidePorts.portsImpl;

import org.abdel.pojo.Produit;
import org.abdel.ports.leftSidePorts.IProvideProduit;
import org.abdel.ports.leftSidePorts.IReceiveProduit;
import org.abdel.ports.rightSidePorts.IManageProduit;

/**
 * Created by ABDELCHAG on 24/02/2019.
 */
public class ProduitReceiverImpl implements IReceiveProduit {


    private IManageProduit produitManager;

    ProduitReceiverImpl(IManageProduit produitManager){
        this.produitManager = produitManager;
    }

    public Produit createProduit(Produit produit) throws Exception {
        return this.produitManager.createProduit(produit);
    }

    public Produit updateProduit(Produit produit) {
        return this.produitManager.updateProduit(produit);
    }

    public Produit deleteProduitById(Long idProduit) {
        return this.produitManager.deleteProduitById(idProduit);
    }
}
