package certificacao;

public class TestaOperadoresLogicos {
    public static boolean metodo (String msg) {
        System.out.println(msg);
        return true;
    }
    public static void maind (String [] args) {
        //Um é igual a um? Verdadeiro. Verdadeiro ou qualquer coisa é verdadeiro, então ele nem executa esse cara. 
        //System.out.println(1 == 1 &&  metodo ("primeiro"));//
        System.out.println(1 != 1 &&  metodo ("segundo"));
        System.out.println(1 == 1 ||  metodo ("terceiro"));
        System.out.println(1 == 1 ^ 1 > 2);
        System.out.println(!(1 == 1));
    }
}
