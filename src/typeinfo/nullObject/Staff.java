package typeinfo.nullObject;

import java.util.ArrayList;

/**
 * Created by ivxyjc on 2017/1/9.
 */
public class Staff extends ArrayList<Position> {


    public void add(String title, Person person){
        add(new Position(title,person));
    }

    public void add(String ... titles){
        for(String title:titles){
            add(new Position(title));
        }
    }

    public Staff(String... titles){
        add(titles);
    }

    public boolean positionAvailable(String title){
        for(Position position:this){
            if(position.getTitle().equals(title) && position.getPerson()==Person.NULL){
                return true;
            }
        }
        return false;
    }

    public void fillPosition(String title, Person hire){
        for(Position position:this){
            if(position.getTitle().equals(title)&&position.getPerson()==Person.NULL){
                position.setPerson(hire);
                return;
            }
        }
        throw new RuntimeException(
                "Position "+title+" not available");
    }

    public static void main(String[] args){
        Staff staff=new Staff("President","CTO","Marketing Manager","Product Manager","Project Lead","Software Engineer");
        staff.fillPosition("President",new Person("Me","last","addressMe"));
        for(Position i:staff){
            System.out.println(i);
        }
    }


}
