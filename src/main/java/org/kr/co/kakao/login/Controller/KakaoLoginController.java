package org.kr.co.kakao.login.Controller;

import lombok.RequiredArgsConstructor;
import org.kr.co.kakao.login.Dto.KakaoAccount;
import org.kr.co.kakao.login.Service.KakaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KakaoLoginController {

    private final KakaoService kakaoService;

    /**
     * https://kauth.kakao.com/oauth/authorize?response_type=code&client_id={REST API KEY}&redirect_uri={RedirectURL}
     * 위의 결과로 code를 받아와서, 해당 코드를 통해 카카오 인증 서버에서 accessToken/refreshToken을 받아옵니다.
     */

    @GetMapping("/oauth")
    public KakaoAccount getKakaoAccount(@RequestParam("code") String code) {
        return kakaoService.getInfo(code).getKakaoAccount();
    }
}
