package carro;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfter {

  @Test
  public void teste1() {
    System.out.println("Teste 1");
  }

  @Test
  public void teste2() {
    System.out.println("Teste 2");
  }

  @Test
  public void teste3() {
    System.out.println("Teste 3");
  }

  @BeforeAll
  public static void BeforeAll() {
    System.out.println("@BeforeAll");
  }

  @AfterAll
  public static void AfterAll() {
    System.out.println("@AfterAll");
  }

  @BeforeEach
  public void Before() {
    System.out.println("@BeforeEach");
  }

  @AfterEach
  public void After() {
    System.out.println("@AfterEach");
  }

}
