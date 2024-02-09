package pizzaria;

public class TesteCarrinhoCompras {

  public static void main(String[] args) {

    Ingrediente massa = new Ingrediente("massa");
    Ingrediente massa1 = new Ingrediente("massa");
    Ingrediente mussarela = new Ingrediente("mussarela");
    Ingrediente calabresa = new Ingrediente("calabresa");
    Ingrediente pepperoni = new Ingrediente("pepperoni");
    Ingrediente presunto = new Ingrediente("presunto");
    Ingrediente palmito = new Ingrediente("palmito");
    Ingrediente ervilha = new Ingrediente("ervilha");
    Ingrediente ovo = new Ingrediente("ovo");
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    Pizza pizza0 = new Pizza("Teste");
    carrinho.adcionarAoCarrinho(pizza0);

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

    System.out.println();
    System.out.println();
    System.out.println("---- Ingredientes Utilizados ----");
    for (Ingrediente ingrediente : Ingrediente.todosIngredientes) {
      System.out.printf("%s \t\t- %d\n", ingrediente.getNome(), ingrediente.getQuantidadeUtilizada());
    }
    System.out.println("Total de Ingrediente utilizados: " + Pizza.totalIngredientes);

  }

}
