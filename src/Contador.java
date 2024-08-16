import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int firstParameter = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int secondParameter = terminal.nextInt();

        try {
            count(firstParameter, secondParameter);
        }catch (ParametrosInvalidosException exception) {
            System.out.println("Ocorreu um erro: " + exception.getMessage());
            }
    }

    static void count(int firstParameter, int secondParameter ) throws ParametrosInvalidosException {
        if(secondParameter < firstParameter){
            throw new ParametrosInvalidosException("O primeiro parâmetro precisa ser menor que o segundo");
    }
        int count = secondParameter - firstParameter;
        for(int i = 1; i <= count; i ++  ){
            System.out.println("Imprimindo o número " + i);
        }
    }
}