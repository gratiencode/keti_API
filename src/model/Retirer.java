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
public class Retirer implements Serializable {

    private static final long serialVersionUID = 1L;
     private String uid;
  
    private int reference;
   
    private Double quantiteRet;
    private double quantiteRest;
    private Double valeurRet;
    private double valeurRest;
    private Date dateRet;
    private Tiers tiersId;
    private Transporter transId;

    public Retirer() {
    }

    public Retirer(String uid) {
        this.uid = uid;
    }

    public Retirer(String uid, int reference, double quantiteRest, double valeurRest, Date dateRet) {
        this.uid = uid;
        this.reference = reference;
        this.quantiteRest = quantiteRest;
        this.valeurRest = valeurRest;
        this.dateRet = dateRet;
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

    public Double getQuantiteRet() {
        return quantiteRet;
    }

    public void setQuantiteRet(Double quantiteRet) {
        this.quantiteRet = quantiteRet;
    }

    public double getQuantiteRest() {
        return quantiteRest;
    }

    public void setQuantiteRest(double quantiteRest) {
        this.quantiteRest = quantiteRest;
    }

    public Double getValeurRet() {
        return valeurRet;
    }

    public void setValeurRet(Double valeurRet) {
        this.valeurRet = valeurRet;
    }

    public double getValeurRest() {
        return valeurRest;
    }

    public void setValeurRest(double valeurRest) {
        this.valeurRest = valeurRest;
    }

    public Date getDateRet() {
        return dateRet;
    }

    public void setDateRet(Date dateRet) {
        this.dateRet = dateRet;
    }

    public Tiers getTiersId() {
        return tiersId;
    }

    public void setTiersId(Tiers tiersId) {
        this.tiersId = tiersId;
    }

    public Transporter getTransId() {
        return transId;
    }

    public void setTransId(Transporter transId) {
        this.transId = transId;
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
        if (!(object instanceof Retirer)) {
            return false;
        }
        Retirer other = (Retirer) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Retirer[ uid=" + uid + " ]";
    }
    
}
