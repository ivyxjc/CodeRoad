package xyz.ivyxjc;

/**
 * Created by jc on 1/5/2017.
 */
public class PropertyValue {

    private String name;
    private String value;


    public PropertyValue(String name,String value){
        this.name=name;
        this.value=value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

}
