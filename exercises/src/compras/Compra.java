package compras;

public class Compra {
  private double valorDaCompra;

  public Compra(double valorDaCompra) {
    this.valorDaCompra = valorDaCompra;
  }

  public double total() {
    return valorDaCompra;
  }

}
