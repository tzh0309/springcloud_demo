package rlh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by RLH on 2017/3/3.
 */
@SpringBootApplication
@RestController
@EnableConfigurationProperties({ConsulProperties.class,ServerConfig.class})
public class ConsulApp {

    @Autowired
    private ConsulProperties ymlConfig;

    @Autowired
    private ServerConfig serverConfig;



    @RequestMapping("/")
    public String home() {
        return ymlConfig.getPort()+":Hello:"+serverConfig.getInstanceId();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsulApp.class, args);
    }
}
