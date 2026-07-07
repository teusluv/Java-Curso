package java_curso;

public class BMW implements Carro {

    @Override
    public void acelerar() {
        System.out.println("acelerando");
    }

    @Override
    public void freiar() {
         System.out.println("freiando");
    }

    @Override
    public void parar() {
        System.out.println("parando");
    }
}
