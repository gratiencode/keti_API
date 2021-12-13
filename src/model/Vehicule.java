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

public class Vehicule implements Serializable {

    private String plaque;
    private String modeleVehicule;
    private String marque;
    private String nombreDeRoue;
    private String typeVehicule;
    private List<Voyage> voyageList;

    private static final long serialVersionUID = 1L;
    private String uid;

     private List<Transporter> transporterList;

    public Vehicule() {
    }


    public Vehicule(String uid) {
        this.uid = uid;
    }

    public Vehicule(String uid, String plaque, String modeleVehicule, String marque) {
        this.uid = uid;
        this.plaque = plaque;
        this.modeleVehicule = modeleVehicule;
        this.marque = marque;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getModeleVehicule() {
        return modeleVehicule;
    }

    public void setModeleVehicule(String modeleVehicule) {
        this.modeleVehicule = modeleVehicule;
    }

    public String getNombreDeRoue() {
        return nombreDeRoue;
    }

    public void setNombreDeRoue(String nombreDeRoue) {
        this.nombreDeRoue = nombreDeRoue;
    }

  
    public List<Transporter> getTransporterList() {
        return transporterList;
    }

    public void setTransporterList(List<Transporter> transporterList) {
        this.transporterList = transporterList;
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
        if (!(object instanceof Vehicule)) {
            return false;
        }
        Vehicule other = (Vehicule) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Vehicule[ uid=" + uid + " ]";
    }

    public String getTypeVehicule() {
        return typeVehicule;
    }

    public void setTypeVehicule(String typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    
    public List<Voyage> getVoyageList() {
        return voyageList;
    }

    public void setVoyageList(List<Voyage> voyageList) {
        this.voyageList = voyageList;
    }

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

}
