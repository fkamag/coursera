package Pontuacao;

public class TesteRegistroPontos {

  public static void main(String[] args) {
    Usuario usuario = new Usuario();
    usuario.nome = "Fábio";
    usuario.vip = true;
    CalculadoraBonus cb = new CalculadoraBonus();
    cb.bonusDoDia = 2;
    RegistroPontos rp = new RegistroPontos(cb);
    rp.criarUmTopico(usuario);

    System.out.println(usuario.pontos);
  }

}
