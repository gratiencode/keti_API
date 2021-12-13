/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eroot
 */
@XmlRootElement 
public class Depense implements Serializable {

    private static final long serialVersionUID = 1L;
     private String uid;
    private String libelle;
    private Double montantFixe;
    private List<Payer> payerList;
   
    public Depense() {
    }

    public Depense(String uid) {
        this.uid = uid;
    }

    public Depense(String uid, String libelle) {
        this.uid = uid;
        this.libelle = libelle;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getMontantFixe() {
        return montantFixe;
    }

    public void setMontantFixe(Double montantFixe) {
        this.montantFixe = montantFixe;
    }

    public List<Payer> getPayerList() {
        return payerList;
    }

    public void setPayerList(List<Payer> payerList) {
        this.payerList = payerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uid != null ? uid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Depense)) {
            return false;
        }
        Depense other = (Depense) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Depense[ uid=" + uid + " ]";
    }
    
}
