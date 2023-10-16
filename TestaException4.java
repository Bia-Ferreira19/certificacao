import java.util.ArrayList;
import java.util.Date;

class NovaConta{
    double saldo = 100;
    public void saca(double valor) {
        if(saldo<valor) {
            throw new IllegalArgumentException();
        }
        saldo -= valor;
    }
}
class TestaTrataException4 {
public static void main(String[] args) {
    String numero1 = "la";
    int um = Integer.parseInt(numero1);

    Object o = "beatriz";
    Date data = (Date) o;

    String s = null;
    s.length();

    ArrayList<String> lista = new ArrayList<String>();
    lista.add("beatriz");
    lista.add("emelin");

    lista.get(2);
}
}