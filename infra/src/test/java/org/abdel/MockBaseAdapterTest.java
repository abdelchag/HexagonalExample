package org.abdel;

import org.abdel.adapters.MockBaseAdapter;
import org.abdel.pojo.Produit;
import org.abdel.ports.rightSidePorts.IGetProduit;
import org.abdel.ports.rightSidePorts.IManageProduit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Created by ABDELCHAG on 24/02/2019.
 */
public class MockBaseAdapterTest {

    IManageProduit produitManager;

    IGetProduit produitGetter;

    @BeforeEach
    public void init(){
        produitManager = new MockBaseAdapter();
        produitGetter = (MockBaseAdapter) produitManager;
    }

    @Test
    public void createProduitOK() throws Exception{
        Produit produit = new Produit();
        produit.setDesignation("Toto");
        produit.setPrix(2000);
        produit.setQuantite(20);
        this.produitManager.createProduit(produit);
    }

    @Test
    public void createProduitKO() throws Exception{
        Produit produit = new Produit();
        produit.setDesignation("Toto");
        produit.setPrix(2000);
        produit.setQuantite(20);
        this.produitManager.createProduit(produit);
        Exception thrown = Assertions.assertThrows(Exception.class,
                () -> this.produitManager.createProduit(produit));
        Assertions.assertTrue(thrown.getMessage().contains("FOUND"));
    }

    @Test
    public void getAllProduitOK() throws Exception{
        Produit produit = new Produit();
        produit.setDesignation("Toto");
        produit.setPrix(2000);
        produit.setQuantite(20);
        this.produitManager.createProduit(produit);
        produit.setDesignation("TOTO2");
        this.produitManager.createProduit(produit);

        List<Produit> list = this.produitGetter.getAllProduit();

        Assertions.assertEquals(2, list.size());
    }

}
