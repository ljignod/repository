package com.carshop.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "auti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auto.findAll", query = "SELECT a FROM Auto a")
    , @NamedQuery(name = "Auto.findById", query = "SELECT a FROM Auto a WHERE a.id = :id")
    , @NamedQuery(name = "Auto.findByEmail", query = "SELECT a FROM Auto a WHERE a.email = :email")
    , @NamedQuery(name = "Auto.findByTelefon", query = "SELECT a FROM Auto a WHERE a.telefon = :telefon")
    , @NamedQuery(name = "Auto.findByMarka", query = "SELECT a FROM Auto a WHERE a.marka = :marka")
    , @NamedQuery(name = "Auto.findByModel", query = "SELECT a FROM Auto a WHERE a.model = :model")
    , @NamedQuery(name = "Auto.findByCena", query = "SELECT a FROM Auto a WHERE a.cena = :cena")
    , @NamedQuery(name = "Auto.findBySlika", query = "SELECT a FROM Auto a WHERE a.slika = :slika")
    , @NamedQuery(name = "Auto.findByTip", query = "SELECT a FROM Auto a WHERE a.tip = :tip")
    , @NamedQuery(name = "Auto.findByGodiste", query = "SELECT a FROM Auto a WHERE a.godiste = :godiste")
    , @NamedQuery(name = "Auto.findByVrata", query = "SELECT a FROM Auto a WHERE a.vrata = :vrata")
    , @NamedQuery(name = "Auto.findByKubikaza", query = "SELECT a FROM Auto a WHERE a.kubikaza = :kubikaza")
    , @NamedQuery(name = "Auto.findByKilometraza", query = "SELECT a FROM Auto a WHERE a.kilometraza = :kilometraza")
    , @NamedQuery(name = "Auto.findByMenjac", query = "SELECT a FROM Auto a WHERE a.menjac = :menjac")
    , @NamedQuery(name = "Auto.findByGorivo", query = "SELECT a FROM Auto a WHERE a.gorivo = :gorivo")
    , @NamedQuery(name = "Auto.findByOpis", query = "SELECT a FROM Auto a WHERE a.opis = :opis")})
public class Auto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "email")
    private String email;
    @Size(max = 32)
    @Column(name = "telefon")
    private String telefon;
    @Size(max = 64)
    @Column(name = "marka")
    private String marka;
    @Size(max = 64)
    @Column(name = "model")
    private String model;
    @Column(name = "cena")
    private Integer cena;
    @Size(max = 256)
    @Column(name = "slika")
    private String slika;
    @Size(max = 16)
    @Column(name = "tip")
    private String tip;
    @Column(name = "godiste")
    private Integer godiste;
    @Size(max = 16)
    @Column(name = "vrata")
    private String vrata;
    @Column(name = "kubikaza")
    private Integer kubikaza;
    @Column(name = "kilometraza")
    private Integer kilometraza;
    @Size(max = 16)
    @Column(name = "menjac")
    private String menjac;
    @Size(max = 16)
    @Column(name = "gorivo")
    private String gorivo;
    @Size(max = 2048)
    @Column(name = "opis")
    private String opis;

    public Auto() {
    }

    public Auto(Integer id) {
        this.id = id;
    }

    public Auto(Integer id, String email) {
        this.id = id;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Integer getGodiste() {
        return godiste;
    }

    public void setGodiste(Integer godiste) {
        this.godiste = godiste;
    }

    public String getVrata() {
        return vrata;
    }

    public void setVrata(String vrata) {
        this.vrata = vrata;
    }

    public Integer getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(Integer kubikaza) {
        this.kubikaza = kubikaza;
    }

    public Integer getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(Integer kilometraza) {
        this.kilometraza = kilometraza;
    }

    public String getMenjac() {
        return menjac;
    }

    public void setMenjac(String menjac) {
        this.menjac = menjac;
    }

    public String getGorivo() {
        return gorivo;
    }

    public void setGorivo(String gorivo) {
        this.gorivo = gorivo;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
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
        if (!(object instanceof Auto)) {
            return false;
        }
        Auto other = (Auto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.carshop.model.Auto[ id=" + id + " ]";
    }

}
