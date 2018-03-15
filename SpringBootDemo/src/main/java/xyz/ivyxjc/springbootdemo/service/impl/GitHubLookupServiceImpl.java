package xyz.ivyxjc.springbootdemo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import xyz.ivyxjc.springbootdemo.model.GitUser;

import java.util.concurrent.Future;


@Service
public class GitHubLookupServiceImpl {
    private static final Logger logger = LoggerFactory.getLogger(GitHubLookupServiceImpl.class);


    private final RestTemplate restTemplate;

    public GitHubLookupServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Async
    public Future<GitUser> findUser(String user) throws InterruptedException {
        logger.info("Looking up " + user);
        String url = String.format("https://api.github.com/users/%s", user);
        GitUser results = restTemplate.getForObject(url, GitUser.class);
        // Artificial delay of 1s for demonstration purposes
        Thread.sleep(1000L);
        return new AsyncResult<>(results);
    }

}
