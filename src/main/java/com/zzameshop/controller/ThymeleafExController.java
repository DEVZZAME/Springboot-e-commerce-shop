package com.zzameshop.controller;

import com.zzameshop.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(value = "/thymeleaf") //클라이언트의 요청에 대해서 어떤 컨트롤러가 처리할지 매핑하는 어노테이션.
                                        //url에 "/thymeleaf" 경로로 오는 요청을 ThymeleafExController가 처리하도록 함
public class ThymeleafExController {

    @GetMapping(value = "/ex01")
    public String thymeleafExample01(Model model){
        model.addAttribute("data", "타임리프 예제 입니다."); //model 객체를 이용해 뷰에 전달한 데이터를 key, value 구조로 넣어 줌.
        return "thymeleafEx/thymeleafEx01"; //templates 폴더를 기준으로 뷰의 위치와 이름(thymeleafEx01)을 반환함.
    }

    @GetMapping(value = "/ex02")
    public String thymeleafExample02(Model model) {

        ItemDto itemDto = new ItemDto();
        itemDto.setItemDetail("상품 상세 설명");
        itemDto.setItemNm("테스트 상품1");
        itemDto.setPrice(10_000);
        itemDto.setRegTime(LocalDateTime.now());

        model.addAttribute("itemDto", itemDto); //앞에 있는 itemDto는 Key값, 뒤에 있는 itemDto는 thymeleafExample02에서 저장한 itemDto
        return "thymeleafEx/thymeleafEx02";
    }

    @GetMapping(value = "/ex03")
    public String thymeleafExample03(Model model) {
        List<ItemDto> itemDtoList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("상품 상세 설명" + i);
            itemDto.setItemNm("테스트 상품" + i);
            itemDto.setPrice(10_000 + i);
            itemDto.setRegTime(LocalDateTime.now());

            itemDtoList.add(itemDto);
        }

        model.addAttribute("itemDtoList", itemDtoList);
        return "thymeleafEx/thymeleafEx03";
    }

    @GetMapping(value = "/ex04")
    public String thymeleafExample04(Model model) {
        List<ItemDto> itemDtoList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("상품 상세 설명" + i);
            itemDto.setItemNm("테스트 상품" + i);
            itemDto.setPrice(10_000 + i);
            itemDto.setRegTime(LocalDateTime.now());

            itemDtoList.add(itemDto);
        }
        model.addAttribute("itemDtoList", itemDtoList);
        return "thymeleafEx/thymeleafEx04";
    }

    @GetMapping(value = "/ex06")
    public String thymeleafExample06() {
        return "thymeleafEx/thymeleafEx06";
    }

    @GetMapping(value = "/ex07")
    public String thymeleafExample07(String param1, String param2, String param3, Model model) {
        model.addAttribute("param1", param1);
        model.addAttribute("param2", param2);
        model.addAttribute("param3", param3);
        return "thymeleafEx/thymeleafEx07";
    }

    @GetMapping(value = "/ex08")
    public String thymeleafExample08() {
        return "thymeleafEx/thymeleafEx08";
    }
}