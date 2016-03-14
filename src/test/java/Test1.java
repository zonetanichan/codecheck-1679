import org.junit.*;
import static org.junit.Assert.assertEquals;

public class Test1 {

  @Test
  public void A00() {
    assertEquals(Program.A(0,0), 1);
  }

  @Test
  public void A01() {
    assertEquals(Program.A(0,1), 2);
  }

  @Test
  public void A02() {
    assertEquals(Program.A(0,2), 3);
  }

  @Test
  public void A10() {
    assertEquals(Program.A(1,0), 2);
  }

  @Test
  public void A11() {
    assertEquals(Program.A(1,1), 3);
  }

  @Test
  public void A12() {
    assertEquals(Program.A(1,2), 4);
  }

  @Test
  public void A20() {
    assertEquals(Program.A(2,0), 3);
  }

  @Test
  public void A21() {
    assertEquals(Program.A(2,1), 5);
  }

  @Test
  public void A22() {
    assertEquals(Program.A(2,2), 7);
  }

  @Test
  public void A30() {
    assertEquals(Program.A(3,0), 5);
  }

  @Test
  public void A31() {
    assertEquals(Program.A(3,1), 13);
  }

  @Test
  public void A32() {
    assertEquals(Program.A(3,2), 29);
  }

  @AfterClass
  public static void answer() {
    System.out.println();
    System.out.print("A(4,0) is ");System.out.flush();
    System.out.println(Program.A(4,0));
    System.out.print("A(4,1) is ");System.out.flush();
    System.out.println(Program.A(4,1));
    System.out.print("A(4,2) is ");System.out.flush();
    System.out.println(Program.A(4,2));
    System.out.print("A(5,0) is ");System.out.flush();
    System.out.println(Program.A(5,0));
    System.out.print("A(5,1) is ");System.out.flush();
    System.out.println(Program.A(5,1));
    System.out.print("A(5,2) is ");System.out.flush();
    System.out.println(Program.A(5,2));
  }

}
