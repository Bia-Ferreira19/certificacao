public class TestaTrataException {
    public static void maina (String[] args) {
        String nome = null;
        try{
        nome.toLowerCase();
            System.out.println("linha seguinte");
        } catch(NullPointerException ex) {
            System.out.println("peguei a exception");
        }
        System.out.println("terminei");
        }
}
