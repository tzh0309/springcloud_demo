package rlh;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by RLH on 2017/3/7.
 */
@Component
@ConfigurationProperties(prefix="server")
public class ConsulProperties {

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    private int port;
}
