package com.engeto.hotel;

import java.time.LocalDate;

public class Booking {
    private String name;
    private int numberOfRooms;
    private int numberOfGuests;
    private LocalDate date;
    private LocalDate date2;
    private boolean workVacation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isWorkVacation() {
        return workVacation;
    }

    public void setWorkVacation(boolean typeOfVacation) {
        this.workVacation = typeOfVacation;
    }

    public Booking(LocalDate date2) {
        this.date2 = date2;
    }

    public LocalDate getDate2() {
        return date2;
    }

    public void setDate2(LocalDate dates) {
        this.date2 = dates;
    }

    public Booking(String name, int numberOfRooms, int numberOfGuests, LocalDate date, LocalDate date2,
                   boolean workVacation) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfGuests = numberOfGuests;
        this.date = date;
        this.date2 = date2;
        this.workVacation = workVacation;




    }
}
