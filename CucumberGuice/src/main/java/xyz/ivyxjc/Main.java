package xyz.ivyxjc;

import com.google.inject.Guice;
import com.google.inject.Injector;
import xyz.ivyxjc.dao.impl.BaseGuidDaoImpl;
import xyz.ivyxjc.module.AppModule;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppModule());
        BaseGuidDaoImpl baseGuidDao = injector.getInstance(BaseGuidDaoImpl.class);

        System.out.println(baseGuidDao.getBaseGuidByGuid("123456"));
    }
}
