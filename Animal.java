package Ex10.SupClass;

public abstract class Animal {
    
    protected String nome;
    protected String raca;

    public Animal() {}

    public Animal(String nome) {
        this.nome = nome;
    }

    public String caminha() {
        return "Caminhando...";
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

}