package peaksoft.buldings;

import peaksoft.Family;

import java.util.Arrays;

public abstract class Building {

    private String name;
    private String address;
    private int priceForResidence;
    private Family[] guests;
    private String[] guestsSurNames;

    public Building() {
    }

    public Building(Family[] guests, String address) {
        this.guests = guests;
        this.address = address;
    }

    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Family[] getGuests() {
        return guests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getGuestsSurNames() {
        return guestsSurNames;
    }

    public void addGuestsSurNames(String guestsSurNames) {
        if (this.guestsSurNames == null) {
            this.guestsSurNames = new String[] {guestsSurNames};
        } else {
            String[] familiesSurNames = new String[this.guestsSurNames.length + 1];
            for (int i = 0; i < this.guestsSurNames.length; i++) {
                familiesSurNames[i] = this.guestsSurNames[i];
            }
            familiesSurNames[this.guestsSurNames.length] = guestsSurNames;
            this.guestsSurNames = familiesSurNames;
        }
    }

    public void addGuests(Family guests) {
        if (this.guests == null) {
            this.guests = new Family[] {guests};
        } else {
            Family[] families1 = new Family[this.guests.length + 1];
            for (int i = 0; i < this.guests.length; i++) {
                families1[i] = this.guests[i];
            }
            families1[this.guests.length] = guests;
            this.guests = families1;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriceForResidence() {
        return priceForResidence;
    }

    public void setPriceForResidence(int priceForResidence) {
        this.priceForResidence = priceForResidence;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", guestsSurNames=" + Arrays.toString(guestsSurNames) +
                '}';
    }
}
