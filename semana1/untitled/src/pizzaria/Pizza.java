package pizzaria;

import java.util.ArrayList;

public class Pizza {

  String nome;
  ArrayList<Ingrediente> listaIngredientes = new ArrayList<>();

  private double preco = 0;
  public static int totalIngredientes = 0;

  public String getNome() {
    return this.nome;
  }

  public Pizza(String nome) {
    this.nome = nome;
  }

  public void adicionaIngrediente(Ingrediente ingrediente) {
    listaIngredientes.add(ingrediente);
    contabilizaIngrediente(ingrediente);
    ingrediente.adicionaIngrediente();
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public double getPreco() {
    if (listaIngredientes.size() <= 2) {
      preco = 15.00;
    } else if (listaIngredientes.size() <= 5) {
      preco = 20.00;
    } else {
      preco = 23.00;
    }

    return preco;

  }

  public static void contabilizaIngrediente(Ingrediente ingrediente) {
    totalIngredientes ++;
  }

}
