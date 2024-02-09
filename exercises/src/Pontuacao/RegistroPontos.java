package Pontuacao;

public class RegistroPontos {

  public CalculadoraBonus cb;

  public RegistroPontos(CalculadoraBonus cb) {
    this.cb = cb;
  }

  public void fazerUmComentario(Usuario usuario) {
    usuario.pontos += 3 * cb.bonus(usuario);
  }

  public void criarUmTopico(Usuario usuario) {
    usuario.pontos += 5 * cb.bonus(usuario);
  }

  public void darUmLike(Usuario usuario) {
    usuario.pontos += cb.bonus(usuario);
  }

}
