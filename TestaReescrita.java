package certificacao;

import java.io.IOException;

class A{
    public void metodo(){
        System.out.println("a");
    }
}
class B extends A{
    public void metodo(){
        System.out.println("b");
        super.metodo();
    }
    public void metodo2(){
        System.out.println("c");
        metodo();
        super.metodo();
    }
        
    
    public static void main(String[] args) {
        new B().metodo2();
    }
}


class Veiculo {
    public void liga() throws java.io.IOException{
        System.out.println("O veiculo esta sendo ligado!");
    }

}

class Helicoptero extends Veiculo{
    public void liga() throws java.io.FileNotFoundException {
        System.out.println("Ligando o helicoptero");
 }
}
abstract class Droid extends Veiculo {
    public abstract void liga();
}
class HexaDroid extends Droid {
    public void liga() {
        System.out.println("hexa");
    }
}

class FabricaDeVeiculo {
    Veiculo fabrica() {
        return new Veiculo();
    }
}

class FabricaDeHexaDroid extends FabricaDeVeiculo {
    HexaDroid fabrica() {
        return new HexaDroid();
    }
}

public class TestaReescrita {
    static void metodo(Veiculo v) throws IOException {
        v.liga();
    }
    
    public static void main(String[] args) throws java.io.IOException{
        metodo(new HexaDroid());
        metodo(new Veiculo());
        metodo(new Helicoptero());

    }
}
