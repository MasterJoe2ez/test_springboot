package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer countryId;
    private String name;
    private double area;
    private Integer population;
    private String flag;
    public Integer getCountryId() {
        return countryId;
    }
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public Integer getPopulation() {
        return population;
    }
    public void setPopulation(Integer population) {
        this.population = population;
    }
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }
    
}