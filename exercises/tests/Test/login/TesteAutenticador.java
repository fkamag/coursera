package login;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TesteAutenticador {

  @Test
  public void loginComSucesso() throws LoginException {
    Autenticador a = new Autenticador();
    Usuario u = a.logar("Fabio", "1234");
    assertEquals("Fabio", u.getLogin());
  }

  @Test
  public void loginFalhou() throws LoginException {
    Exception e = Assertions.assertThrows(
      LoginException.class, ()-> {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("Fabio", "12345");
        assertEquals("Fabio", u.getLogin());
      }
    );

    assertEquals(e.getMessage(),"Usuário e senha não conferem");
  }

}
