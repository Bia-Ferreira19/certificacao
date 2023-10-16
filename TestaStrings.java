package certificacao;

public class TestaStrings {
    public static void main (String[] args) {
       String texto = "Pretendo fazer a prova de certificação de Java";
       System.out.println(texto.indexOf("Pretendo"));
       System.out.println(texto.indexOf("e"));
       System.out.println(texto.indexOf("Pretendia"));
       System.out.println(texto.indexOf("tendo"));
       System.out.println(texto.indexOf("a"));
       System.out.println(texto.lastIndexOf("tendo"));
       System.out.println(texto.lastIndexOf("Pretendia"));
       System.out.println(texto.indexOf("e", 7));
       System.out.println(texto.lastIndexOf("a", 44));
       System.out.println(texto.startsWith("Pretendia"));
       System.out.println(texto.startsWith("Pretendo"));
       System.out.println(texto.endsWith("Java"));
       System.out.println(texto.endsWith("C#"));




        /*System.out.println("Java".equals("java"));
       System.out.println("Java".equalsIgnoreCase("java"));

       System.out.println("Certificado".compareTo("Arnaldo"));
       System.out.println("Certificado".compareTo("Certificado"));
       System.out.println("Certificado".compareTo("Grécia"));
       System.out.println("Certificado".compareTo("certificado"));
       System.out.println("Certificado".compareToIgnoreCase("certificado"));

       
       
        String java = "Java";
        System.out.println(java.substring(1));
        System.out.println(java.substring(-1));
        System.out.println(java.substring(0, 4));
        System.out.println(java.substring(1,4));
        System.out.println(java.substring(0,3));

        
        String parseado = "  Quero tirar um certificado oficial de Java!  ".toUpperCase().trim();
        System.out.println(parseado);
        
        
        String s = "caelum";
        s = s.toUpperCase();
        System.out.println(s);

        System.out.println(s.charAt(0));
         System.out.println(s.charAt(200));
        System.out.println(s.length());
        System.out.println("".isEmpty());
        System.out.println("guilherme".isEmpty());
        System.out.println("   ".isEmpty());

        System.out.println("   joao  ".trim());
        System.out.println(s.replace('A', 'E'));
        System.out.println(s.replace("CAE","ALU"));

        String nomeDireto = "Java";
        String nomeIndireto = new String("Java");
        char[] nome = new char[]{'J','a','v','a'};
        String nome1 = new String(nome);

        StringBuilder sb1 = new StringBuilder("Java");
        String nome2 = new String(sb1);

        String nomeNulo = null;

        String nomeDaProva = "Certificação" + " " + "Java";
        String nomeDaProvaComNulo = nomeDaProva + " " + nomeNulo ;
        System.out.println(nomeDaProva);
        System.out.println(nomeDaProvaComNulo);
        System.out.println(nomeNulo.toString()); 

        System.out.println("Certificação " + 1500);
        System.out.println(1500 + "Certificação " );
        System.out.println(15 + 00 + "Certificação");
        System.out.println(1 + 500 + "Certificação"); */

    }

    
} 
    

