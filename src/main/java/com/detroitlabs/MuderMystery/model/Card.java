package com.detroitlabs.MuderMystery.model;

public class Card {
    private String cardName;
    private String identifier;    //w for weapon, p for people, L for location
    private String picName;

    public Card(String cardName, String identifier, String picName) {
        this.cardName = cardName;
        this.identifier = identifier;
        this.picName = picName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }
}
