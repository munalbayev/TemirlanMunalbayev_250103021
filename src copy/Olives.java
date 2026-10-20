public class Olives extends PizzaDecorator{
    Olives(Pizza pizza) { super(pizza); }
    @Override protected String name() { return "Olives"; }
    @Override protected double price() { return 1.0; }
}
