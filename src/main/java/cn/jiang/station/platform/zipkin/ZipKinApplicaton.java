package cn.jiang.station.platform.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipKinApplicaton {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplicaton.class, args);
    }
}
