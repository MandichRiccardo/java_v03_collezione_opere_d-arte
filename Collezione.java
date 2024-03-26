public class Collezione{
    private String nome;
    private String luogo;
    private OperadArte[] opere;

    public Collezione(String nome, String luogo, int dimensioneCollezione) {
        this.nome = nome;
        this.luogo = luogo;
        this.opere = new OperadArte[dimensioneCollezione];
    }
    public Collezione() {
        System.out.println("come si chiama questa collezione?");
        this.nome = OperadArte.getString();
        System.out.println("dove si trova questa collezione?");
        this.luogo = OperadArte.getString();
        System.out.println("quanto è grande questa collezione?");
        this.opere = new OperadArte[OperadArte.getInt()];
    }

    public void modifica() {
        System.out.println("""
                premi il relativo numero per modificarne la caratteristica
                    0)\tfine modifica
                    1)\tnome
                    2)\tluogo""");
        switch (OperadArte.getInt()){
            default -> {
                return;
            }
            case 1 -> {
                System.out.println("qual'è il nome di questa collezione?");
                this.nome = OperadArte.getString();
            }
            case 2 -> {
                System.out.println("dove si trova questa collezione?");
                this.nome = OperadArte.getString();
            }
            case 3 -> {
                System.out.println("qual'è la dimensione di questa collezione?\nATTENZIONE:\tcambiando la domensione cancellerai tutte le opere");
                this.nome = OperadArte.getString();
            }
        }
        modifica();
    }

    public boolean add(OperadArte o){
        if(opere[opere.length-1] == null){
            int i=0;
            while (opere[i]!=null){
                if(opere[i].equals(o)){
                    System.out.println("quest'opera è già stata inserita nella collezione");
                    return false;
                }
                i++;
            }
            opere[i] = o;
            System.out.println("opera aggiunta con successo");
            return true;
        }else {
            System.out.println("la collezione è piena");
            return false;
        }
    }

    public boolean remove(OperadArte o){
        if(o!=null){
            int i=0;
            while (i<opere.length && opere[i] != null){
                if(opere[i].equals(o)){
                    for(int j=i;j<opere.length-1;j++){
                        opere[j] = opere[j+1];
                    }
                    opere[opere.length-1] = null;
                    System.out.println("opera rimossa con successo");
                    return true;
                }
                i++;
            }
            System.out.println("opera non trovata nella collezione");
            return false;
        }else{
            System.out.println("questa opera d'arte non esiste");
            return false;
        }
    }

    public String toString(){
        String info = "";
        info += "nome:\t" + nome + "\n";
        info += "luogo:\t" + luogo + "\n";
        for(OperadArte o : opere){
            try {
                info = info.concat(o.toString());
                info = info.concat("\tingombro:\t" + o.printIngombro() + "\n\n");
            }catch (NullPointerException e){
                info = info.concat("slot vuoto della collezione\n");
            }
        }
        return info;
    }
}