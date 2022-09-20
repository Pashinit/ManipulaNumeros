
package manipulanumbers;

public class Carro {

    public static void calculaValorFinal() {
        float x;
        System.out.println("Custo de Fábrica: ");
        x = ManipulaNumbers.read.nextFloat();
        
        x = (float) (x + (x*0.28)+(x*0.45));
        
        System.out.println("Custo ao consumidor: "+x);    }
    
}
