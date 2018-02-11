package xyz.ivyxjc.module;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Scopes;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

public class AppModule extends AbstractModule {


    @Override
    protected void configure() {
        Names.bindProperties(binder(), loadProperties());
        bind(DataSource.class).toProvider(BasicDatasourceProvider.class).in(Scopes.SINGLETON);
        bind(JdbcTemplate.class).toProvider(JdbcTemplateProvider.class).in(Scopes.SINGLETON);
    }

    private Properties loadProperties() {
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getClassLoader().getResourceAsStream("jdbc.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    static class BasicDatasourceProvider implements Provider<DataSource> {
        private final String dbUrl;
        private final String username;
        private final String password;

        @Inject
        public BasicDatasourceProvider(
                @Named("url")
                        String dbUrl,
                @Named("username")
                        String username,
                @Named("password")
                        String password) {
            this.dbUrl = dbUrl;
            this.username = username;
            this.password = password;
        }

        @Override
        public DataSource get() {
            final BasicDataSource dataSource = new BasicDataSource();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                dataSource.setUrl(dbUrl);
                dataSource.setUsername(username);
                dataSource.setPassword(password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return dataSource;
        }
    }

    static class JdbcTemplateProvider implements Provider<JdbcTemplate> {
        private final DataSource mDataSource;

        @Inject
        public JdbcTemplateProvider(DataSource dataSource) {
            mDataSource = dataSource;
        }

        @Override
        public JdbcTemplate get() {
            JdbcTemplate jdbcTemplate = new JdbcTemplate(mDataSource);
            return jdbcTemplate;
        }
    }
}
