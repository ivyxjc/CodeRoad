package Thread;

/**
 * Created by xgh on 2016/1/22.
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber=0;

    public static int nextSerialNumber(){
        return serialNumber++;
    }
}
