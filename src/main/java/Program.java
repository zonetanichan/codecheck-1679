import java.lang.Math;
import java.util.HashMap;
import java.util.Map;

public class Program {
	static Map<Integer[], Integer> values = new HashMap<>();
	public static int A(int x, int y) {
		Integer[] d={x,y};
		Integer m = values.get(d);
	    if (m != null) { return m; }
		// ここに関数Aを実装してください
		// 返り値は整数相当の型であれば，int以外の型へ変更しても構いません．
		if (x == 0) {
			values.put(d, y + 1);
			return y + 1;
			
		} else{
			if (y == 0) {
				int a=new Program().A(x-1,1);
			return a;
			}
			else{
				int a=new Program().A(x, y - 1);
				int b = new Program().A(x - 1, a);
				return b;
			}
		}
	}  public static boolean isPrime(int n) {
    //ここに素数判定プログラムを実装してください。
	boolean sosu=true;   //(2)
	for(int i=2;i<n;i++){   //(3)
        if(n%i==0)   //(4)
          sosu=false;
         break;   //(5)
	}
    return sosu;
  }
}
