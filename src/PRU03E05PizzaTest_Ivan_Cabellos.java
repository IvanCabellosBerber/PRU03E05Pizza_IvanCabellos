public class PRU03E05PizzaTest_Ivan_Cabellos {
    public static void main(String[] args) {

        PRU03E05Pizza_Ivan_Cabellos pizza = new PRU03E05Pizza_Ivan_Cabellos(TipusPizza.Quatre_formatges, MidaPizza.familiar);
        System.out.println("Cream la primera pizza: " + pizza.getTipusPizza() + ", " + pizza.getMidaPizza());
        PRU03E05Pizza_Ivan_Cabellos pizza2 = new PRU03E05Pizza_Ivan_Cabellos(TipusPizza.funghi, MidaPizza.mitjana);
        System.out.println("Cream la segona pizza: " + pizza2.getTipusPizza() + ", " + pizza2.getMidaPizza());

        PRU03E05Pizza_Ivan_Cabellos.getNumeroDemandas();
        PRU03E05Pizza_Ivan_Cabellos.getNumeroServides();

        PRU03E05Pizza_Ivan_Cabellos pizza3 = new PRU03E05Pizza_Ivan_Cabellos(TipusPizza.Margarita, MidaPizza.mitjana);
        System.out.println("Cream la tercera pizza pizza: " + pizza3.getTipusPizza() + ", " + pizza3.getMidaPizza());

        PRU03E05Pizza_Ivan_Cabellos.getNumeroDemandas();

        pizza2.sirvePizza();
        pizza3.sirvePizza();

        PRU03E05Pizza_Ivan_Cabellos.getNumeroServides();

        pizza.sirvePizza();

        PRU03E05Pizza_Ivan_Cabellos.getNumeroServides();

    }
}
