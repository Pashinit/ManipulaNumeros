
package manipulanumbers;

public class Credito {

    public static void calculaCredito() {
        int x;
        System.out.println("Saldo médio do ultimo ano: ");
        x = ManipulaNumbers.read.nextInt();
        
        switch (x/201){
            case 0:
                System.out.println("Saldo médio do ultimo ano: "+x);
                System.out.println("Crédito: Nenhum");
                break;
            case 1:
                System.out.println("Saldo médio do ultimo ano: "+x);
                System.out.println("Crédito: "+(x*0.20));
                break;
            case 2:
                System.out.println("Saldo médio do ultimo ano: "+x);
                System.out.println("Crédito: "+(x*0.30));
                break;
            default:
                System.out.println("Saldo médio do ultimo ano: "+x);
                System.out.println("Crédito: "+(x*0.40));               
        }
        
    }
    
}
