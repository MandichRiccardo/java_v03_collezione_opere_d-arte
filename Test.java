public class Test{
    public static void main(String[] args) {
        esecuzione(new Collezione());
    }

    public static void esecuzione(Collezione collection){
        System.out.println("""
                cosa vuoi fare?
                    0)\tterminare l'esecuzione
                    1)\taggiungere un'opera d'arte
                    2)\trimuovere un'opera d'arte
                    3)\tmodificare la collezione
                    4)\tavere la descrizione della collezzione""");
        switch (OperadArte.getInt()){
            default -> {
                return;
            }
            case 1 -> {
                System.out.println("è una scultura?\t(altrimenti creo un quadro)");
                if(getBoolean()) collection.add(new Scultura());
                else collection.add(new Quadro());
            }
            case 2 -> {
                System.out.println("è una scultura?\t(altrimenti rimuovo un quadro)");
                if(getBoolean()) collection.add(new Scultura());
                else collection.remove(new Quadro());
            }
            case 3 -> collection.modifica();
            case 4 -> System.out.println(collection.toString());
        }
        esecuzione(collection);
    }

    private static boolean getBoolean() {
        try {
            return new java.util.Scanner(System.in).nextBoolean();
        }catch (java.util.InputMismatchException e){
            System.out.println("devi inserire un booleano nel formato \"true\"/\"false\"");
            return getBoolean();
        }
    }
}