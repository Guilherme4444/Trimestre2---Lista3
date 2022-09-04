package Ex10.SubClass;

import Ex10.SupClass.Animal;

public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nome) {
        super(nome);
    }
    
    public String mia() {
        return "miau";
    }
}