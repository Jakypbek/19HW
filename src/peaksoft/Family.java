package peaksoft;

import peaksoft.buldings.Building;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Family {

    Random random = new Random();

    private Building home;
    private final LocalDate dateOfSattle = LocalDate.now().minusDays(random.nextInt(300));
    private Human[] membersOfFamily;
    private String address;
    private String surName;
    private int balance;
    private LocalDate paidMonth;

    public Family() {
    }

    public Family(Building home, Human[] membersOfFamily, String address, String surName) {
        this.home = home;
        this.membersOfFamily = membersOfFamily;
        this.address = address;
        this.surName = surName;
    }

    public Family(String surName, Human[] membersOfFamily) {
        this.surName = surName;
        this.membersOfFamily = membersOfFamily;
    }

    public Building getHome() {
        return home;
    }

    public void setHome(Building home) {
        this.home = home;
    }

    public Human[] getMembersOfFamily() {
        return membersOfFamily;
    }

    public void setMembersOfFamily(Human[] membersOfFamily) {
        this.membersOfFamily = membersOfFamily;
    }

    public String getAddress() {
        return address;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getPaidMonth() {
        return paidMonth;
    }

    public void setPaidMonth(LocalDate paidMonth) {
        this.paidMonth = paidMonth;
    }

    public void payForResidence(byte forHowManyMonths) {
        if (this.balance - this.home.getPriceForResidence() * forHowManyMonths > 0) {
            this.balance -= this.home.getPriceForResidence() * forHowManyMonths;
            this.paidMonth = this.dateOfSattle.plusMonths(forHowManyMonths);
        } else {
            System.err.println("Уважаемый " + this.surName + ", у Вас не достаточно средств, чтобы оплатить за" +
                    forHowManyMonths + " месяцев");
            System.out.println("Но Вы можете оплатить за " + this.balance / home.getPriceForResidence() + " месяцев");
        }
    }

    @Override
    public String toString() {
        return "Family{" +
                "home=" + home.getName() +
                ", membersOfFamily=" + membersOfFamily.length +
                ", address='" + address + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
