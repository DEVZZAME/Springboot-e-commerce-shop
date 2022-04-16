package com.zzameshop.service;

import com.zzameshop.entity.Member;
import com.zzameshop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    //원래는 @AutoWire, 필드(Setter), 생성자 주입을 해줘야 하지만 @RequireArgsConstructor 어노테이션을 사용하면
    // final 또는 @NonNull이 붙은 필드에 생성자를 자동으로 주입시켜줌

    public Member saveMember(Member member) {
        validateDuplicateMember(member);
        return memberRepository.save(member);
    }

    private void validateDuplicateMember(Member member) {
        Member findMember = memberRepository.findByEmail(member.getEmail());
        if (findMember != null) {
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }
    }


}