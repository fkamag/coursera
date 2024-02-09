package pizzaria;

import java.util.ArrayList;

public class Ingrediente {

  private String nome;
  private int quantidadeUtilizada = 0;
  static ArrayList<Ingrediente> todosIngredientes = new ArrayList<>();

  public Ingrediente(String nome) {
    for (Ingrediente ingrediente : todosIngredientes) {
      if (ingrediente.getNome().equals(nome)) {
        System.out.println("Ingrediente já cadastrado");
        return;
      }
    }
    this.nome = nome;
    todosIngredientes.add(this);
  }

  public String getNome() {
    return nome;
  }

  public int getQuantidadeUtilizada() {
    return this.quantidadeUtilizada;
  }

  public void adicionaIngrediente() {
    this.quantidadeUtilizada++;
  }

  public static void zeraIngredientes() {
    todosIngredientes.clear();
  }

}
