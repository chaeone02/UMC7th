package umc.spring.study.service.MemberService;

import lombok.*;
import org.springframework.stereotype.Service;
import umc.spring.study.domain.Member;
import umc.spring.study.repository.MemberRepository;
import umc.spring.study.web.dto.MemberRequestDTO;

@Service
@RequiredArgsConstructor
public class MemberQueryServiceImpl implements MemberCommandService{

    private final MemberRepository memberRepository;

    @Override
    public Member joinMember(MemberRequestDTO.JoinDto request) {

        return null;
    }
}
