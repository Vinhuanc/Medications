package com.project.ToDoList.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Medication {
    private Integer id;
    private String genericName;
    private String brandName;
    private String mainPurpose;

    public Medication(Integer id, String genericName, String brandName, String mainPurpose) {
        this.id = id;
        this.genericName = genericName;
        this.brandName = brandName;
        this.mainPurpose = mainPurpose;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMainPurpose() {
        return mainPurpose;
    }

    public void setMainPurpose(String mainPurpose) {
        this.mainPurpose = mainPurpose;
    }


}
