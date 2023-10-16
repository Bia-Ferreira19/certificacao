class Carros {
    Carro c1;
    Carro c2;
} 
class TestaCicloDeVida {
    public static void main (String[] args) {
        Carros carros = new Carros();

        Carro c = new Carro();
        c.ano = 2014;
        c.modelo = "Ferrari";
        carros.c1 = c;

        c = new Carro();
        carros.c2 = c;

        c = null;

        if(15 > 10){
            Carro c2 = new Carro();
            c2.ano = 2010;
        }
        Carro c3;
        for (int i=0; i < 10; i ++) {
             c3 = new Carro();
        }

    }
}
