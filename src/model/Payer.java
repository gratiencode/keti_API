/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eroot
 */

@XmlRootElement
public class Payer implements Serializable {

    private static final long serialVersionUID = 1L;
    
     private String uid; 
    
    private int reference;
    
    private Double montantDette;
  
    private Double montantPaye;
    
    private Double montantRestant;
    private Date datePayement;
    private String libelle;
    private Comptefin compteIdDebit;
    private Comptefin compteIdCredit;
    private Creancier creancierId;
    private Depense depenseId;
    private Tiers clientId;

    public Payer() {
    }
    

    public Payer(String uid) {
        this.uid = uid;
    }

    public Payer(String uid, int reference) {
        this.uid = uid;
        this.reference = reference;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public Double getMontantDette() {
        return montantDette;
    }

    public void setMontantDette(Double montantDette) {
        this.montantDette = montantDette;
    }

    public Double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(Double montantPaye) {
        this.montantPaye = montantPaye;
    }

    public Double getMontantRestant() {
        return montantRestant;
    }

    public void setMontantRestant(Double montantRestant) {
        this.montantRestant = montantRestant;
    }

    public Date getDatePayement() {
        return datePayement;
    }

    public void setDatePayement(Date datePayement) {
        this.datePayement = datePayement;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Comptefin getCompteIdDebit() {
        return compteIdDebit;
    }

    public void setCompteIdDebit(Comptefin compteIdDebit) {
        this.compteIdDebit = compteIdDebit;
    }

    public Comptefin getCompteIdCredit() {
        return compteIdCredit;
    }

    public void setCompteIdCredit(Comptefin compteIdCredit) {
        this.compteIdCredit = compteIdCredit;
    }

    public Creancier getCreancierId() {
        return creancierId;
    }

    public void setCreancierId(Creancier creancierId) {
        this.creancierId = creancierId;
    }

    public Depense getDepenseId() {
        return depenseId;
    }

    public void setDepenseId(Depense depenseId) {
        this.depenseId = depenseId;
    }

    public Tiers getClientId() {
        return clientId;
    }

    public void setClientId(Tiers clientId) {
        this.clientId = clientId;
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
        if (!(object instanceof Payer)) {
            return false;
        }
        Payer other = (Payer) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Payer[ uid=" + uid + " ]";
    }
    
}
