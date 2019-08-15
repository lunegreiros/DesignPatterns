package designpatterns;

public class AnimaisMain {

    public static void main(String[] args) {
        // criar um novo cachorro
        Cachorro fido = new Cachorro();
        fido.setNome("Fido");
        System.out.println(fido.getNome());
        
        fido.cavarBuraco();
        fido.setPeso(-1);
    }
    
}
