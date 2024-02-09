package contas;

public class ContaCorrente {

  int saldo;

  public int sacar(int valor) {
    if (saldo < valor) {
      return 0;
    }
    this.saldo -= valor;
    return valor;
  }

  public void depositar(int valor) {
    this.saldo += valor;
  }

}
