package umc.spring.study.web.controller;

import jakarta.validation.Valid;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import umc.spring.study.apiPayload.ApiResponse;
import umc.spring.study.converter.MemberConverter;
import umc.spring.study.domain.Member;
import umc.spring.study.service.MemberService.MemberCommandService;
import umc.spring.study.web.dto.MemberRequestDTO;
import umc.spring.study.web.dto.MemberResponseDTO;

@RestController
@RequestMapping("/members")
public class MemberRestController {

    private final MemberCommandService memberCommandService;

    @Autowired
    public MemberRestController(@Qualifier("memberCommandServiceImpl") MemberCommandService memberCommandService) {
        this.memberCommandService = memberCommandService;
    }

    @PostMapping("/")
    public ApiResponse<MemberResponseDTO.JoinResultDTO> join(@RequestBody @Valid MemberRequestDTO.JoinDto request){
        Member member = memberCommandService.joinMember(request);
        return ApiResponse.onSuccess(MemberConverter.toJoinResultDTO(member));
    }
}
