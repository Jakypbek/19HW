package peaksoft;

import peaksoft.buldings.Apartment;
import peaksoft.buldings.Building;
import peaksoft.buldings.Dormitory;
import peaksoft.buldings.Hotel;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Building[] buildings = new Building[] {
                new Apartment("Квартира" , "Алтын-Ордо"),
                new Dormitory("Общежитие" , "Кара-Жыгач"),
                new Hotel("Отель" ,"Оскон-Ордо")
        };

        Family[] families = {
                new Family("Antonov", new Human[]{new Human(), new Human(), new Human(), new Human(), new Human(), new Human()}),
                new Family("Igorev", new Human[] {new Human(), new Human(), new Human(), new Human(), new Human()}),
                new Family("Vasiliev",new Human[] {new Human(), new Human(), new Human(), new Human(), new Human(), new Human(), new Human(), new Human()}),
                new Family("Yakavlev",new Human[] {new Human(), new Human(), new Human()}),
                new Family("Olegov",new Human[] {new Human(), new Human(), new Human(), new Human(), new Human()}),
                new Family("Vasiliev",new Human[] {new Human(), new Human(), new Human(), new Human()}),
                new Family("Topolev",new Human[] {new Human(), new Human(), new Human(), new Human(), new Human(), new Human(), new Human()}),
                new Family("Arseniev",new Human[] {new Human(), new Human(), new Human(), new Human()}),
                new Family("Tutchev",new Human[] {new Human(), new Human(), new Human(), new Human(), new Human(), new Human(), new Human(), new Human()}),
                new Family("Makarov",new Human[] {new Human(), new Human(), new Human(), new Human(), new Human(), new Human(), new Human()}),
        };

        setRandomBalance(families);
        placeAllFamilies(families, buildings);




        for (Family val: families) {
            System.out.println(val);
        }

        System.out.println("---------------------------------------------------------------------------");

        for (Building val: buildings) {
            System.out.println(val);
        }




    }

    public static void placeAllFamilies(Family[] families, Building[] buildings) {
        Random random = new Random();
        /*
        for (int i = 0; i < families.length; i++) {
            int r = random.nextInt(buildings.length);
            families[i].setHome(buildings[r]);
            buildings[r].addGuests(families[i]);
        }
         */

        for (Family family : families) {
            family.setHome(buildings[random.nextInt(buildings.length)]);
            family.payForResidence((byte) random.nextInt(12, 20));
        }

        for (Family family : families) {

            if (family.getHome() instanceof Apartment) {
                family.setAddress(buildings[0].getAddress());
            } else if (family.getHome() instanceof Dormitory) {
                family.setAddress(buildings[1].getAddress());
            } else {
                family.setAddress(buildings[2].getAddress());
            }
        }

        for (Family family : families) {

            if (family.getHome() instanceof Apartment) {
                buildings[0].addGuests(family);
                buildings[0].addGuestsSurNames(family.getSurName());
            } else if (family.getHome() instanceof Dormitory) {
                buildings[1].addGuests(family);
                buildings[1].addGuestsSurNames(family.getSurName());
            } else {
                buildings[2].addGuests(family);
                buildings[2].addGuestsSurNames(family.getSurName());
            }
        }
    }

    public static void setRandomBalance(Family[] families) {
        Random random = new Random();

        for (int i = 0; i < families.length; i++) {
            families[i].setBalance(random.nextInt(20000, 200000));
        }
    }
}
