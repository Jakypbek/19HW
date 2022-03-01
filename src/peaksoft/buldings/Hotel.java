package peaksoft.buldings;

import peaksoft.buldings.interfaces.RentPayAble;

public class Hotel extends Building implements RentPayAble {

    private final int priceForARentForAMonth = 210;

    public Hotel() {
    }

    public Hotel(String name, String address) {
        super(name, address);
        super.setPriceForResidence(priceForARentForAMonth);
    }

    @Override
    public String toString() {
        return "Hotel{} " + super.toString();
    }
}
