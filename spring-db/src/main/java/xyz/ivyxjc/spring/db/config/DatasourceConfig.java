package xyz.ivyxjc.spring.db.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ivyxjc
 * @since 4/22/2018
 */
@Configuration
public class DatasourceConfig {
    @Bean
    public DataSource druidDataSource() {
        Properties properties = new Properties();
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("jdbc.properties");
        DataSource dataSource = null;
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
