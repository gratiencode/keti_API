/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eroot
 */

@XmlRootElement
public class Transporter implements Serializable {

    private static final long serialVersionUID = 1L;
    
     private String uid; 
    
    private double quantite;
    private double priceToPay;
    private double paidPrice;
    private Date dateTransport;
    private byte[] photo;
    private String observation;
    private int tracking;
    private List<Retirer> retirerList;
    private Marchandise idMarchandise;
    private Tiers idTiers;
    private Vehicule idVehicule;

    public Transporter() {
    }
    
    public Transporter(String uid) {
        this.uid = uid;
    }

    public Transporter(String uid, double quantite, double priceToPay, double paidPrice, Date dateTransport, int tracking) {
        this.uid = uid;
        this.quantite = quantite;
        this.priceToPay = priceToPay;
        this.paidPrice = paidPrice;
        this.dateTransport = dateTransport;
        this.tracking = tracking;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public double getPriceToPay() {
        return priceToPay;
    }

    public void setPriceToPay(double priceToPay) {
        this.priceToPay = priceToPay;
    }

    public double getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(double paidPrice) {
        this.paidPrice = paidPrice;
    }

    public Date getDateTransport() {
        return dateTransport;
    }

    public void setDateTransport(Date dateTransport) {
        this.dateTransport = dateTransport;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public int getTracking() { 
        return tracking;
    }

    public void setTracking(int tracking) {
        this.tracking = tracking;
    }

   
    public List<Retirer> getRetirerList() {
        return retirerList;
    }

    public void setRetirerList(List<Retirer> retirerList) {
        this.retirerList = retirerList;
    }

    public Marchandise getIdMarchandise() {
        return idMarchandise;
    }

    public void setIdMarchandise(Marchandise idMarchandise) {
        this.idMarchandise = idMarchandise;
    }

    public Tiers getIdTiers() {
        return idTiers;
    }

    public void setIdTiers(Tiers idTiers) {
        this.idTiers = idTiers;
    }

    public Vehicule getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(Vehicule idVehicule) {
        this.idVehicule = idVehicule;
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
        if (!(object instanceof Transporter)) {
            return false;
        }
        Transporter other = (Transporter) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Transporter[ uid=" + uid + " ]";
    }
    
}
