package CJS.chapter03.beverages;

public class Decaf extends Beverage{
    public Decaf() {
        description = "디 카페인";
    }

    @Override
    public double cost() {
        return 2.33;
    }
}
