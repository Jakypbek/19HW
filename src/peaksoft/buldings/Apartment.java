package peaksoft.buldings;

import peaksoft.Family;
import peaksoft.buldings.interfaces.PublicUtilitiesPayAble;

public class Apartment extends Building implements PublicUtilitiesPayAble {

    private final int priceForResidenceForAMonth = 230;

    public Apartment() {
    }

    public Apartment(String name, String address) {
        super(name, address);
        super.setPriceForResidence(priceForResidenceForAMonth);
    }

    @Override
    public String toString() {
        return "Apartment{} " + super.toString();
    }
}
