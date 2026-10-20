public static void main(String[] args) {

    Pizza pizza = new Pineapple(new Olives(new Cheese(new BasicPizza())));

    System.out.println("Description: " + pizza.getDescription());
    System.out.printf("Total cost:  $%.2f%n", pizza.getPrice());


    Pizza doubleCheese = new Cheese(new Cheese(new BasicPizza()));
    System.out.println();
    System.out.println("Description: " + doubleCheese.getDescription());
    System.out.printf("Total cost:  $%.2f%n", doubleCheese.getPrice());
}
}