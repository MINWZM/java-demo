package exception;

import org.junit.Test;

public class TryCatchReturn {
    public String TryCatchReturn(){
        String str="a";
        try{
            return str+"b";
        }catch (Exception e){
            System.out.println("有异常!");
        }finally{
            return str+"c";
        }
    }

    @Test
    public void testTryCatchReturn(){
        System.out.println(new TryCatchReturn().TryCatchReturn());
    }
}
