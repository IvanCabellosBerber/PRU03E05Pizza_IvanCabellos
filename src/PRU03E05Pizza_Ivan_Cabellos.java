public class PRU03E05Pizza_Ivan_Cabellos {

    private TipusPizza tipusPizza;
    private MidaPizza midaPizza;
    private EstatPizza estatPizza = EstatPizza.demanada;
    private static int numeroDemandas;
    private static int numeroServides;

    public PRU03E05Pizza_Ivan_Cabellos(TipusPizza tipusPizza, MidaPizza midaPizza){
        this.tipusPizza = tipusPizza;
        this.midaPizza = midaPizza;
        aumentaNumDemandas();
    }

    public TipusPizza getTipusPizza() {
        return tipusPizza;
    }

    public void setTipusPizza(TipusPizza tipusPizza) {
        this.tipusPizza = tipusPizza;
    }

    public MidaPizza getMidaPizza() {
        return midaPizza;
    }

    public void setMidaPizza(MidaPizza midaPizza) {
        this.midaPizza = midaPizza;
    }

    public EstatPizza getEstatPizza() {
        return estatPizza;
    }

    public void setEstatPizza(EstatPizza estatPizza) {
        this.estatPizza = estatPizza;
    }

    private void aumentaNumDemandas(){
        numeroDemandas++;
    }

    public static void getNumeroDemandas(){
        System.out.println("Demandes de pizzes: " + numeroDemandas);
    }

    public void sirvePizza(){
        estatPizza = EstatPizza.servida;
        numeroServides++;
    }

    public static void getNumeroServides(){
        System.out.println("Pizzes servides totals: " + numeroServides);
    }

}
