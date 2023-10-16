package certificacao;

import certificacao.TestaHerança.W.Gato;
import certificacao.TestaHerança.W.Z;

public class TestaHerança {
    class Beatriz {

    }
    class Mae {

    }
    class Filha extends Mae {

    }
    class Neta extends Filha {

    } 
    class X {
        int x;
        public void y () {
            System.out.println("Invocando y em um objeto");
        }
    }   
    class Y extends X {

    }
    class W {
        public static void metodo() {
            System.out.println("invocando o metodo estatico que foi definido em W");
        }
        class Z extends W {
 public static void metodo() {
            System.out.println("invocando o metodo estatico que foi definido em Z");
        }
        }
        class Gato {
            String corDosOlhos;
            public String toString() {
                return "[Gato" + corDosOlhos + "]";
            }
        }
    }
    class TestaHeranca {
        public static void main(String[] args) {
            Gato g  =  Gato();
            g.corDosOlhos = "mel";
            System.out.println(g.toString());

            
            y y = new y();
            y.x = 15;
            y.y();

            W.metodo();
            Z.metodo();

            z z = new z();
            z.metodo();

            w w = new w();
            w.metodo();
        }
    }
    public static Gato Gato() {
        return null;
    }
}
