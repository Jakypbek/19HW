package peaksoft.buldings;

import peaksoft.buldings.interfaces.RentPayAble;

public class Dormitory extends Building implements RentPayAble {

    private final int priceForARentForAMonth = 150;

    public Dormitory() {
    }

    public Dormitory(String name, String address) {
        super(name, address);
        super.setPriceForResidence(priceForARentForAMonth);
    }



    @Override
    public String toString() {
        return "Dormitory{} " + super.toString();
    }
}
