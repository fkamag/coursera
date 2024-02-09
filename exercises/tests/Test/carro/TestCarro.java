package carro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import carro.Carro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCarro {
  Carro c;

  @BeforeEach
  public void setUp() {
    c = new Carro(100);
  }

  @Test
  public void testAcelerar() {
    c.acelerar();
    assertEquals(100, c.getVelocidade());
  }

  @Test
  public void testFrear() {
    c.acelerar();
    c.frear();
    assertEquals(50, c.getVelocidade());
  }

  @Test
  public void testFrearAteZero() {
    c.acelerar();
    c.frear();
    c.frear();
    c.frear();
    c.frear();
    c.frear();
    c.frear();
    c.frear();
    assertEquals(0, c.getVelocidade());
  }

}
