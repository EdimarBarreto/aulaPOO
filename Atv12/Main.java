public class Main {
    public static void main(String[] args) {
        Emprestimo E1 = new Emprestimo(1000, 0.1, 5);
        Emprestimo E2 = new Emprestimo(2000, 0.2, 3);

        double parcelaE1;
        double parcelaE2;

        do {
            parcelaE1 = E1.proximaParcela();
            parcelaE2 = E2.proximaParcela();

            if (parcelaE1 != -1 && parcelaE2 != -1) {
                System.out.println("Parcela E1: R$" + parcelaE1 + " | Parcela E2: R$" + parcelaE2);
            } else if (parcelaE1 != -1) {
                System.out.println("Parcela E1: R$" + parcelaE1 + " | Parcela E2: --");
            } else if (parcelaE2 != -1) {
                System.out.println("Parcela E1: -- | Parcela E2: R$" + parcelaE2);
            }
        } while (parcelaE1 != -1 || parcelaE2 != -1);
    }
}