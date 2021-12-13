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
public class Comptefin implements Serializable {

    private static final long serialVersionUID = 1L;
 
     private String uid; 
    
    private String libelle;
    
    private String numeroCompte;
    private String typeDeCompte;
    
    private String nomBanque;
    
    private Double soldeMinimum;

    private Succursale sucursaleId;
    private List<Payer> payerList;
    private List<Payer> payerList1;
  
    

    public Comptefin() {
    }

    public Comptefin(String uid) {
        this.uid = uid;
    }

    public Comptefin(String uid, String libelle, String typeDeCompte) {
        this.uid = uid;
        this.libelle = libelle;
        this.typeDeCompte = typeDeCompte;
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

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getTypeDeCompte() {
        return typeDeCompte;
    }

    public void setTypeDeCompte(String typeDeCompte) {
        this.typeDeCompte = typeDeCompte;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public Double getSoldeMinimum() {
        return soldeMinimum;
    }

    public void setSoldeMinimum(Double soldeMinimum) {
        this.soldeMinimum = soldeMinimum;
    }

    public Succursale getSucursaleId() {
        return sucursaleId;
    }

    public void setSucursaleId(Succursale sucursaleId) {
        this.sucursaleId = sucursaleId;
    }

    public List<Payer> getPayerList() {
        return payerList;
    }

    public void setPayerList(List<Payer> payerList) {
        this.payerList = payerList;
    }

    public List<Payer> getPayerList1() {
        return payerList1;
    }

    public void setPayerList1(List<Payer> payerList1) {
        this.payerList1 = payerList1;
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
        if (!(object instanceof Comptefin)) {
            return false;
        }
        Comptefin other = (Comptefin) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Comptefin[ uid=" + uid + " ]";
    }
    
}
