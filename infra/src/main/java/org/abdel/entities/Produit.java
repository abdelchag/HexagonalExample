package org.abdel.entities;

/**
 * Created by ABDELCHAG on 24/02/2019.
 */
public class Produit implements Comparable {

    private Long id;

    private String designation;

    private Integer prix;

    private Integer quantite;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Produit prod2 = (Produit) obj;
        if(this.getId() == null || prod2.getId() == null){
            return this.getDesignation().equals(prod2.getDesignation());
        }
        return this.getId().equals(prod2.getId());
    }

    public int compareTo(Object obj) {
        Produit prod2 = (Produit) obj;
        if(this.getId() == null){
            return -1;
        }else if(prod2.getId() == null){
            return 1;
        }

        return this.getId().compareTo(prod2.getId());
    }
}
