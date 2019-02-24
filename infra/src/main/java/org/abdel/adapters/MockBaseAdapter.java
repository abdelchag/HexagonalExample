package org.abdel.adapters;

import org.abdel.database.ListOfProduits;
import org.abdel.mapper.ProduitMapper;
import org.abdel.pojo.Produit;
import org.abdel.ports.rightSidePorts.IGetProduit;
import org.abdel.ports.rightSidePorts.IManageProduit;

import java.util.List;

/**
 * Created by ABDELCHAG on 24/02/2019.
 */
public class MockBaseAdapter implements IGetProduit, IManageProduit {

    private ListOfProduits database;

    public MockBaseAdapter(){
        database = new ListOfProduits();
    }

    public Produit createProduit(Produit produit) {
        org.abdel.entities.Produit entitieProd = ProduitMapper.mapProduit(produit);
        if(database.exist(entitieProd)){
            System.out.println("ERROR");
        }
        database.insert(entitieProd);
        return produit;
    }

    public Produit updateProduit(Produit produit) {
        return null;
    }

    public Produit deleteProduitById(Long idProduit) {
        return null;
    }

    public Produit getProduitById(Long idProduit) {
        return null;
    }

    public Produit getProduitByDesign(String design) {
        return null;
    }

    public List<Produit> getAllProduit() {
        return null;
    }
}
