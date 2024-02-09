package comercio;

public class TesteCompra {

  public static void main(String[] args) {
    Compra c1 = new Compra(500);

    System.out.println(c1.numeroParcelas);
    System.out.println(c1.getValorTotal());

    Compra c2 = new Compra(1000, 4);

    System.out.println(c2.numeroParcelas);
    System.out.println(c2.getValorTotal());
    System.out.println(c2.getValorParcela());
  }


}
