import java.util.Scanner;

class BMExercicio05 {
    public static void main(String[] args) {
        final int IDADE_MINIMA = 16;
        final int IDADE_OBRIGATORIA = 18;
        final int IDADE_MAXIMA = 65;
        final String NAO_PODE_VOTAR = "Não pode votar.";
        final String VOTO_FACULTATIVO = "Voto facultativo.";
        final String VOTO_OBRIGATORIO = "Voto obrigatório.";
        final String IDADE_INVALIDA = "Idade inválida.";
        final String INFORME_UMA_IDADE = "Informe uma idade: ";

        Scanner scanner = new Scanner(System.in);

        System.out.print(INFORME_UMA_IDADE);
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println(IDADE_INVALIDA);
        } else if (idade < IDADE_MINIMA) {
            System.out.println(NAO_PODE_VOTAR);
        } else if (idade < IDADE_OBRIGATORIA || idade > IDADE_MAXIMA) {
            System.out.println(VOTO_FACULTATIVO);
        } else {
            System.out.println(VOTO_OBRIGATORIO);
        }

        scanner.close();
    }
}