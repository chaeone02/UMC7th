package umc.spring.study.apiPayload.code;

// 응답을 해주는 코드

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Builder
public class ReasonDTO {

    private HttpStatus httpStatus;

    private final boolean isSuccess;
    private final String code;
    private final String message;

    public boolean getIsSuccess(){return isSuccess;}
}