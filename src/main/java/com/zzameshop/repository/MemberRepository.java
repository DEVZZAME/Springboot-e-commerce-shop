package com.zzameshop.repository;

import com.zzameshop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String Email);
    //회원가입시 중복회원이 있는지 확인할 수 있는 쿼리메소드를 작성


}
