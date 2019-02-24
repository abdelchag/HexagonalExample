package org.abdel.ports.rightSidePorts;

import org.abdel.pojo.Produit;

/**
 * Created by ABDELCHAG on 24/02/2019.
 */
public interface IManageProduit {

    Produit createProduit(Produit produit);

    Produit updateProduit(Produit produit);

    Produit deleteProduitById(Long idProduit);

}
