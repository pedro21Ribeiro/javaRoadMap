package abstraction;

abstract class Banco{
    int taxa;
    
    Banco (int taxa){
        this.taxa = taxa;
    }
    abstract int getTaxa();
}

class Itau extends Banco{
    @Override
    int getTaxa(){
        return taxa;
    }

    Itau (int taxa){
        super(taxa);
    }
}

class BB extends Banco{
    @Override
    int getTaxa(){
        return taxa+1;
    }

    BB (int taxa){
        super(taxa);
    }
}

public class Main {
    public static void main(String[] args) {
        Banco b = new Itau(5);
        System.out.println(b.getTaxa());
        b = new BB(10);
        System.out.println(b.getTaxa());
    }    
}
