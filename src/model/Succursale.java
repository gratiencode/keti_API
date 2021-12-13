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
public class Succursale implements Serializable {

    private static final long serialVersionUID = 1L;
    private String uid;
    private String nomSuccursale;
    private String adresse;
    private String directeur;
    private List<Comptefin> comptefinList;
    private List<Voyage> voyageList;

    public Succursale() {
    }

    

    public Succursale(String uid) {
        this.uid = uid;
    }

    public Succursale(String uid, String nomSuccursale, String adresse) {
        this.uid = uid;
        this.nomSuccursale = nomSuccursale;
        this.adresse = adresse;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNomSuccursale() {
        return nomSuccursale;
    }

    public void setNomSuccursale(String nomSuccursale) {
        this.nomSuccursale = nomSuccursale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDirecteur() {
        return directeur;
    }

    public void setDirecteur(String directeur) {
        this.directeur = directeur;
    }

   
    public List<Comptefin> getComptefinList() {
        return comptefinList;
    }

    public void setComptefinList(List<Comptefin> comptefinList) {
        this.comptefinList = comptefinList;
    }

 
    public List<Voyage> getVoyageList() {
        return voyageList;
    }

    public void setVoyageList(List<Voyage> voyageList) {
        this.voyageList = voyageList;
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
        if (!(object instanceof Succursale)) {
            return false;
        }
        Succursale other = (Succursale) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Succursale[ uid=" + uid + " ]";
    }

}
