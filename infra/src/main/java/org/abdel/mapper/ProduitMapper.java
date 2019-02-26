package org.abdel.mapper;

import org.abdel.entities.Produit;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ABDELCHAG on 24/02/2019.
 */
public class ProduitMapper {

    private static Mapper mapper;

    static {
        mapper = new DozerBeanMapper();
    }

    public static Produit mapProduit(org.abdel.pojo.Produit produit){
        return mapper.map(produit, Produit.class);
    }

    public static org.abdel.pojo.Produit entiteToPojo(Produit produit){
        return mapper.map(produit, org.abdel.pojo.Produit.class);
    }

    public static List<org.abdel.pojo.Produit> listEntiteToListPojo(List<Produit> produit){
        List<org.abdel.pojo.Produit> retour = new ArrayList<>();
        produit.forEach(p -> retour.add(entiteToPojo(p)));
        return retour;
    }



}
