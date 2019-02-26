package org.abdel.adapters;

import org.abdel.database.ListOfProduits;
import org.abdel.mapper.ProduitMapper;
import org.abdel.pojo.Produit;
import org.abdel.ports.rightSidePorts.IGetProduit;
import org.abdel.ports.rightSidePorts.IManageProduit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ABDELCHAG on 24/02/2019.
 */
public class MockBaseAdapter implements IGetProduit, IManageProduit {

    private ListOfProduits database;

    public MockBaseAdapter(){
        database = new ListOfProduits();
    }

    public Produit createProduit(Produit produit) throws Exception {
        org.abdel.entities.Produit entitieProd = ProduitMapper.mapProduit(produit);
        if(database.exist(entitieProd)){
            throw new Exception("FOUND !!");
        }
        database.insert(entitieProd);
        System.out.println("IT'S OK !!");
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
        List<org.abdel.entities.Produit> database = new ArrayList<>();
        database.addAll(this.database.getDatabase());
;        return ProduitMapper.listEntiteToListPojo(database);
    }
}
