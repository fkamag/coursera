package Pontuacao;

public class CalculadoraBonus {

  public int bonusDoDia = 1;


  public int bonus(Usuario usuario) {
    int multiplicador = bonusDoDia;
    if (usuario.vip) {
      multiplicador = 5 * bonusDoDia;
    }
    usuario.pontos += bonusDoDia * multiplicador;
    return multiplicador;
  }

}
