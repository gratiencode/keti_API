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

public class User implements Serializable {

    private Date createdAt;

    private String username;
    private String password;
    private String prenom;
    private String nom;
    private String idSucursale;
    private String role;
    private boolean actif;
    private static final long serialVersionUID = 1L;
     private String uid; 
    private List<Session> sessionList;

    public User() {
    }
    
   

    public User(String uid) {
        this.uid = uid;
    }

    public User(String uid, Date createdAt, String username, String password, String prenom, String nom, String role) {
        this.uid = uid;
        this.createdAt = createdAt;
        this.username = username;
        this.password = password;
        this.prenom = prenom;
        this.nom = nom;
        this.role = role;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


    public String getIdSucursale() {
        return idSucursale;
    }

    public void setIdSucursale(String idSucursale) {
        this.idSucursale = idSucursale;
    }


  
    public List<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(List<Session> sessionList) {
        this.sessionList = sessionList;
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.User[ uid=" + uid + " ]";
    }

   

    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

 

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean getActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }
    
}
