package xyz.ivyxjc.beans.xml;

import org.junit.Assert;
import org.junit.Test;
import xyz.ivyxjc.beans.BeanDefinition;
import xyz.ivyxjc.beans.io.ResourceLoader;

import java.util.Map;

/**
 * Created by ivxyjc on 2017/1/11.
 */
public class XmlBeanDefinitionReaderTest {

    @Test
    public void test() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinition("resource_test.xml");
//        Assert.assertNotNull(xmlBeanDefinitionReader);
        Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
        Assert.assertTrue(registry.size() > 0);
    }

}
