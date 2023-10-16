class Veiculo {
    double velocidade;
}
class Carro extends Veiculo {
double velocidade;
double velocidadeDoCarro(){
    return this.velocidade;
}
double velodidadeDoVeiculo() {
    return super.velocidade;
}
}


class Mae {
    long numeroGrande;
    long segundoNumeroGrande;
    Mae(){
    }
    Mae(String s) {
        System.out.println("mae");
    }
    Mae(int i) {
    }
}
class Filha extends Mae {
    long segundoNumeroGrande;
    Filha(int i) {
        this("numero: " + i);
        super.numeroGrande = 33;
        super.segundoNumeroGrande= 33;
        this.segundoNumeroGrande = 34;
        i = 33;
        this.s = "Beatriz";
    System.out.println("fim do construstor com numero");
    }
    String s;
    Filha(String s) {
        super(s);
        System.out.println(s);
    }
}
class TestaConstrutores3 {
    public static void main(String[] args) {
        new Filha(567);
        
        Carro c = new Carro();
        c.velocidade = 50;
        System.out.println("carro: " + c.velocidadeDoCarro());
        System.out.println("veiculo: " + c.velodidadeDoVeiculo());

    }
}