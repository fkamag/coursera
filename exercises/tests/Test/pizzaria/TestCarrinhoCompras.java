package pizzaria;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class TestCarrinhoCompras {

  @Test
  @Order(1)
  @DisplayName("1 - Testa se impede a adição de uma pizza sem ingredientes")
  public void testPizzaSemIngredientes() {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    Pizza pizza = new Pizza("Calabresa");
    carrinho.adcionarAoCarrinho(pizza);
    assertEquals(0, pizza.listaIngredientes.size());
  }

  @Test
  @Order(2)
  @DisplayName("2 - Testa se pizza foi adicionada ao carrinho")
  public void testAddAoCarrinho() {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    Ingrediente.zeraIngredientes();
    Ingrediente massa = new Ingrediente("massa");
    Ingrediente mussarela = new Ingrediente("mussarela");
    Pizza pizza = new Pizza("Mussarela");
    pizza.adicionaIngrediente(massa);
    pizza.adicionaIngrediente(mussarela);
    carrinho.adcionarAoCarrinho(pizza);
    assertEquals(1, carrinho.pizzas.size());
  }

  @Test
  @Order(3)
  @DisplayName("3 - Testa se valor total do carrinho está correto")
  public void testValorTotal() {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    Ingrediente.zeraIngredientes();
    Ingrediente massa = new Ingrediente("massa");
    Ingrediente mussarela = new Ingrediente("mussarela");
    Ingrediente calabresa = new Ingrediente("calabresa");
    Ingrediente presunto = new Ingrediente("presunto");
    Ingrediente palmito = new Ingrediente("palmito");
    Ingrediente ervilha = new Ingrediente("ervilha");
    Ingrediente ovo = new Ingrediente("ovo");

    Pizza pizza1 = new Pizza("Mussarela");
    pizza1.adicionaIngrediente(massa);
    pizza1.adicionaIngrediente(mussarela);
    carrinho.adcionarAoCarrinho(pizza1);

    Pizza pizza2 = new Pizza("Toscana");
    pizza2.adicionaIngrediente(massa);
    pizza2.adicionaIngrediente(mussarela);
    pizza2.adicionaIngrediente(calabresa);
    carrinho.adcionarAoCarrinho(pizza2);

    Pizza pizza3 = new Pizza("Portuguesa");
    pizza3.adicionaIngrediente(massa);
    pizza3.adicionaIngrediente(presunto);
    pizza3.adicionaIngrediente(mussarela);
    pizza3.adicionaIngrediente(palmito);
    pizza3.adicionaIngrediente(ervilha);
    pizza3.adicionaIngrediente(ovo);
    carrinho.adcionarAoCarrinho(pizza3);

    carrinho.valorTotal();
    assertEquals(58, carrinho.valorTotal);
  }



}
