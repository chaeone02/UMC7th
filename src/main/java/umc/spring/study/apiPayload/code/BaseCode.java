package umc.spring.study.apiPayload.code;
// 구체화하는 status에서 두개의 메소드를 반드시 override 할 것을 강제하는 역할
public interface BaseCode {

    ReasonDTO getReason();

    ReasonDTO getReasonHttpStatus();
}
