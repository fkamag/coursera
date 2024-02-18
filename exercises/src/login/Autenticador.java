package login;

public class Autenticador {
  public Usuario logar(String login, String password) throws LoginException {

    if(login.equals("Fabio") && password.equals("1234")) {
      return new Usuario(login);
    }
    throw new LoginException("Usuário e senha não conferem");

  }

}
