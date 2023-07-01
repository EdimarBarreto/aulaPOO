// import java.util.ArrayList;
// import java.util.List;

// public class Emprestimo {
//     private double valorTotal;
//     private int nummeroParcelas;
//     private double taxaJuros;
//     private List<Double> parcelas;

//     public Emprestimo(double valorTotal, int numeroParcelas, double taxaJuros) {
//         this.valorTotal = valorTotal;
//         this.numeroParcelas = numeroParcelas;
//         this.taxaJuros = taxaJuros;
//         this.parcelas = new ArrayList<>();
//         calcularParcelas();
//     }

//     private void calcularParcelas() {
//         double valorParcela = valorTotal / numeroParcelas;
//         for (int i = 0; i < numeroParcelas; i++) {
//             double jurosParcela = valorParcela * taxaJuros;
//             double valorTotalParcela = valorParcela + jurosParcela;
//             parcelas.add(valorTotalParcela);
//         }
//     }

//     public double getValorEmprestimo() {
//         return valorTotal;
//     }

//     public void setValorEmprestimo(double valorTotal) {
//         this.valorTotal = valorTotal;
//         calcularParcelas();
//     }

//     public int getNumParcelas() {
//         return numeroParcelas;
//     }

//     public void setNumParcelas(int numParcelas) {
//         this.numeroParcelas = numeroParcelas;
//         calcularParcelas();
//     }

//     public double getTaxaJuros() {
//         return taxaJuros;
//     }

//     public void setTaxaJuros(double taxaJuros) {
//         this.taxaJuros = taxaJuros;
//         calcularParcelas();
//     }

//     public List<Double> getParcelas() {
//         return parcelas;
//     }
// }


public class Emprestimo {
    private double valorTotal;
    private double taxaJuros;
    private int numeroParcelas;
    private int parcelaAtual;

    public Emprestimo(double valorTotal, double taxaJuros, int numeroParcelas) {
        this.valorTotal = valorTotal;
        this.taxaJuros = taxaJuros;
        this.numeroParcelas = numeroParcelas;
        this.parcelaAtual = 1;
    }

    public double proximaParcela() {
        if (parcelaAtual <= numeroParcelas) {
            double valorParcela = valorTotal / numeroParcelas;
            double valorJuros = valorParcela * taxaJuros;
            double valorTotalParcela = valorParcela + valorJuros;

            parcelaAtual++;
            return valorTotalParcela;
        } else {
            return -1;
        }
    }
}