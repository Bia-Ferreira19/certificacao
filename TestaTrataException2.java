import java.io.IOException;

class SaldoInsuficienteException extends Exception{
    SaldoInsuficienteException(String msg) {
        super(msg);
    }
}


class ContaDoBem {
    double saldo = 100;
    void saca(double quantidade) {
        if(this.saldo < quantidade) {
            throw new java.io.IOException("Saldo insuficiente " + saldo + " para sacar " + quantidade);
            }
        saldo -= quantidade;
    }
}

class TestaTrataException3 {
    public static void metodo1() {
        try {
         new ContaDoBem().saca(500);
        }catch(NullPointerException ex){
            System.out.println("tratei nullpointer");
        }catch(RuntimeException ex) {
            System.out.println("tratei runtime");
        } catch(SaldoInsuficienteException ex) {
            System.out.println("tratei saldo");
        }
    }  
}



public static void mains(String args[]) {
    metodo1();
}



public class TestaTrataException2 {

    public static void metodo1() {
        System.out.println("primeiro antes");
        try{
            metodo2();
            System.out.println("primeiro depois");
        } catch(NullPointerException ex) {
            System.out.println("tratei");
        }
        System.out.println("fim do metodo 1");
    }
    public static void metodo2() {
        String s = null;
        System.out.println("segundo antes");
        s.length();
        System.out.println("segundo depois");
    }

    public static void main(String[] args) {
        metodo1();
    }
}
