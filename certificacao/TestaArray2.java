package certificacao;

public class TestaArray2 {
    public static void main(String[] args) {

        Cliente[] clientes = new Cliente[10];
        for(int i = 0; i< clientes.length; i++){
            clientes[i] = new Cliente();
            clientes[i].nome = "Mario";
        }
        for(Cliente c : clientes){
        System.out.println(c.nome);

        }
        Cliente clientes2[] = new Cliente[5];
        clientes2[0] = new Cliente ();
        clientes[1] = new ClienteEspecial();
    }
    
}

class Cliente {
    String nome;
}
class ClienteEspecial extends Cliente{}
