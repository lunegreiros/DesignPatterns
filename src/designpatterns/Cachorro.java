package designpatterns;

public class Cachorro extends Animal{
    
    // metodo local cavarBuraco()
    public void cavarBuraco(){
        System.out.println("Eu cavo buracos!");
    }
    
    // initicializar cada objeto criado (instanciado)
    public Cachorro(){
        // referenciar a superclass
        super();
        //usar o metodo da super class
        setSom("Latido");
    }
}
