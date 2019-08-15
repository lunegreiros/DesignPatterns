package designpatterns;

public class Animal {
    private String nome;
    private int peso;
    private double altura;
    private String som;

    
    // metodos getter and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPeso(int peso){
        if(peso > 0){
            this.peso = peso;
        } else{
            System.out.println("O peso deve ser maior que zero");
        }
    }
    public int getPeso(){
        return peso;
    }
    
    public String getSom(){
        return som;
    }
    
    public void setSom(String som){
        this.som = som;
    }
    
    
    
}
