package com.zzameshop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

//데이터를 주고받을 때는 Entity 클래스 자체를 반환하면 안되고,
//데이터 전달용 객체인 DTO(Data Transfer Object)를 생성해서 사용해야함.
//DB의 설계를 외부에 노출할 필요도 없고, 요청과 응답 객체가 항상 Entity와 같지 않기 때문.
@Getter
@Setter
public class ItemDto {

    private Long id;

    private String itemNm;

    private Integer price;

    private String itemDetail;

    private String sellStatCd;

    private LocalDateTime regTime;

    private LocalDateTime updateTime;

}
