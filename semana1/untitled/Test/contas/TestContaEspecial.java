package contas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestContaEspecial {
  ContaEspecial contaEspecial;

  @BeforeEach
  public void inicialTests() {
    contaEspecial = new ContaEspecial(100);
    contaEspecial.depositar(200);
  }

  @Test
  @DisplayName("1 - Testa saque conta especial")
  public void saqueMaiorQueSaldo() {
    int valorSacado = contaEspecial.sacar(250);
    assertEquals(valorSacado, 250);
    assertEquals(contaEspecial.saldo, -50);
  }

  @Test
  @DisplayName("2 - Testa saque maior que saldo + limite na conta especial")
  public void saqueMaiorQueSaldoELimite() {
    int valorSacado = contaEspecial.sacar(400);
    assertEquals(valorSacado, 0);
    assertEquals(contaEspecial.saldo, 200);
  }


}
