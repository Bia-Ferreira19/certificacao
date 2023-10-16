package metodos;

class Calculadora {
    public int soma (int... numeros) {
        int soma = 0;
        for(int i = 0; i< numeros.length; i++) {
            soma += numeros [i];
        }
        return soma;
    }
}
 class TestaCalculadora {
    public static void main (String [] args) {
        Calculadora c = new Calculadora();
       System.out.println( c.soma(3,5)); 
       System.out.println( c.soma(3,5,10)); 
       System.out.println( c.soma(3,10,4)); 
       System.out.println( c.soma(3,5,10,4,5));
       System.out.println( c.soma(3,5,10,4,5,1,2,3,4,5));
       System.out.println( c.soma(3)); 
       System.out.println( c.soma()); 

 


    }
}
