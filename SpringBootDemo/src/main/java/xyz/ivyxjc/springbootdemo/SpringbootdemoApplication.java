package xyz.ivyxjc.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import xyz.ivyxjc.springbootdemo.dao.BookRepository;

import java.time.LocalTime;
import java.util.logging.Logger;

//import xyz.ivyxjc.springbootdemo.dao.BookRepository;

@SpringBootApplication
@PropertySource("classpath:jdbc.properties")
@EnableCaching
public class SpringbootdemoApplication {

    private static final Logger logger = Logger.getLogger("AppRunner");


//    @Autowired
//    private IUserService usi;


    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);

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
            logger.info(".... Fetching books");
            logger.info("isbn-1234 -->" + bookRepository.getUserById(1) + " -- " + LocalTime.now());
            logger.info("isbn-4567 -->" + bookRepository.getUserById(1) + " -- " + LocalTime.now());
            logger.info("isbn-1234 -->" + bookRepository.getUserById(1) + " -- " + LocalTime.now());
            logger.info("isbn-4567 -->" + bookRepository.getUserById(1) + " -- " + LocalTime.now());
            logger.info("isbn-1234 -->" + bookRepository.getUserById(1) + " -- " + LocalTime.now());
            logger.info("isbn-1234 -->" + bookRepository.getUserById(1) + " -- " + LocalTime.now());
        };
    }

}
