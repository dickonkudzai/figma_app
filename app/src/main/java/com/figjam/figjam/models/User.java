package com.figjam.figjam.models;

import org.json.JSONException;
import org.json.JSONObject;

//user model to use when fetching and posting data
public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private String lat;
    private String lng;
    private String phone;
    private String website;
    private String username;
    private String cname;
    private String catchPhrase;
    private String bs;

    public User(JSONObject object){
        try {
            this.id = object.getString("id");
            this.name = object.getString("name");
            this.email = object.getString("email");
            this.password = object.getString("password");
            this.street = object.getString("street");
            this.suite = object.getString("suite");
            this.city = object.getString("city");
            this.zipcode = object.getString("zipcode");
            this.lat = object.getString("lat");
            this.lng = object.getString("lng");
            this.phone = object.getString("phone");
            this.website = object.getString("website");
            this.username = object.getString("username");
            this.cname = object.getString("cname");
            this.catchPhrase = object.getString("catchPhrase");
            this.bs = object.getString("bs");
        } catch (JSONException e){
            e.printStackTrace();
        }
    }

    public User(String name, String email, String password, String street, String suite, String city, String zipcode, String lat, String lng, String phone, String website, String username, String cname, String catchPhrase, String bs){
        this.name = name;
        this.email = email;
        this.password = password;
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.lat = lat;
        this.lng = lng;
        this.phone = phone;
        this.website = website;
        this.username = username;
        this.cname = cname;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }
}
