package priciples.ocp;

import edu.princeton.algs4.StdOut;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by ivyxjc on 2016/10/25.
 */


interface IBook{

    public String getName();

    public int getPrice();

    public String getAuthor();
}

class NovelBook implements IBook{
    private String name;
    private int price;
    private String author;

    public NovelBook(String name, int price, String author){
        this.name=name;
        this.price=price;
        this.author=author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}

class OffNovelBook extends NovelBook{

    public OffNovelBook(String name,int price, String author){
        super(name,price,author);
    }

    @Override
    public int getPrice(){
        int selfPrice=super.getPrice();
        int offPrice=selfPrice*90/100;
        return offPrice;
    }
}


public class BookStore {
    private final static ArrayList<IBook> bookList=new ArrayList<>();
    static {
        bookList.add(new NovelBook("a",3200,"a_author"));
        bookList.add(new NovelBook("b",4200,"b_author"));
        bookList.add(new NovelBook("c",5200,"c_author"));
    }

    public static void main(String[] args){
        NumberFormat formatter=NumberFormat.getCurrencyInstance();
        formatter.setMaximumFractionDigits(2);
        StdOut.println("---------");
        for (IBook book: bookList){
            StdOut.println("book: "+book.getName()+"\t author: "+book.getAuthor()+"\t price: "+book.getPrice());
        }
    }
}
