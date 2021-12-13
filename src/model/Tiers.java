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
public class Tiers implements Serializable {

    
    private String nom;
    
    private String prenom;
    
    private String adresse;
   
    private String typetiers;
   
    private List<Retirer> retirerList;
    
    private List<Payer> payerList;

    private static final long serialVersionUID = 1L;
   
     private String uid;
    
    private List<Transporter> transporterList;
   
    private List<Contacts> contactsList;

    public Tiers() {
    }
    
  
    private void undashWithLower() {
        this.uid = this.uid.replace("-", "").toLowerCase();
    }

    public Tiers(String uid) {
        this.uid = uid;
    }

    public Tiers(String uid, String nom, String prenom) {
        this.uid = uid;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }


    public String getTypetiers() {
        return typetiers;
    }

    public void setTypetiers(String typetiers) {
        this.typetiers = typetiers;
    }

   
    public List<Transporter> getTransporterList() {
        return transporterList;
    }

    public void setTransporterList(List<Transporter> transporterList) {
        this.transporterList = transporterList;
    }

  
    public List<Contacts> getContactsList() {
        return contactsList;
    }

    public void setContactsList(List<Contacts> contactsList) {
        this.contactsList = contactsList;
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
        if (!(object instanceof Tiers)) {
            return false;
        }
        Tiers other = (Tiers) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tiers[ uid=" + uid + " ]";
    }



    
    public List<Retirer> getRetirerList() {
        return retirerList;
    }

    public void setRetirerList(List<Retirer> retirerList) {
        this.retirerList = retirerList;
    }

    
    public List<Payer> getPayerList() {
        return payerList;
    }

    public void setPayerList(List<Payer> payerList) {
        this.payerList = payerList;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

   
    
}
