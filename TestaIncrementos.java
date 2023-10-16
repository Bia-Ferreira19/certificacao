package certificacao;

class TestaIncrementos{
    public  static void main(String[] args){
        
        int a = 10;
        a += ++a + a + ++a;

        //a = a ++a + a + ++a;
        //a = 10 ++a + a + ++a;
       // a = 10 + 11 + a + ++a;
        //a = 10 + 11 + 11 + ++a;
       // a= 10 + 11 + 11 + 12;
        //a = 44;
        System.out.println(a);
        
        
        int i = 5;
        System.out.println(--i);

        i += 2;
        i -= 2;
        i *= 5;
        i /= 10;
        i *= 100;
        i %= 3;
        System.out.println(i+=3);

        byte b = 10;
        b += 200;
        System.out.println(b);

    }
    
    

}
    