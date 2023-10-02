package com.engeto.hotel;

import java.time.LocalDate;

public class Guests {
    private String name;
    private String secondName;
    private LocalDate birthdate;

    public Guests(String name, String secondName, LocalDate birthdate) {
        this.name = name;
        this.secondName = secondName;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getBorn() {
        return birthdate;
    }

    public void setBorn(LocalDate born) {
        this.birthdate = born;
    }
}
