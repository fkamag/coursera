package signos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
  private Date dataDeNascimento;

  public Pessoa(String dataDeNascimento) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    try{
      this.dataDeNascimento = dateFormat.parse(dataDeNascimento);
    } catch (ParseException e) {
      e.getMessage();
    }
  }

  public Date getDataDeNascimento() {
    return dataDeNascimento;
  }

  public int getIdade() {
    Calendar diaNascimento = Calendar.getInstance();
    diaNascimento.setTime(this.dataDeNascimento);

    Date dataAtual = new Date(Relogio.agora());
    Calendar diaAtual = Calendar.getInstance();
    diaAtual.setTime(dataAtual);

    int idade = diaAtual.get(Calendar.YEAR) - diaNascimento.get(Calendar.YEAR);

    if (diaAtual.get(Calendar.MONTH) < diaNascimento.get(Calendar.MONTH)) {
      idade--;
    } else if (diaAtual.get(Calendar.MONTH) == diaNascimento.get(Calendar.MONTH)) {
      if (diaAtual.get(Calendar.DAY_OF_MONTH) < diaNascimento.get(Calendar.DAY_OF_MONTH)) {
        idade--;
      }
    }
    return idade;
  }

  public String getSigno(){
    Calendar diaAtual = Calendar.getInstance();
    diaAtual.setTime(this.dataDeNascimento);

    long dia = diaAtual.get(Calendar.DAY_OF_MONTH);
    long mes = diaAtual.get(Calendar.MONTH) + 1;

    if (mes == 1 &&  dia > 20 || mes == 2 && dia < 19){
      return "Aquário";
    } else if (mes == 2 || mes == 3 && dia < 20){
      return "Peixes";
    } else if (mes == 3 || mes == 4 && dia < 21){
      return "Áries";
    } else if (mes == 4 || mes == 5 && dia < 21){
      return "Touro";
    } else if (mes == 5 || mes == 6 && dia < 21){
      return"Gêmeos";
    } else if (mes == 6 || mes == 7 && dia < 22){
      return "Câncer";
    } else if (mes == 7 || mes == 8 && dia < 23){
      return "Leão";
    } else if (mes == 8 || mes == 9 && dia < 23){
      return "Virgem";
    } else if (mes == 9 || mes == 10 && dia < 23){
      return "Libra";
    } else if (mes == 10 || mes == 11 && dia < 22){
      return "Escorpião";
    } else if (mes == 11 || mes == 12 && dia < 22){
      return "Sagitário";
    } else if (mes == 12 || mes == 1){
      return "Capricórnio";
    }

    return "";
  }
}
