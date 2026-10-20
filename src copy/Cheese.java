public class Cheese extends PizzaDecorator{
    Cheese(Pizza pizza) { super(pizza); }
    @Override protected String name() { return "Cheese"; }
    @Override protected double price() { return 2.0; }
}
