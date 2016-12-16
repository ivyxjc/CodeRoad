package gc;

/**
 * Created by ivxyjc on 2016/12/16.
 */
public class FinalizeEscapeGC {

    public static FinalizeEscapeGC SAVE_HOOK=null;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed");
        FinalizeEscapeGC.SAVE_HOOK=this;
    }

    public void isAlive(){
        System.out.println("yes, i am still alive");
    }

    public static void main(String[] args) throws Throwable{

        SAVE_HOOK=new FinalizeEscapeGC();

        SAVE_HOOK=null;
        System.gc();

        Thread.sleep(500);
        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("no");
        }

        SAVE_HOOK=null;
        System.gc();

        Thread.sleep(500);
        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("no");
        }

    }

}
