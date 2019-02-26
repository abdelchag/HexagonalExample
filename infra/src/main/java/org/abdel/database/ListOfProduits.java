package org.abdel.database;


import org.abdel.entities.Produit;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ABDELCHAG on 24/02/2019.
 */
public class ListOfProduits {

    private Set<Produit> database;

    public ListOfProduits(){
        database = new TreeSet<Produit>();
    }

    public void insert(Produit p){
        database.add(p);
    }

    public boolean exist(Produit p){
       return database.contains(p);
    }

    public Set<Produit> getDatabase() {
        return database;
    }
}
