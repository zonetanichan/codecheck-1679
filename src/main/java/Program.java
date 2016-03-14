import java.lang.Math;

public class Program {

  public static int A(int x, int y) {
    //ここに関数Aを実装してください
    //返り値は整数相当の型であれば，int以外の型へ変更しても構いません．
    if(x==0){
      return y+1;
    }
    else if(y==0){
      return A(x-1,1);
    }
    else{
    return A(x-1,A(x,y-1));
    }
    //return 0;
  }

  public static boolean isPrime(int n) {
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
