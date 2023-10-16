// Casting é (int), colocar o tipo primitivo em ()

package certificacao;

public class TestaCasting {
    public static void main (String [] args) {
        double d = 0.99999999;
        int i = (int) d;
        System.out.println(i);

       int x = 200;
       byte b = (byte) x;
       System.out.println(b);

        int i1 = 3/2;
        double i2 = 3/2;
        double i3 = 3/2.0;

        long y = 0; double a = 0;
        double zero = x + d;
        System.out.println(i1 + i2 + i3 + y + a + zero);

        }
}
