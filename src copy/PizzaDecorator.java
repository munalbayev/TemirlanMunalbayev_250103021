abstract class PizzaDecorator implements Pizza {
    protected final Pizza pizza;

    protected PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    protected abstract String name();

    protected abstract double price();

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", " + name();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + price();
    }
}