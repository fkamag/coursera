package concurso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCandidato {

  public static void main(String[] args) {
    List<Candidato> candidatos = new ArrayList<>();
    candidatos.add(new Candidato(80, true, 30));
    candidatos.add(new Candidato(80, false, 25));
    candidatos.add(new Candidato(80, false, 28));
    candidatos.add(new Candidato(90, false, 20));

    Collections.sort(candidatos);

    for (Candidato c : candidatos) {
      System.out.println(c);
    }
  }

}
