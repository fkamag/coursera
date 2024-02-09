package compras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCompra {

  @Test
  @DisplayName("1 - Testa se compra é instanciada e retorna valor total correto")
  public void TestCompra() {
    Compra compra = new Compra(150);
    assertEquals(150, compra.total());
  }

}
