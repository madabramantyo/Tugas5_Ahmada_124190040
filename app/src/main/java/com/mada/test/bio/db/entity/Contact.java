package com.mada.test.bio.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "contacts")
public class Contact {


    @ColumnInfo(name="contact_name")
    private String name;

    @ColumnInfo(name="contact_email")
    private String email;

    @ColumnInfo(name="contact_phone")
    private String phone;

    @ColumnInfo(name="contact_address")
    private String address;

    @ColumnInfo(name="contact_id")
    @PrimaryKey(autoGenerate =true)
    private long id;


    @Ignore
    public Contact() {
    }



    public Contact(long id, String name, String email, String phone, String address) {

        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) { this.address = address; }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
