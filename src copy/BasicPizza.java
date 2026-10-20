abstract class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Dough & Sauce";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}