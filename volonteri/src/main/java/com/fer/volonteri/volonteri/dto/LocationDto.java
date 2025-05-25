package com.fer.volonteri.volonteri.dto;

public class LocationDto {
    private Long id;
    private String city;
    private String country;
    private String address;

    public LocationDto(Long id, String city, String country, String address) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
