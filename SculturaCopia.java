public class SculturaCopia extends Scultura{
    private String falsario;
    private boolean autenticata;
    private int copie;

    public SculturaCopia(Scultura scultura, String falsario, boolean autenticata, int copie) {
        super(scultura);
        this.falsario = falsario;
        this.autenticata = autenticata;
        this.copie = copie;
    }
}