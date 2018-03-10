package xyz.ivyxjc.beans;

/**
 * Created by jc on 1/5/2017.
 */
public class PropertyValue {

    private String name;
    private Object value;


    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
