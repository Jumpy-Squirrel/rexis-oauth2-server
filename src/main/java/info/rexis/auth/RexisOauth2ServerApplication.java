package info.rexis.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class RexisOauth2ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RexisOauth2ServerApplication.class, args);
    }
}
