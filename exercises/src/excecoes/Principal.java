package excecoes;

public class Principal {

  public static void main(String[] args) {
    a(100);
    System.out.println("terminando execução de main");
  }

  public static void a(int i) {
    System.out.println("executando a() com " + i);
    try {
      b(100);
    } catch (Exception e) {
      System.out.println("tratando a exceção: " + e.getMessage());
    }
  }

  public static void b(int i) throws Exception {
    System.out.println("executando b() com " + i);
    throw new Exception("mensagem de erro");
  }

}
