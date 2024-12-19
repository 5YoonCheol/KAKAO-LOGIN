package org.kr.co.kakao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KakaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KakaoApplication.class, args);
    }

}
