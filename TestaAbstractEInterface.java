abstract class SemMetodo {

}
abstract class ComMetodoAbstrato {
    abstract void executa();
    void liga() {

    }
    void desliga() {

    }
}
interface Veiculo {
     void liga();
}
abstract class Moto implements Veiculo {

}
 class Carro implements Veiculo, Runnable {
    public void liga() {

    }
    public void run(){
        
    }

}
abstract class CarroAutomatico extends Carro {
    public abstract void liga();
}
abstract class CarroAutomaticoBonito extends CarroAutomatico {

}
class TestaAbstractEInterface {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.liga();
        //new SemMetodo();
        //new ComMetodoAbstrato(); 
    }
}