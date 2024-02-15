package signos;

public class InstanciandoPessoa {

  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("07/02/1987");
    Pessoa pessoa2 = new Pessoa("26/05/1970");

    System.out.println("Pessoa 1");
    System.out.println(pessoa1.getIdade());
    System.out.println(pessoa1.getSigno());

    System.out.println("Pessoa 2");
    System.out.println(pessoa2.getIdade());
    System.out.println(pessoa2.getSigno());


  }

}
