package org.abdel.ports.leftSidePorts;

import org.abdel.pojo.Produit;

import java.util.List;

/**
 * Created by ABDELCHAG on 24/02/2019.
 */
public interface IProvideProduit {

    Produit provideProduitById(Long idProduit);

    Produit provideProduitByDesign(String design);

    List<Produit> provideAllProduit();

}
