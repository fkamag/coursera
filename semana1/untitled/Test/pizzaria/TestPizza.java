package pizzaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestPizza {
  Ingrediente massa, mussarela, calabresa, pepperoni, presunto, palmito, ervilha, ovo;
  CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
  Pizza pizza1, pizza2, pizza3;

  @BeforeEach
  public void setUp() {
    Ingrediente.zeraIngredientes();
    Ingrediente massa = new Ingrediente("massa");
    Ingrediente mussarela = new Ingrediente("mussarela");
    Ingrediente calabresa = new Ingrediente("calabresa");
    Ingrediente pepperoni = new Ingrediente("pepperoni");
    Ingrediente presunto = new Ingrediente("presunto");
    Ingrediente palmito = new Ingrediente("palmito");
    Ingrediente ervilha = new Ingrediente("ervilha");
    Ingrediente ovo = new Ingrediente("ovo");

    pizza1 = new Pizza("Mussarela");
    pizza1.adicionaIngrediente(massa);
    pizza1.adicionaIngrediente(mussarela);
    carrinho.adcionarAoCarrinho(pizza1);

    pizza2 = new Pizza("Toscana");
    pizza2.adicionaIngrediente(massa);
    pizza2.adicionaIngrediente(mussarela);
    pizza2.adicionaIngrediente(calabresa);
    carrinho.adcionarAoCarrinho(pizza2);

    pizza3 = new Pizza("Portuguesa");
    pizza3.adicionaIngrediente(massa);
    pizza3.adicionaIngrediente(presunto);
    pizza3.adicionaIngrediente(mussarela);
    pizza3.adicionaIngrediente(palmito);
    pizza3.adicionaIngrediente(ervilha);
    pizza3.adicionaIngrediente(ovo);
    carrinho.adcionarAoCarrinho(pizza3);
  }

  @Test
  @DisplayName("1 - Testa cálculo do preço para até 2 ingredientes")
  public void testGetPrecoAteDoisIngredientes() {
    assertEquals(15, pizza1.getPreco());
  }

  @Test
  @DisplayName("2 - Teste cálculo do preço para pizza com até 5 ingredientes")
  public void testGetPrecoAteCincoIngredientes() {
    assertEquals(20, pizza2.getPreco());
  }

  @Test
  @DisplayName("3 - Teste cálculo do preço para pizza com mais de 5 ingredientes")
  public void testGetPrecoComMaisDeCincoIngredientes() {
    assertEquals(23, pizza3.getPreco());
  }

}
