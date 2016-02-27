package GUI;



import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.jar.Pack200;

/**
 * Created by xgh on 2016/2/20.
 */
public class Main{
    private static HashMap<Character,Integer> map=new HashMap<Character, Integer>();

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String [] dataStr=(in.nextLine()).split(" ");
        int charRepNum=10;
        for(char i='a';i<='z';i++){
            map.put(i,charRepNum++);
        }
        for(int i=0;i<9;i++){
            map.put((char)(i+48),i);
        }




        int givenRadixNumPosi=Integer.parseInt(dataStr[2]);
        long givenRadix=Integer.parseInt(dataStr[3]);

        long aaa=0;
        long givenNum=0;
        String givenNumStr=dataStr[givenRadixNumPosi-1];
//        System.out.println(givenNumStr);
//        System.out.println(givenRadixNumPosi-1);
//        for(char e:map.keySet()){
//            System.out.println(e+" ==== "+map.get(e));
//        }
        for(int i=givenNumStr.length()-1;i>=0;i--){
            givenNum+=map.get(givenNumStr.charAt(i))*Math.pow(givenRadix,aaa++);
        }
        int resRadixNumPosi=0;
        if(givenRadixNumPosi==1){
            resRadixNumPosi=1;
        }else{
            resRadixNumPosi=0;
        }

        String resNumStr=dataStr[givenRadixNumPosi];
        int biggestCharInResNumStr=map.get(resNumStr.charAt(0));
        for(int i=0;i<resNumStr.length();i++){
            if(map.get(resNumStr.charAt(i))>biggestCharInResNumStr){
                biggestCharInResNumStr=map.get(resNumStr.charAt(i));
            }
        }

        //System.out.println(biggestCharInResNumStr);
//        int tmpres=0;
//        int tmpbbb=0;
//        for(int j=resNumStr.length()-1;j>=0;j--){
//            tmpres+=map.get(resNumStr.charAt(j))*Math.pow(biggestCharInResNumStr+1,tmpbbb++);
//        }
        //System.out.println(tmpres);
//        if(tmpres>givenNum){
//            System.out.println("Impossible");
//            return;
//        }
        //System.out.println(resNumStr.length());
        for(long i=biggestCharInResNumStr+1;i<500;i++){
            long resNum=0;
            long bbb=0;
            for(int j=resNumStr.length()-1;j>=0;j--){
                resNum+=map.get(resNumStr.charAt(j))*Math.pow(i,bbb++);
            }
            if(resNum>givenNum){
                System.out.println("Impossible");
                return;
            }
            if(resNum==givenNum){
                System.out.println(i);
                return;
            }

        }
        return;
    }
}
