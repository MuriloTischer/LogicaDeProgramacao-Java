package logicadeprogramacao;


/*
* CLASSE DE EXEMPLO PARA EXERCICIO DE CONTROLE DE FLUXO E BLOCOS.
 */
public class ControleFluxoBlocos {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.60;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Funalo";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2 " +( i1 == i2 ));
        System.out.println("i1 != i2 " +( i1 != i2 ));
        System.out.println("i1 > i2 " +( i1 > i2 ));
        System.out.println("i1 <= i2 " +( i1 <= i2 ));
        System.out.println();

        System.out.println("f1 == f2 " +( f1 == f2 ));
        System.out.println("f1 != f2 " +( f1 != f2 ));
        System.out.println("f1 >= f2 " +( f1 >= f2 ));
        System.out.println("f1 < f2 " +( f1 < f2 ));
        System.out.println();

        System.out.println("c1 == c2 " +( c1 == c2 ));
        System.out.println("c1 != c2 " +( c1 != c2 ));
        System.out.println("c1 > c2 " +( c1 > c2 ));
        System.out.println("c1 <= c2 " +( c1 <= c2 )); // nota: com o operador char eh possivel a compraracao de tamanhos
        System.out.println();

        System.out.println("s1 ==s2 " +( s1 == s2 ));
        System.out.println("s1 == s3 " +( s1 == s3 ));
        System.out.println("s1 != s2 " +( s1 != s2 ));
        //- nota: em Strings nao eh possivel fazer uma compracao de maior ou menor que.
        // System.out.println("s1 <= s2 " +( s1 <= s2 ));
        System.out.println();

        System.out.println("b1 == b2 " +( b1 == b2 ));
        System.out.println("b1 != b2 " +( b1 != b2 ));
        //nota: em condicionais booleanas tambem nao eh possivel utilizar as comparacoes de maior ou menor que
        //System.out.println("b1 < b2 " +( b1 < b2 ));
        //System.out.println("b1 >= b2 " +( b1 >= b2 ));
        System.out.println();

        System.out.println("i2 > f1 " + (i2 > f1));
        System.out.println("d1 == h1 " +(c1 == h1));
        System.out.println();

        System.out.println("l1 == i2 " +(l1 == i2));
        System.out.println("l2 >= i1 " +(l2 >= i1));
        System.out.println("y1 != h1 " +(y1 != h1));





    }
}
