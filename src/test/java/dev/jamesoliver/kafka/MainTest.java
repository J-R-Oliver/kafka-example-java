//package dev.jamesoliver.kafka;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class MainTest {
//
//  private final PrintStream stdout = System.out;
//  private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//
//  @BeforeEach
//  void beforeEach() {
//    System.setOut(new PrintStream(byteArrayOutputStream));
//  }
//
//  @AfterEach
//  void afterEach() {
//    System.setOut(stdout);
//  }
//
//  @Test
//  void mainTest() {
//    Main.main(new String[] {});
//    assertEquals("Hello World", byteArrayOutputStream.toString());
//  }
//}
