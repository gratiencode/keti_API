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
public class Marchandise implements Serializable {

    
    private String nomMarchandise;
   
    private String description;

    private static final long serialVersionUID = 1L;
   
     private String uid; 
    
    
    private Double prix;
    
    private List<Transporter> transporterList;

    public Marchandise() {
    }

     
    
    public Marchandise(String uid) {
        this.uid = uid;
    }

    public Marchandise(String uid, String nomMarchandise) {
        this.uid = uid;
        this.nomMarchandise = nomMarchandise;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNomMarchandise() {
        return nomMarchandise;
    }

    public void setNomMarchandise(String nomMarchandise) {
        this.nomMarchandise = nomMarchandise;
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
        if (!(object instanceof Marchandise)) {
            return false;
        }
        Marchandise other = (Marchandise) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Marchandise[ uid=" + uid + " ]";
    }


   

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
    
}
