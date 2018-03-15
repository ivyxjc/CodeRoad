package xyz.ivyxjc.springbootdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import xyz.ivyxjc.springbootdemo.dao.BookRepository;

import java.util.concurrent.Executor;


@SpringBootApplication
@PropertySource("classpath:jdbc.properties")
@EnableCaching
@EnableAsync
public class SpringbootDemoApplication extends AsyncConfigurerSupport {

    private static final Logger logger = LoggerFactory.getLogger(SpringbootDemoApplication.class);


//    @Autowired
//    private IUserService usi;


    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(3);
        executor.setMaxPoolSize(6);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("GithubLookup-");
        executor.initialize();
        return executor;
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext context) {
//        return t -> {
//            String[] beanNames = context.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String name : beanNames) {
//                System.out.println(name);
//            }
//        };
//    }

    @Bean
    public CommandLineRunner testCache(ApplicationContext context) {
        return t -> {
//            logger.info(".... Fetching books");
//            logger.info("isbn-1234 -->" + bookRepository.getUserById(1) + " -- " + LocalTime.now());
//            logger.info("isbn-4567 -->" + bookRepository.getUserById(1) + " -- " + LocalTime.now());
//            logger.info("isbn-1234 -->" + bookRepository.getUserById(1) + " -- " + LocalTime.now());
        };
    }

}
