package lambda;

import java.io.FileInputStream;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ivxyjc on 2016/12/2.
 */



public class IteratorStream {

    public static void main(String[] args){
        ArrayList<Artist> allArtists=new ArrayList<>();
        for(int i=0;i<10;i++){
            allArtists.add(new Artist(i+"th","London"));
        }
//        -----------------------------
//        long count=allArtists.stream()
//                            .filter(artist -> artist.isFrom("London"))
//                            .count();
//        System.out.println(count);
//        -----------------------------


//        -----------------------------
//        allArtists.stream()
//                .filter(artist -> {
//                    System.out.println(artist.getName());
//                    return artist.isFrom("London");
//                })
//                .count();
//        -----------------------------

//        -----------------------------
//        常用流操作 collect(toList())
//        List<String> collected= Stream.of("a","b","c")
//                .collect(Collectors.toList());
//        System.out.println(collected);
//        ["a","b","c"]
//        -----------------------------


//        -----------------------------
//        常用流操作 map
//        List<String> collected=Stream.of("a","b","c")
//                                    .map(string->string.toUpperCase())
//                                    .collect(Collectors.toList());
//        System.out.println(collected);
//        ["A","B","C"]
//        -----------------------------

//        -----------------------------
//        常用流操作 filter
//        List<String> beginningWithNumbers=Stream.of("a","1ac","abc1")
//                                                .filter(value->isDigit(value.charAt(0)))
//                                                .collect(Collectors.toList());
//        System.out.println(beginningWithNumbers);
//        [1ac]
//        -----------------------------

//        -----------------------------
//        常用流操作 flatmap
//        将每个列表转换成steram流
//        List<Integer> together=Stream.of(Arrays.asList(1,2),Arrays.asList(3,4))
//                                    .flatMap(numbers-> numbers.stream())
//                                    .collect(Collectors.toList());
//
//        System.out.println(together);

//        -----------------------------
//        max min
//        List<Track> tracks=Arrays.asList(new Track("aa",400),
//                                         new Track("bb",500),
//                                         new Track("cc",600));
//        Track shortestTrack=tracks.stream()
//                            .min(Comparator.comparing(track -> track.getLength()))
//                            .get();
//
//        System.out.println(shortestTrack.getLength());
//        400
//        -----------------------------

//        -----------------------------
//        reduce

        int count=Stream.of(1,2,3)
                        .reduce(0,(ccc,element)-> ccc+element);
        System.out.println(count);
//        6

        BinaryOperator<Integer> accumulator=(acc,element)->acc+element;
        int count_2=accumulator.apply(
                accumulator.apply(
                        accumulator.apply(0,1),
                        2),
                3);
        System.out.println(count_2);

    }



    public static boolean isDigit(Character c){
        char[] digits={'1','2','3','4','5','6','7','8','9','0'};

        for(char i:digits){
            if(c.equals(i)){
                return true;
            }
        }
        return false;
    }

}

class Artist{
    private String name;
    private String from;

    public Artist(String name,String from){
        this.name=name;
        this.from=from;
    }

    public boolean isFrom(String str){
        return str.equals(from);
    }

    public String getName(){
        return name;
    }
}

class Track{

    String name;
    int rate;

    public Track(String name, int rate){
        this.name=name;
        this.rate=rate;
    }

    public int getLength(){
        return rate;
    }
}
