package Ex10.SubClass;

import Ex10.SupClass.Animal;

public class Cachorro extends Animal{

    public Cachorro() {
    }

    public Cachorro(String nome) {
        super(nome);
    }
    
    public String late() {
        return "RUF RUF!";
    }
}