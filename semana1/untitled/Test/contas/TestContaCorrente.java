package contas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestContaCorrente {
  ContaCorrente contaCorrente;

  @BeforeEach
  public void inicialTests() {
    contaCorrente = new ContaCorrente();
    contaCorrente.depositar(200);
  }

  @Test
  @DisplayName("1 - Testa se o depósito é feito com sucesso")
  public void TestDeposito() {
    assertEquals(contaCorrente.saldo, 200);
  }

  @Test
  @DisplayName("2 - Testa se o saque é feito com sucesso")
  public void TestSacar() {
    int valorSacado =  contaCorrente.sacar(150);
    assertEquals(contaCorrente.saldo, 50);
    assertEquals(valorSacado, 150);
  }

  @Test
  @DisplayName("3 - Testa se barra valor de saque maior que saldo")
  public void TestSacarSaldoMenorQueSaque() {
    int valorSacado =  contaCorrente.sacar(250);
    assertEquals(contaCorrente.saldo, 200);
    assertEquals(valorSacado, 0);
  }

}
