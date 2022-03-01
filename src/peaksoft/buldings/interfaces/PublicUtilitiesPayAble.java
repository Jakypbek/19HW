package peaksoft.buldings.interfaces;

import peaksoft.Family;

import java.time.LocalDate;

public interface PublicUtilitiesPayAble {

    default void payDayMessage(Family[] guests) {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i].getPaidMonth().isBefore(LocalDate.now())) {
                if (LocalDate.now().getDayOfMonth() == (short) 1) {
                    System.out.println(guests[i].getSurName() + " should pay for Public Utilities");
                }
            }
        }
    }
}
