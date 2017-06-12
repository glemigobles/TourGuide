package com.kubaczeremosz.tourguideprzemysl;

/**
 * Created by Kuba on 2017-06-10.
 */

public class Offer {

    private String name;
    private String text;
    private int imageResourceId;
    private String link;

    public Offer(String name, String text, int imageResource, String link) {
        this.name = name;
        this.text = text;
        this.imageResourceId = imageResource;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getLink() {
        return link;
    }
}
