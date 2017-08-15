package xyz.ivyxjc.beans;
/**
 * Created by jc on 1/5/2017.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 用于bean的属性注入
 */
public class PropertyValues {

    private List<PropertyValue> mPropertyValuesList=new ArrayList<PropertyValue>();

    public PropertyValues(){

    }

    public void addPropertyValue(PropertyValue pv){
        // TODO: 1/5/2017  根据propertyname 进行去重
        mPropertyValuesList.add(pv);
    }

    public List<PropertyValue> getPropertyValuesList() {
        return mPropertyValuesList;
    }
}
