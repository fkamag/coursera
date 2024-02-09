package compras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCompraParcelada {

  CompraParcelada compra;

  @Test
  @DisplayName("1 - Testa compra em 2 parcelas")
  public void TesteCompraEmDuasParcelas() {
    compra = new CompraParcelada(100,2,2.5);
    assertEquals(compra.total(), 105.06, 0.01);
  }

  @Test
  @DisplayName("2 - Testa compra em 5 parcelas")
  public void TesteCompraEmCincoParcelas() {
    compra = new CompraParcelada(100,5,2.5);
    assertEquals(compra.total(), 113.14, 0.01);
  }

  @Test
  @DisplayName("3 - Testa compra em 10 parcelas")
  public void TesteCompraEmDezParcelas() {
    compra = new CompraParcelada(100,10,2.5);
    assertEquals(compra.total(), 128.01, 0.01);
  }

}
