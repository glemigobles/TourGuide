package com.kubaczeremosz.tourguideprzemysl;

/**
 * Created by Kuba on 2017-06-10.
 */

public class Offer {

    private String name;
    private String text;
    private int imageResourceId;
    private String cords;

    public Offer(String name, String text, int imageResource, String cords) {
        this.name = name;
        this.text = text;
        this.imageResourceId = imageResource;
        this.cords = cords;
    }

    public Offer(String name, int imageResourceId, String cords) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.cords = cords;
    }

    public String getName() {
        return name;
    }

    public String getText() { return text; }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getCords() {
        return cords;
    }
}
