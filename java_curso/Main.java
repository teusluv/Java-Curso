package java_curso;
//public -> é quando quero deixar publico
//default -> quando eu nao defino
//private -> acessivel somente dentro da claase que foi definido
//protected -> acessivel para todo mundo no mesmo pacote

public class Main {

    public static void main(String[] args) {

        Carro meuCarro = new BMW();
        Carro meuCarro2 = new Mobi();

        meuCarro.acelerar();

        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();



    }
}

/*       static class Carro {
        String modelo;

        public Carro(String modelo) {
            this.modelo = modelo;


        }

        public String  ligar() {
            System.out.println("Ligando" +  this.modelo);
            return "Ligando";
        }
    }
}
*/