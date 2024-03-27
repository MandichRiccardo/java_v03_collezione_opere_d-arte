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
    public SculturaCopia(Scultura scultura) {
        super(scultura);
        System.out.println("chi è l'autore di questa/e copia/e");
        this.falsario = getString();
        System.out.println("questa/e copia/e è/sono stata/e autenticata/e?");
        this.autenticata = Test.getBoolean();
        System.out.println("quante copie vengono create?");
        this.copie = getInt();
    }
}