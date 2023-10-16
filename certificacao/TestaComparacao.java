package certificacao;

public class TestaComparacao {
    public static void main (String [] args) {

       //numero inteiro comparado com flutuante não da preciso
       System.out.println(1 == (100.0 /100.0));
       
        int idade = 25;
       System.out.println(idade = 25);

       boolean mentira = false;
       System.out.println(mentira = true);
       
        //System.out.println(true == "true");

        System.out.println(true == true);
        System.out.println(true != false);

        System.out.println(1.0f == 1.0d);
        System.out.println(1.0f == 1l);

        System.out.println(1 == 1.0);
        System.out.println(1 != 1);

        System.out.println(2 >= 1);
        System.out.println(2 <= 1);
        System.out.println( 2 > 1);
        System.out.println(2 < 1);

    }
    
}
