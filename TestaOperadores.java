package certificacao;
import java.util.ArrayList;

public class TestaOperadores {
    public static void main (String [] args) {
          //Quando trabalhamos com objetos trabalhamos com referencias para aquele objeto na memória
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> lista2 = lista;
        
                        //char -> int e long
        // byte -> short-> int-> long (eles cabem no float e no double)
        // float-> double
        // char

        int a = 10;
        long b = 20;
        short c = 3;
        byte d = 4;
        char h = 65;

        //float cabe dentro do double
        double e = 30.0;
        float f = 40.3f;

        //operador de atribuição com referencia está copiando a referencia
        // -abrangente -> +abrangente
       // +abrangente -> -abrangente (não compila)
       //No caso dos literais byte
       //                     char
        //                   short
        // o compilador verifica se o valor é válido
    }
}
