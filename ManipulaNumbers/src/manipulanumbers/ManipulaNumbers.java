
package manipulanumbers;

import java.util.Scanner;

public class ManipulaNumbers {
    
    public static Scanner read = new Scanner(System.in);
    public static int x,y;
    
    public static void main(String[] args) {
        
        int op;
        do{
            System.out.println("Menu de Operações com números");
            System.out.println("1 - Maior de 2 números");
            System.out.println("2 - Ordenar valores em decrescente");
            System.out.println("3 - Somar impares, multiplica pares");
            System.out.println("4 - Trocar Numeros");
            
            System.out.println("0 - Sair");
            System.out.println("Selecione a opção pretendida");
            op = read.nextInt();
            
            switch (op){
                case 0: break;
                case 1:
                    levalores("Insira um valo: ","Insira outro valor: ");
                    MaiorNumero.maior2(x,y);
                    break;
                case 2:
                    do{
                    le1Valor("Insira um valor: ");
                    NumeroDecrescente.ordenaDecrescente(x);
                    }while (x<=0);
                    break;
                case 3:
                    somaImparesMultiplicaPares();
                    break;
                case 4:
                    levalores("Insira o numA:","Insira o numB");
                    TrocaNumero.troca(x,y);
                    break;
                default : System.out.println("Insira opção válida!");
            }
        }while(op!=0);
    }

    private static void levalores(String s1, String s2) {
        System.out.println(s1);
        x = read.nextInt();
        System.out.println(s2);
        y = read.nextInt();        
    }

    private static void le1Valor(String s1) {
        System.out.println(s1);
        x = read.nextInt(); 
    }

    private static void somaImparesMultiplicaPares() {
        long multP;
        int somaI;
        multP = 1;
        somaI = 0;
        
        for (int i=1; i<=30; i++){
            if (i%2 != 0)
                somaI += i;
            else if (i%2 == 0)
                multP *= i;
        }
        System.out.println("Multiplicação dos pares: "+multP);
        System.out.println("Soma dos impares: "+somaI);
    }
    
}
