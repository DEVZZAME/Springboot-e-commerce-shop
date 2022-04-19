package com.zzameshop.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class MemberFormDto {

    @NotBlank(message = "이름 값은 필수로 입력해주셔야 합니다.")
    private String name;

    @NotEmpty(message = "이메일 값은 필수로 입력해주셔야 합니다.")
    @Email(message = "올바른 이메일 형식으로 입력해주십시오.")
    private String email;

    @NotEmpty(message = "비밀번호 값은 필수로 입력해주셔야 합니다.")
    @Length(min = 8, max = 16, message = "비밀번호는 대소문자 관계없이 8자 이상, 16자 이하로 입력해주십시오.")
    private String password;

    @NotEmpty(message = "주소 값은 필수로 입력해주셔야 합니다.")
    private String address;
}
