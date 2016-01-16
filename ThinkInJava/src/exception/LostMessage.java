package exception;

/**
 * Created by jc on 11/6/2015.
 */
class VeryImportException extends Exception{
    public String toString(){
        return "A very important exception";
    }
}

class HoHumException extends Exception{
    public String toString(){
        return "A trivial exception";
    }
}

public class LostMessage {
    void f() throws VeryImportException{
        throw new VeryImportException();
    }

    void dispose() throws HoHumException{
        throw new HoHumException();
    }

    public static  void main(String[] args){
        try{
            LostMessage lm=new LostMessage();
            try {
                lm.f();
            }finally {
                lm.dispose();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
