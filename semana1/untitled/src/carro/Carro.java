package carro;

public class Carro {
  int potencia;
  int velocidade;
  String nome;

  public Carro(int potencia) {
    this.potencia = potencia;
    velocidade = 0;
  }

  public void acelerar() {
    velocidade += potencia;
  }

  public void frear() {
    velocidade = velocidade/2;
  }

  public int getVelocidade() {
    return velocidade;
  }

  public void imprimir() {
    System.out.println("O carro " + nome + " está a velocidade de "
        + getVelocidade() + " Km/h.");
  }

}
