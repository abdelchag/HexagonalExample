package org.abdel.mapper;

import org.abdel.entities.Produit;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

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

}
