package login;

public class LoginException extends Exception {

  private String login;

  public LoginException(String message) {
    super(message);
  }

  public String getLogin() {

    return login;

  }


}
