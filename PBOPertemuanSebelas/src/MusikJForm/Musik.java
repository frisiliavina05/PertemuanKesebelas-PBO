/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusikJForm;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "musik")
@NamedQueries({
    @NamedQuery(name = "Musik.findAll", query = "SELECT m FROM Musik m"),
    @NamedQuery(name = "Musik.findById", query = "SELECT m FROM Musik m WHERE m.id = :id"),
    @NamedQuery(name = "Musik.findByJudul", query = "SELECT m FROM Musik m WHERE m.judul = :judul"),
    @NamedQuery(name = "Musik.findByArtis", query = "SELECT m FROM Musik m WHERE m.artis = :artis"),
    @NamedQuery(name = "Musik.findByTahun", query = "SELECT m FROM Musik m WHERE m.tahun = :tahun")})
public class Musik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "judul")
    private String judul;
    @Column(name = "artis")
    private String artis;
    @Column(name = "tahun")
    private Integer tahun;

    public Musik() {
    }

    public Musik(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musik)) {
            return false;
        }
        Musik other = (Musik) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MusikJForm.Musik[ id=" + id + " ]";
    }
    
}
