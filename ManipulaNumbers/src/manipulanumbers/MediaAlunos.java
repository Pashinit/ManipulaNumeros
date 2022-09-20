
package manipulanumbers;

class MediaAlunos {
    public static int [] notas;
    static void registaNotas() {
        int n;
        System.out.println("Quantas notas que inserir: ");
        n = ManipulaNumbers.read.nextInt();
        notas = new int[n];
        for(int x=0; x<n;x++){
            System.out.println("Insira nota: ");
            notas[x] = ManipulaNumbers.read.nextInt();
        }
        mediaAluno();
    }

    private static void mediaAluno() {
        int tam = notas.length;
        int soma = 0;
        for(int x=0;x<tam;x++)
            soma+=notas[x];
        System.out.println("Média do aluno: "+(1.0*soma/tam));
    }
    
}
