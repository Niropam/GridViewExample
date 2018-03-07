package com.example.user.gridview;

/**
 * Created by User on 2/22/2018.
 */

public class Items {
    String countryName;
    int countryFlag;
    String countrySite;

    public Items(String countryName, int countryFlag,String countrySite) {
        this.countryName = countryName;
        this.countryFlag = countryFlag;
        this.countrySite=countrySite;
    }
    public String getCountryName(){
        return countryName;
    }
    public int getCountryFlag(){
        return countryFlag;
    }
    public String getCountrySite(){
        return countrySite;
    }
}
