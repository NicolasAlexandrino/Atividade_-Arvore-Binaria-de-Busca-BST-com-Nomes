package BSTNomes;

public class ArvoreBinaria {
    Node raiz;

    public void inserir(String nome) {
        raiz = inserirRec(raiz, nome);
    }

    private Node inserirRec(Node atual, String nome) {
        if (atual == null) {
            return new Node(nome);
        }

        // Usando compareToIgnoreCase() para comparar alfabeticamente
        if (nome.compareToIgnoreCase(atual.nome) < 0) {
            atual.esquerda = inserirRec(atual.esquerda, nome);
        } else if (nome.compareToIgnoreCase(atual.nome) > 0) {
            atual.direita = inserirRec(atual.direita, nome);
        } else {
            // Caso deseje contar repetições, pode-se tratar aqui
            System.out.println("Nome repetido ignorado: " + nome);
        }

        return atual;
    }

    public boolean buscar(String nome) {
        return buscarRec(raiz, nome);
    }

    private boolean buscarRec(Node atual, String nome) {
        if (atual == null) return false;

        int cmp = nome.compareToIgnoreCase(atual.nome);
        if (cmp == 0) return true;
        else if (cmp < 0) return buscarRec(atual.esquerda, nome);
        else return buscarRec(atual.direita, nome);
    }
}
