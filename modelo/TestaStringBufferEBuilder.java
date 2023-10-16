 class TestaStringBufferEBuilder {
    public static void main (String [] args) {
        StringBuilder sb = new StringBuilder("Caelum");
        sb.append ("-");
        sb.append("Ensino e Inovação");
        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder(50);
        System.out.println(sb2.toString());

        StringBuilder sb3 = new StringBuilder(sb);
        sb3.append(" e Alura e Casa do Código");
        sb3.append('x');
        sb3.append(sb);
        sb3.append(new Carro());
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("Caelum - Inovação");
        sb4.insert(9, "Ensino e ");
        System.out.println(sb4);
        sb4.delete(6,15);
        System.out.println(sb4);

        String valor = sb4.toString();
        System.out.println(new StringBuffer("guilherme").reverse());
        
        StringBuilder sb5 = new StringBuilder("Caelum - Ensino e Inovação");
        System.out.println(sb5.substring(6,15));
        System.out.println(sb5.subSequence(6, 15));
        System.out.println(sb5);
    }   
}
