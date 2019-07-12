package quiz;

public class PizzaBuilderDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiianPizzabuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(" Pizza ordered has:  ");
        System.out.println(" Dough " + pizza.getDough());
        System.out.println(" Sauce " + pizza.getSauce());
        System.out.println(" Topping " + pizza.getTopping());
    }
}