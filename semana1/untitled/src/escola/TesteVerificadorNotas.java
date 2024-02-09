package escola;

public class TesteVerificadorNotas {

  public static void main(String[] args) {
    Aluno fabio = new Aluno();
    fabio.bim1 = 70;
    fabio.bim2 = 60;
    fabio.bim3 = 80;
    fabio.bim4 = 70;

    System.out.println(fabio.media());
    System.out.println(fabio.passouDeAno());

  }

}
