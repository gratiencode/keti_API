/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eroot
 */
@XmlRootElement
public class Contacts implements Serializable {

    private String phone;
    private String email;

    private static final long serialVersionUID = 1L;
   
     private String uid;
    private Tiers idTiers;

    public Contacts() {
    }
    

    public Contacts(String uid) {
        this.uid = uid;
    }

    public Contacts(String uid, String email) {
        this.uid = uid;
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }


    public Tiers getIdTiers() {
        return idTiers;
    }

    public void setIdTiers(Tiers idTiers) {
        this.idTiers = idTiers;
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
        if (!(object instanceof Contacts)) {
            return false;
        }
        Contacts other = (Contacts) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Contacts[ uid=" + uid + " ]";
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
