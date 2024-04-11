public class Main {


    public static void main(String[] args) {
        getSoma();
        getFibo();
        Sequencias();
        inverterString();

    }

    public static void getSoma(){
        Integer soma = 0;
        Integer k = 0;
        Integer indice = 13;
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);
    }

    public static void getFibo(){
        int numero = 34;
        int a = 0;
        int b = 1;

        while(b < numero){
            int x = b;
            b = a + b;
            a = x;
        }
        if(b == 0 || b == numero || b == 1){
            System.out.println("é Fibo!");
        }else{
            System.out.println("não é Fibo!");
        }
    }
    public static void Sequencias(){

        // Sequência a)
        System.out.println("Sequência a)");
        int[] sequenciaA = {1, 3, 5, 7};
        imprimirProximoElemento(sequenciaA);

        // Sequência b)
        System.out.println("\nSequência b)");
        int[] sequenciaB = {2, 4, 8, 16, 32, 64};
        imprimirProximoElemento(sequenciaB);

        // Sequência c)
        System.out.println("\nSequência c)");
        int[] sequenciaC = {0, 1, 4, 9, 16, 25, 36};
        imprimirProximoElemento(sequenciaC);

        // Sequência d)
        System.out.println("\nSequência d)");
        int[] sequenciaD = {4, 16, 36, 64};
        imprimirProximoElemento(sequenciaD);

        // Sequência e)
        System.out.println("\nSequência e)");
        int[] sequenciaE = {1, 1, 2, 3, 5, 8};
        imprimirProximoElemento(sequenciaE);

        // Sequência f)
        System.out.println("\nSequência f)");
        int[] sequenciaF = {2, 10, 12, 16, 17, 18, 19};
        imprimirProximoElemento(sequenciaF);
    }

    public static void imprimirProximoElemento(int[] sequencia) {
        int ultimo = sequencia[sequencia.length - 1];
        int penultimo = sequencia[sequencia.length - 2];
        int diff = ultimo - penultimo;

        System.out.println("O próximo elemento é: " + (ultimo + diff));
    }

    public static void inverterString(){
        String texto = "Hello, world!";
        String textoInvertido = stringReverso(texto);
        System.out.println("String original: " + texto);
        System.out.println("String invertida: " + textoInvertido);
    }

    public static String stringReverso(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            // Troca os caracteres
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            // Move os ponteiros de inicio e fim
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}
