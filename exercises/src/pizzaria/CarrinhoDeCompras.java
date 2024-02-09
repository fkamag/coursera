package pizzaria;

import java.util.ArrayList;

public class CarrinhoDeCompras {

  double valorTotal = 0;
  ArrayList<Pizza> pizzas = new ArrayList<>();


  public void adcionarAoCarrinho(Pizza pizza) {

    if (pizza.listaIngredientes.size() > 1) {
      pizzas.add(pizza);
      System.out.println("Adcionada ao carrinho pizza " + pizza.getNome());
    } else {
      System.out.println("Pizza precisa ter pelo menos um ingrediente");
    }

  }

  public void valorTotal() {
    System.out.println();
    System.out.println("---- Finalizando Carrinho ----");
    System.out.println();
    for (Pizza pizza : pizzas) {
      valorTotal += pizza.getPreco();
      System.out.printf("Pizza %s\t\t - %.2f\n", pizza.getNome(), pizza.getPreco());
    }
    System.out.printf("Valor Total do Carrinho: %.2f\n", valorTotal);
  }

  public void limparCarrinho() {
    pizzas.clear();
  }

}
