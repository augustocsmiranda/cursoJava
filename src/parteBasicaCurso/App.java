package parteBasicaCurso;

//import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Aula 24: Saida de Dados em Java
        /*
         * int teste = 1; int teste1 = 2; String nome = "Augusto"; byte umByte = (byte)
         * 128; byte umByte2 = 127; int umShort = 32768; double x = 10.357425; double y
         * = 10224.235;
         * 
         * System.out.println("Hello, World!");
         * System.out.println("Olá, Mundo!! Eu Estou Vivo!");
         * System.out.println("Número Selecionado: " + teste);
         * System.out.println("Número Selecionado: " + teste1);
         * System.out.println("Nome do Estudante: " + nome); int total = teste + teste1;
         * System.out.println("Soma dos testes: " + total); System.out.println("X: " +
         * x); // 2 casas decimais System.out.printf("X: %.2f%n", x);
         * System.out.printf("X: %.4f%n", x); System.out.printf("Y: %.2f%n", y);
         * System.out.printf("Y: %.2f", y); // sem o %n, nao pulou a linha.
         * System.out.println(" Metros."); // Varios elementos em um comando de escrita
         * System.out.printf("A casa tem: %.2f Metros². O quarto tem %.2f Metros².%n",
         * y, x); System.out.println("Fim!");
         */

        /*
         * String nome = "Augusto"; int idade = 37; double renda = 4000.989;
         * System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade,
         * renda);
         */

        // Exercicio da Aula 24

        /*
         * String product1 = "Computer"; String product2 = "Office Desk";
         * 
         * int age = 30; int code = 5290; char gender = 'F';
         * 
         * double price1 = 2100.0; double price2 = 650.50; double measure = 53.234567;
         * 
         * System.out.println("Products: ");
         * System.out.printf("%s, whiche price is $ %.2f%n", product1, price1);
         * System.out.printf("%s, whice price is $ %.2f%n", product2, price2);
         * System.out.println();
         * System.out.printf("Record: %d years old, code %d and gender: %s %n", age,
         * code, gender); System.out.println();
         * System.out.printf("Measue with eight decimal places: %.8f%n", measure);
         * System.out.printf("Rouded (Three Decimal places): %.3f%n", measure);
         * 
         * Locale.setDefault(Locale.US); System.out.printf("US decimal point: %.3f%n",
         * measure);
         */

        // Aula 25 Casting. Conversão e Valores de Variaveis

        /*
         * int a, b; double resultado;
         * 
         * a = 5; b = 2;
         * 
         * resultado = (double) a / b; // o (Double) foi colocado pois a e b são
         * inteiros, o resultado seria 2 e nao // 2.5. Isso tb pode ser usado ao passar
         * um valor de variavel Double para // inteiro.
         * 
         * System.out.println(resultado);
         */

        // Aula 26: Entrada de Dados em java

        /*
         * String X;
         * 
         * System.out.println("Digite um nome: ");
         * 
         * Scanner sc = new Scanner(System.in);
         * 
         * X = sc.next();
         * 
         * System.out.printf("Nome: %s%n", X);
         * 
         * int a;
         * 
         * System.out.println("Insere A");
         * 
         * a = sc.nextInt();
         * 
         * System.out.printf("B = %d%n", a);
         * 
         * double b;
         * 
         * System.out.println("Insere B: ");
         * 
         * b = sc.nextDouble();
         * 
         * System.out.printf("B = %.2f%n", b); // Se der erro é pq tem que por o double
         * com virgula e nao ponto, devido a // linguagem PT-BR.
         * 
         * System.out.println("Está estudando?");
         * 
         * char c;
         * 
         * c = sc.next().charAt(0);
         * 
         * System.out.printf("Estudando? %s%n", c); sc.close();
         */

        // Aula 27 entrada de Dados em java, Ler com quebra de linha (ENTER)
        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * int x; String s1, s2, s3;
         * 
         * x = sc.nextInt(); sc.nextLine(); // Para Nao pegar o ENTER de BUFFER no
         * NEXTLINE depoid de uma vareavel. // Aconselhado usar, quando for entrar em um
         * NEXTLINE depois de outra entrada de // variavel s1 = sc.nextLine(); s2 =
         * sc.nextLine(); s3 = sc.nextLine();
         * 
         * System.out.println("DADOS DIGITADOS: "); System.out.println(x);
         * System.out.println(s1); System.out.println(s2); System.out.println(s3);
         */
        // Scanner sc = new Scanner(System.in);

        /*
         * double x = 3.0; double y = 4.0; double z = -5.0; double A, B, C;
         * 
         * A = Math.sqrt(x); B = Math.sqrt(y); C = Math.sqrt(z);
         * 
         * System.out.println("Raiz Quadrada de " + x + " = " + A);
         * System.out.println("Raiz Quadrada de " + y + " = " + B);
         * System.out.println("Raiz Quadrada de " + z + " = " + C);
         */
        // Aula 35 Estrutura COndicional

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Informe as horas: ");

        x = sc.nextInt();

        if (x < 12) {
            System.out.println("Bom dia!");
        } else if (x == 12 || x < 18) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa Noite!");
        }

        sc.close();
        // A = Math.pow(a, b)

        // sc.close();
    }
}
