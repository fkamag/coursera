package comercio;

public class Compra {

  int valorTotal;
  int numeroParcelas;

  // a vista
  public Compra(int valor) {
    valorTotal = valor;
    numeroParcelas = 1;
  }

  // parcelado
  public Compra(int valor, int qtdParcelas) {
    numeroParcelas = qtdParcelas;
    valorTotal = valor;
  }

  public int getValorTotal() {
    return valorTotal;
  }

  public int getValorParcela(){
    return valorTotal / numeroParcelas;
  }

}
