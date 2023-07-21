package com.project.ToDoList.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Medication {
    private String genericName;
    private String brandName;
    private String purpose;

    public Medication(String genericName, String brandName, String purpose) {
        this.genericName = genericName;
        this.brandName = brandName;
        this.purpose = purpose;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
