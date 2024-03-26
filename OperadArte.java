public abstract class OperadArte{
    private String titolo;
    private String artista;

    public OperadArte(String titolo, String artista) {
        this.titolo = titolo;
        this.artista = artista;
    }
    public OperadArte() {
        System.out.println("inserisci il titolo di quest'opera d'arte");
        this.titolo = getString();
        System.out.println("inserisci l'autore di quest'opera d'arte");
        this.artista = getString();
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public abstract double printIngombro();
    public abstract void modifica();

    public boolean equals(OperadArte o){
        if(!this.titolo.equals(o.titolo)) return false;
        if (!this.artista.equals(o.artista)) return false;
        return true;
    }

    public String toString(){
        String info = "";
        info += "\ttitolo:\t" + titolo + "\n";
        info += "\tartista:\t" + artista + "\n";
        return info;
    }

    public static String getString() {
        return new java.util.Scanner(System.in).nextLine();
    }

    public static int getInt(){
        try{
            return new java.util.Scanner(System.in).nextInt();
        }catch (java.util.InputMismatchException e){
            System.out.println("devi inserire un numero intero");
            return getInt();
        }
    }

    public static double getDouble(){
        try{
            return new java.util.Scanner(System.in).nextDouble();
        }catch (java.util.InputMismatchException e){
            System.out.println("devi inserire un numero");
            return getDouble();
        }
    }
}