package java_curso;

public abstract class SerVivo {

    protected int idade;

    public SerVivo(int idade){
        this.idade = idade;
    }

    public SerVivo(String number) {

    }

    public abstract void respirar();

}
