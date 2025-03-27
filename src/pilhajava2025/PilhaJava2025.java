package pilhajava2025;

import java.util.*;

public class PilhaJava2025 {
    static Scanner leia = new Scanner(System.in);

    private static int menu() {
        System.out.println("\n--- Menu Pilha ---");
        System.out.println("1. Inserir elemento");
        System.out.println("2. Remover elemento");
        System.out.println("3. Mostrar topo");
        System.out.println("4. Mostrar pilha");
        System.out.println("0. Sair");
        System.out.printf("Digite a opção desejada:" );
    	return leia.nextInt();
	}


    public static void main(String[] args) {
        int opcao, dado;
        System.out.println("Tamanho da pilha:");
        int tamanho = leia.nextInt();
        Pilha<Integer> minhaPilha = new Pilha(tamanho);
        
        do{
            opcao = menu();
            switch(opcao){
                case 1: System.out.println("Dado:");
                        dado = leia.nextInt();
                        minhaPilha.push(dado);
                break;
                case 2: if(!minhaPilha.isEmpty())
                            System.out.println("Topo removido:"
                                    +minhaPilha.pop());
                        else
                            System.out.println("Pilha Vazia!");
                break;
                case 3: if(!minhaPilha.isEmpty())
                            System.out.println("Topo:"
                                    +minhaPilha.peek());
                        else
                            System.out.println("Pilha Vazia!");
                break;
                case 4: System.out.println(minhaPilha);
                break;
                case 0: System.out.println("Saindo");
                break;
            }// fim swtich
            leia.nextLine();// pausa
        }while(opcao!=0);
       
    }
    
}
