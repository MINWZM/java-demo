package commonClass;

import org.junit.Test;

public class MathTest {
    @Test
    public void testMath(){
        double a=1.2d;
        int b= (int) a;
        System.out.println("强制转换:"+b);
        double f = Math.floor(a);
        System.out.println("Math.floor()的作用:"+f);
        double c = Math.ceil(a);
        System.out.println("Math.ceil()的作用:"+c);
        a=-1.2d;
        double asc = Math.abs(a);
        System.out.println("Math.asc()的作用:"+asc);
        double r = Math.random();
        System.out.println("Math.random()生成0-1的随机数:"+r);
    }

    @Test
    public void testRandom(){
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]= (int) (Math.random()*10);
            System.out.print(" "+arr[i]);
        }
    }
}
