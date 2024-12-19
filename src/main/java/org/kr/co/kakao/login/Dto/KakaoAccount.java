package org.kr.co.kakao.login.Dto;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class KakaoAccount {
    private Profile profile;
    private String gender;
    private String email;
}
