// Criando variaveis e instanciando
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

    // Comparando se número parcelaAtual for menor ou igual ao número de parcelas para realizar as operacoes de 
    // receber o valor das parcelas. valor dos juros e o valor total, no final ele ira atualizar o numero da parcela atual
    // e retornar o valor total da parcela
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
