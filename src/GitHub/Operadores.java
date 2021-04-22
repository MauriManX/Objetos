package GitHub;

/**
 *
 * @author Mauricio
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a=20,b=10,c=0,d=20,e=40,f=30;
    boolean condition=true;
    
    //operador pre-incremento
    //a=a+1 entoces c=a
    
    c=++a;
    System.out.println("Valor de C(++a)= "+c );
    
    //Operador de post-incremento (b toma el valor 11
    //c=b entonces b=b+1
    c=b+1;
    System.out.println("Valor de C (b++)= "+c);
    
    //Operador de Pre-decremento
    //d=d-1 entonces c=d
    c=-d;
    System.out.println("Valor de c(-d)= "+c);
    
    //Operador de postdecremento
    //c=e entonces e=e-1 (e toma el valor de 39)
    c=-e;
    System.out.println("Valor de c(e-)= "+c);
    
    //Operador logico not
    System.out.println("Valor de !condition= "+ !condition);
    }
    
}
