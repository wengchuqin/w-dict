package top.chuqin.wdict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories({"top.chuqin.wdict.repository"})
public class WDictApplication {

    public static void main(String[] args) {
        SpringApplication.run(WDictApplication.class, args);
    }
}
