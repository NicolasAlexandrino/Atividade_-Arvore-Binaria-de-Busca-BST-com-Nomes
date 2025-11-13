package BSTNomes;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Inserindo nomes
        arvore.inserir("Maria");
        arvore.inserir("Ana");
        arvore.inserir("João");
        arvore.inserir("Pedro");
        arvore.inserir("Bruno");
        arvore.inserir("Carla");

        System.out.println("\n Em Ordem (A → Z):");
        Ordem.listarEmOrdem(arvore.raiz);

        System.out.println("\n Pré-Ordem:");
        PreOrdem.listarPreOrdem(arvore.raiz);

        System.out.println("\n Pós-Ordem:");
        PosOrdem.listarPosOrdem(arvore.raiz);

        System.out.println("\n Buscando nomes:");
        System.out.println("João existe? " + arvore.buscar("João"));
        System.out.println("Lucas existe? " + arvore.buscar("Lucas"));

        System.out.println("\n Exemplo CompareTo:");
        CompareTo.exemploComparacao();
    }
}
