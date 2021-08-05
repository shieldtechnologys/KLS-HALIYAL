package com.example.klsbcahaliyal;

public class model {
    String Description,Designation,Name,purl;

    public model() {
    }

    public model(String description, String designation, String name, String purl) {
        Description = description;
        Designation = designation;
        Name = name;
        this.purl = purl;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
