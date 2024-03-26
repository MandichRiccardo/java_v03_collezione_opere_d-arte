public class Scultura extends OperadArte{
    private double altezza;
    private double larghezza;
    private double profondita;
    private String materiale;

    public Scultura(String titolo, String artista, double altezza, double larghezza, double profondita, String materiale) {
        super(titolo, artista);
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
        this.materiale = materiale;
    }
    public Scultura() {
        super();
        System.out.println("inserisci l'altezza di questo scultura");
        this.altezza = getDouble();
        System.out.println("inserisci la larghezza di questo scultura");
        this.larghezza = getDouble();
        System.out.println("inserisci la profondità di questa scultura");
        this.profondita = getDouble();
        System.out.println("inserisci il materiale di cui è fatta la scultura");
        this.materiale = getString();
    }

    @Override
    public double printIngombro() {
        return altezza * larghezza * profondita;
    }

    @Override
    public void modifica() {
        System.out.println("""
                premi il relativo numero per modificarne la caratteristica
                    0)\tfine modifica
                    1)\taltezza
                    2)\tlarghezza
                    3)\tprofondità
                    4)\tmateriale
                    5)\tartista
                    6)\ttitolo""");
        switch (getInt()){
            default -> {
                return;
            }
            case 1 -> {
                System.out.println("quanto è alta questa scultura?");
                this.altezza = getDouble();
            }
            case 2 -> {
                System.out.println("quanto è larga questa scultura?");
                this.larghezza = getDouble();
            }
            case 3 -> {
                System.out.println("quanto è profonda questa scultura?");
                this.profondita = getDouble();
            }
            case 4 -> {
                System.out.println("di che materiale è questa scultura?");
                this.materiale = getString();
            }
            case 5 -> {
                System.out.println("che artista ha creato quest'opera?");
                setArtista(getString());
            }
            case 6 -> {
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
        info += "\tprofondità:\t" + profondita + "\n";
        info += "\tmateriale:\t" + materiale + "\n";
        return info;
    }
}