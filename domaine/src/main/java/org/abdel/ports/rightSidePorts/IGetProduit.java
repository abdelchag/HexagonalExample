package org.abdel.ports.rightSidePorts;

import org.abdel.pojo.Produit;

import java.util.List;

/**
 * Created by ABDELCHAG on 23/02/2019.
 */
public interface IGetProduit {

    Produit getProduitById(Long idProduit);

    Produit getProduitByDesign(String design);

    List<Produit> getAllProduit();

}
