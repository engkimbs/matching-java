package engkimbs.matchingjava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private final Logger log = LoggerFactory.getLogger(Application.class);

    @Value("matching")
    private String appName;

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            String beanNames = Arrays.stream(ctx.getBeanDefinitionNames())
                    .collect(Collectors.toCollection(TreeSet::new))
                    .stream()
                    .collect(Collectors.joining("]\n[", "\n[", "]"));
            log.info("process=commandLineRunner, status=beansLoaded, beans={}", beanNames);
            log.info("Application {} started", appName);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
