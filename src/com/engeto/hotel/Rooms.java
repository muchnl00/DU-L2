package com.engeto.hotel;

public class Rooms {
    private int numberOfRooms;
    private int numberOfBeds;
    private boolean hasABalcony;
    private boolean hasASeaView;
    private int pricePerNight;

    public Rooms(int numberOfRooms, int numberOfBeds, boolean hasABalcony, boolean hasASeaView, int pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.hasABalcony = hasABalcony;
        this.hasASeaView = hasASeaView;
        this.pricePerNight = pricePerNight;
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isHasABalcony() {
        return hasABalcony;
    }

    public void setHasABalcony(boolean hasABalcony) {
        this.hasABalcony = hasABalcony;
    }

    public boolean isHasASeaView() {
        return hasASeaView;
    }

    public void setHasASeaView(boolean hasASeaView) {
        this.hasASeaView = hasASeaView;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
