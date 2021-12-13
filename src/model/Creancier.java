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
public class Creancier implements Serializable {

    private static final long serialVersionUID = 1L;
     private String uid; 
    private String nomCreancier;
    private String typeCreancier;
    private List<Payer> payerList;

    public Creancier() {
    }
    
    public Creancier(String uid) {
        this.uid = uid;
    }

    public Creancier(String uid, String nomCreancier, String typeCreancier) {
        this.uid = uid;
        this.nomCreancier = nomCreancier;
        this.typeCreancier = typeCreancier;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNomCreancier() {
        return nomCreancier;
    }

    public void setNomCreancier(String nomCreancier) {
        this.nomCreancier = nomCreancier;
    }

    public String getTypeCreancier() {
        return typeCreancier;
    }

    public void setTypeCreancier(String typeCreancier) {
        this.typeCreancier = typeCreancier;
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
        if (!(object instanceof Creancier)) {
            return false;
        }
        Creancier other = (Creancier) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Creancier[ uid=" + uid + " ]";
    }
    
}
