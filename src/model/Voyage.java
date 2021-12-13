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

public class Voyage implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String uid;
    private Date dateArriver;
    private String etat;
    private Succursale succursalleId;
    private Vehicule vehiculeId;

    public Voyage() {
    }

    public Voyage(String uid) {
        this.uid = uid;
    }


    public Voyage(String uid, Date dateArriver, String etat) {
        this.uid = uid;
        this.dateArriver = dateArriver;
        this.etat = etat;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Date getDateArriver() {
        return dateArriver;
    }

    public void setDateArriver(Date dateArriver) {
        this.dateArriver = dateArriver;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Succursale getSuccursalleId() {
        return succursalleId;
    }

    public void setSuccursalleId(Succursale succursalleId) {
        this.succursalleId = succursalleId;
    }

    public Vehicule getVehiculeId() {
        return vehiculeId;
    }

    public void setVehiculeId(Vehicule vehiculeId) {
        this.vehiculeId = vehiculeId;
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
        if (!(object instanceof Voyage)) {
            return false;
        }
        Voyage other = (Voyage) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Voyage[ uid=" + uid + " ]";
    }

}
