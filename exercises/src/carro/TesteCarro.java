package carro;

public class TesteCarro {

  public static void main(String[] args) {
    Carro c1 = new Carro(10);
    c1.nome = "Corcel";
    c1.velocidade = 0;

    Carro c2 = new Carro(15);
    c2.nome = "Carango";
    c2.velocidade = 0;


    c1.acelerar();
    c1.acelerar();
    c1.acelerar();
    c1.frear();
    c1.imprimir();

    c2.imprimir();
  }

}
