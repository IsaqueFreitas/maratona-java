import java.util.Scanner;

public class CalculatorImc {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        String ClassificarImc;

        System.out.println("Olá, qual sua altura? ");
        double altura = scanner.nextDouble();

        System.out.println("Agora me informe seu peso: ");
        double peso = scanner.nextDouble();

        double imc = CalcImc( altura, peso);
        String classificacao = ClassificarImc(imc);

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Classificação: " + classificacao);



    }

    public static double CalcImc (double altura, double peso) {

        return peso/(altura * altura);

    }

    public static String ClassificarImc (double imc) {

        if (imc <= 18.5) return "abaxo do peso";
        if (imc <= 24.9) return "Peso ideal";
        if (imc <= 29.9) return "Levemente acima do peso";
        if (imc <= 34.9) return "Obesidade Grau I";
        if (imc <= 39.9) return "Obesidade Grau II (Severa)";
        return "Obesidade III (Mórbida)";

    }


}
