package io.matthewbelongia.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;

/**
 * An entity Item composed by three fields (id, email, name).
 * The Entity annotation indicates that this class is a JPA entity.
 * The Table annotation specifies the name for the table in the db.
 *
 * @author netgloo
 */
@Entity
@Table(name = "cigar")
public class Item {

    // ------------------------
    // PRIVATE FIELDS
    // ------------------------

    // An autogenerated id (unique for each user in the db)


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // The item's brandId
    //@NotNull
    //private Integer brandId;

    // The item's name
    @NotNull
    private String name;

    @NotNull
    private Double coststick;

    @NotNull
    private int inventorylevel;

    @NotNull
    private Double length;

    @NotNull
    private int ringgauge;

    @NotNull
    private int strength;

    @NotNull
    private int brandid;

    @NotNull
    private BigInteger sku;

    @NotNull
    private Double retailstick;

    @NotNull
    private Double retailbox;

    @NotNull
    private int sticksperbox;




    // ------------------------
    // PUBLIC METHODS
    // ------------------------

    public Item() { }

    public Item(long id) {
        this.id = id;
    }


    public Item(String name, Double coststick, int inventorylevel, Double length, int ringgauge, int strength, int brandid, BigInteger sku, Double retailstick, Double retailbox, int sticksperbox) {
        this.name = name;
        this.coststick = coststick;
        this.inventorylevel = inventorylevel;
        this.length = length;
        this.ringgauge = ringgauge;
        this.strength = strength;
        this.brandid = brandid;
        this.sku = sku;
        this.retailstick = retailstick;
        this.retailbox = retailbox;
        this.sticksperbox = sticksperbox;

    }

    // Getter and setter methods


    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public int getRinggauge() {
        return ringgauge;
    }

    public void setRinggauge(int ringgauge) {
        this.ringgauge = ringgauge;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getBrandid() {
        return brandid;
    }

    public void setBrandid(int brandid) {
        this.brandid = brandid;
    }

    public int getInventorylevel() {
        return inventorylevel;
    }

    public void setInventorylevel(int inventorylevel) {
        this.inventorylevel = inventorylevel;
    }


    public long getId() {
        return id;
    }

    public void setId(long value) {
        this.id = value;
    }

    public Double getCoststick() {
        return coststick;
    }

    public void setCoststick(Double coststick) {
        this.coststick = coststick;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public BigInteger getSku() {
        return sku;
    }

    public void setSku(BigInteger sku) {
        this.sku = sku;
    }

    public Double getRetailstick() {
        return retailstick;
    }

    public void setRetailstick(Double retailstick) {
        this.retailstick = retailstick;
    }

    public Double getRetailbox() {
        return retailbox;
    }

    public void setRetailbox(Double retailbox) {
        this.retailbox = retailbox;
    }

    public int getSticksperbox() {
        return sticksperbox;
    }

    public void setSticksperbox(int sticksperbox) {
        this.sticksperbox = sticksperbox;
    }
} // class Item
