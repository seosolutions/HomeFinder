package com.homefinder.jeremybroutin.homefinder.model;

import java.io.Serializable;

/**
 * Created by jeremybroutin on 5/24/16.
 */
public class Listing implements Serializable {

    private String headline;
    private String subtitle;
    private String body;
    private String price;
    private int imageResource;

    public Listing(String headline, String subtitle, String body, String price, int imageResource){
        this.headline = headline;
        this.subtitle = subtitle;
        this.body = body;
        this.price = price;
        this.imageResource = imageResource;
    }

    public String getHeadline(){
        return headline;
    }

    public String getSubtitle(){
        return subtitle;
    }

    public String getBody(){
        return body;
    }

    public String getPrice(){
        return price;
    }

    public int getImageResource(){
        return imageResource;
    }
}
