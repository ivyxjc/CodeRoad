package xyz.ivyxjc.springbasicdemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@SpringBootApplication
class SpringbasicdemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringbasicdemoApplication::class.java, *args)
}
