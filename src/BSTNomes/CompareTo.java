package BSTNomes;

public class CompareTo {
    public static void exemploComparacao() {
        String nome1 = "Ana";
        String nome2 = "Bruno";

        int resultado = nome1.compareToIgnoreCase(nome2);

        if (resultado < 0) {
            System.out.println(nome1 + " vem antes de " + nome2);
        } else if (resultado > 0) {
            System.out.println(nome1 + " vem depois de " + nome2);
        } else {
            System.out.println("Os nomes são iguais");
        }
    }
}
