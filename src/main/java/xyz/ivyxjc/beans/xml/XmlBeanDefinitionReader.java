package xyz.ivyxjc.beans.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import xyz.ivyxjc.beans.BeanDefinition;
import xyz.ivyxjc.beans.PropertyValue;
import xyz.ivyxjc.beans.io.Resource;
import xyz.ivyxjc.beans.io.ResourceLoader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;

/**
 * Created by jc on 1/5/2017.
 */
public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader {

    public XmlBeanDefinitionReader(ResourceLoader resourceLoader){
        super(resourceLoader);
    }

//    @Override
//    public void loadBeanDefinition(String locate) throws Exception{
//        InputStream inputStream=getResourceLoader().getResource(locate);
//        doLoadBeanDefinition(inputStream);
//    }


    @Override
    public void loadBeanDefinition(String locate) throws Exception {
        InputStream inputStream=getResourceLoader().getResource(locate).getInputStream();
        doLoadBeanDefinition(inputStream);
    }

    protected void doLoadBeanDefinition(InputStream inputStream) throws Exception{
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder=factory.newDocumentBuilder();
        Document doc=docBuilder.parse(inputStream);

        //解析
        registerBeanDefinitions(doc);
        inputStream.close();

    }

    public void registerBeanDefinitions(Document doc){
        Element root=doc.getDocumentElement();
        parseBeanDefinition(root);
    }

    protected void parseBeanDefinition(Element root){
        NodeList nl=root.getChildNodes();
        for (int i = 0; i < nl.getLength(); i++) {
            Node node=nl.item(i);
            if(node instanceof Element){
                Element ele=(Element) node;
                processBeanDefinition(ele);
            }
        }
    }

    protected void processBeanDefinition(Element ele){
        String name=ele.getAttribute("name");
        String className=ele.getAttribute("class");
        BeanDefinition beanDefinition=new BeanDefinition();
        processProperty(ele,beanDefinition);
        beanDefinition.setBeanClassName(className);
        getRegistry().put(name,beanDefinition);
    }

    protected void processProperty(Element ele,BeanDefinition definition){
        NodeList propertyNode=ele.getElementsByTagName("property");
        for (int i = 0; i < propertyNode.getLength(); i++) {
            Node node=propertyNode.item(i);
            if(node instanceof Element){
                Element propertyEle=(Element) node;
                String name=propertyEle.getAttribute("name");
                String value=propertyEle.getAttribute("value");
                definition.getPropertyValues().addPropertyValue(new PropertyValue(name,value));
            }
        }
    }

}