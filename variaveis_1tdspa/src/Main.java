import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //variaveis();

        var calculo = 1 + 2 - (3 * 2) / 5;
        System.out.println(calculo);
        calculo++;
        System.out.println(calculo);
        calculo--;
        System.out.println(calculo);


        //condicionais();
        var scanner = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        var idade = scanner.nextInt();
        scanner.nextLine();

        if(idade >= 18 && idade <=200)
            System.out.println("A pessoa é maior de idade");
        else if (idade > 200)
            System.out.println("A pessoa é um vampiro");
        else
            System.out.println("A pessoa é menor de idade");
        }

        public static void variaveis (){System.out.println("Sistema iniciando...");

            var scan = new Scanner(System.in);
            System.out.println("Digite o numero 1: ");
            var numero1 = scan.nextBigDecimal();
            scan.nextLine();
            System.out.println("Digite o numero 2");
            var numero2 = scan.nextBigDecimal();
            scan.nextLine();
            System.out.println();

            System.out.println(numero1.add(numero2));

            String nome = "FIAP";
            System.out.println(nome);

            int numero = 10;


            var valor = 10.5;
            System.out.println(numero + 10.5);

            var valorGrande = 1000000000000000l;
            var valorpequeno = 10;

            var letra = 'A';
            var condição = true;

            System.out.println("Sistema finalizando...");
        }

}