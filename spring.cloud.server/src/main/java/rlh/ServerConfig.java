package rlh;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by RLH on 2017/3/8.
 */
@Component
@ConfigurationProperties(prefix="spring.cloud.consul.discovery")
public class ServerConfig {
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instance_id) {
        this.instanceId = instance_id;
    }

    private String instanceId;
}
