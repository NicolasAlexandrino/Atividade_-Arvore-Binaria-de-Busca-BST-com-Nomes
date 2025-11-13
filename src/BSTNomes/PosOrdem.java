package BSTNomes;

public class PosOrdem {
    public static void listarPosOrdem(Node no) {
        if (no != null) {
            listarPosOrdem(no.esquerda);
            listarPosOrdem(no.direita);
            System.out.println(no.nome);
        }
    }
}
