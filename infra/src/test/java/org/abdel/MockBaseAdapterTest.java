package org.abdel;

import org.abdel.adapters.MockBaseAdapter;
import org.abdel.pojo.Produit;
import org.abdel.ports.rightSidePorts.IManageProduit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by ABDELCHAG on 24/02/2019.
 */
public class MockBaseAdapterTest {

    IManageProduit produitManager;

    @BeforeEach
    public void init(){
        produitManager = new MockBaseAdapter();
    }

    @Test
    public void createProduitOK(){
        Produit produit = new Produit();
        produit.setDesignation("Toto");
        produit.setPrix(2000);
        produit.setQuantite(20);

        this.produitManager.createProduit(produit);
    }

    public static void main(String[] args) {

        IManageProduit produitManager = new MockBaseAdapter();
        Produit produit = new Produit();
        produit.setDesignation("Toto");
        produit.setPrix(2000);
        produit.setQuantite(20);

        produitManager.createProduit(produit);
    }


}
