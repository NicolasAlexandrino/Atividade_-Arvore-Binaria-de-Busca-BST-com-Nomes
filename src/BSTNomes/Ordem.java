package BSTNomes;

public class Ordem {
    public static void listarEmOrdem(Node no) {
        if (no != null) {
            listarEmOrdem(no.esquerda);
            System.out.println(no.nome);
            listarEmOrdem(no.direita);
        }
    }
}
