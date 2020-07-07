package day8;

/**
 * 模板
 */
public abstract class Tm {
    public abstract void code();
    public final void getTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("CODE执行时间为"+(end-start));
    }
}
class TestTm extends Tm{
    @Override
    public void code() {
        int k = 0;
        for(int i=0;i<5000;i++){
            k+=1;
        }
        System.out.println(k);
    }
}