package umc.spring.study.web.dto;

import lombok.*;

public class TempResponse {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor

    //dto는 내부적으로 static 클래스를 만드는 것이 좋음
    // dto 자체는 많은 곳에서 사용가능하기에 static class로 만들면 범용적으로 사용 가능
    public static class TempTestDTO{
        String testString;
    }
}
