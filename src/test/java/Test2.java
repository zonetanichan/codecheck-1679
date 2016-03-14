import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test2 {

  @Test
  public void prime1() {
    assertEquals(Program.isPrime(1), false);
  }

  @Test
  public void prime2() {
    assertEquals(Program.isPrime(2), true);
  }

  @Test
  public void prime3() {
    assertEquals(Program.isPrime(3), true);
  }

  @Test
  public void prime4() {
    assertEquals(Program.isPrime(4), false);
  }

  @Test
  public void prime5() {
    assertEquals(Program.isPrime(5), true);
  }

  @Test
  public void prime6() {
    assertEquals(Program.isPrime(6), false);
  }

  @Test
  public void prime7() {
    assertEquals(Program.isPrime(7), true);
  }

  @Test
  public void prime8() {
    assertEquals(Program.isPrime(8), false);
  }

  @Test
  public void prime9() {
    assertEquals(Program.isPrime(9), false);
  }

  @Test
  public void prime10() {
    assertEquals(Program.isPrime(10), false);
  }

}
