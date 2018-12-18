public class PRU03E05PizzaTest_Ivan_Cabellos {
    public static void main(String[] args) {

        PRU03E05Pizza_Ivan_Cabellos pizza = new PRU03E05Pizza_Ivan_Cabellos(TipusPizza.quatre_formatges, MidaPizza.familiar);
        System.out.println("Cream la primera pizza: " + pizza.toString());
        PRU03E05Pizza_Ivan_Cabellos pizza2 = new PRU03E05Pizza_Ivan_Cabellos(TipusPizza.funghi, MidaPizza.mitjana);
        System.out.println("Cream la segona pizza: " + pizza2.toString());

        PRU03E05Pizza_Ivan_Cabellos.getNumeroDemandes();
        PRU03E05Pizza_Ivan_Cabellos.getNumeroServides();

        PRU03E05Pizza_Ivan_Cabellos pizza3 = new PRU03E05Pizza_Ivan_Cabellos(TipusPizza.margarita, MidaPizza.mitjana);
        System.out.println("Cream la tercera pizza: " + pizza3.toString());

        PRU03E05Pizza_Ivan_Cabellos.getNumeroDemandes();

        pizza2.sirvePizza();
        pizza3.sirvePizza();
        PRU03E05Pizza_Ivan_Cabellos.getNumeroServides();

        pizza.sirvePizza();
        PRU03E05Pizza_Ivan_Cabellos.getNumeroDemandes();
        PRU03E05Pizza_Ivan_Cabellos.getNumeroServides();

    }
}
