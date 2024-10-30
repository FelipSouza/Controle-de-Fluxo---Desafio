import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        //solicitação do primeiro parâmetro
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scan.nextInt();

        //solicitação do segundo parâmetro
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scan.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O 2° parêmetro deve ser maior que o 1° parâmetro.");
		}
		
	}
	
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
        int numero = 1;
		//realizar o for para imprimir os números com base na variável contagem
        for(int indice = contagem; indice > 0; indice--){
            System.out.println("Imprimindo o número "+ numero);
            numero++;
        }
	}
}
