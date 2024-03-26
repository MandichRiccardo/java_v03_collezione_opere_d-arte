public class Quadro extends OperadArte{
    private double altezza;
    private double larghezza;

    public Quadro(String titolo, String artista, double altezza, double larghezza) {
        super(titolo, artista);
        this.altezza = altezza;
        this.larghezza = larghezza;
    }
    public Quadro() {
        super();
        System.out.println("inserisci l'altezza di questo quadro");
        this.altezza = getDouble();
        System.out.println("inserisci la larghezza di questo quadro");
        this.larghezza = getDouble();
    }

    @Override
    public double printIngombro() {
        return altezza * larghezza;
    }

    @Override
    public void modifica() {
        System.out.println("""
                premi il relativo numero per modificarne la caratteristica
                    0)\tfine modifica
                    1)\taltezza
                    2)\tlarghezza
                    3)\tartista
                    4)\ttitolo""");
        switch (getInt()){
            default -> {
                return;
            }
            case 1 -> {
                System.out.println("quanto è alto questo quadro?");
                this.altezza = getDouble();
            }
            case 2 -> {
                System.out.println("quanto è largo questo quadro?");
                this.larghezza = getDouble();
            }
            case 3 -> {
                System.out.println("che artista ha creato quest'opera?");
                setArtista(getString());
            }
            case 4 -> {
                System.out.println("qual'è il titolo di quest'opera?");
                setTitolo(getString());
            }
        }
        modifica();
    }

    @Override
    public String toString() {
        String info = super.toString();
        info += "\taltezza:\t" + altezza + "\n";
        info += "\tlarghezza:\t" + larghezza + "\n";
        return info;
    }
}