package BSTNomes;

public class PreOrdem {
    public static void listarPreOrdem(Node no) {
        if (no != null) {
            System.out.println(no.nome);
            listarPreOrdem(no.esquerda);
            listarPreOrdem(no.direita);
        }
    }
}

