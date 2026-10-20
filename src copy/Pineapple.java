public class Pineapple extends PizzaDecorator{
    Pineapple(Pizza pizza) { super(pizza); }
    @Override protected String name() { return "Pineapple"; }
    @Override protected double price() { return 1.5; }
}
