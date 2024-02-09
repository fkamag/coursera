package compras;

public class CompraParcelada extends Compra {
  private int quantidadeDeParcelas;
  private double jurosMensal;

  public CompraParcelada (double valorDaCompra, int quantidadeDeParcelas, double jurosMensal) {
    super(valorDaCompra);
    this.quantidadeDeParcelas = quantidadeDeParcelas;
    this.jurosMensal = jurosMensal;
  }

  public double total() {
    double saldo = super.total();
    for (int i = 0; i < this.quantidadeDeParcelas; i++) {

    }
    return super.total() * Math.pow((1 + this.jurosMensal/100), this.quantidadeDeParcelas);
  }

}
