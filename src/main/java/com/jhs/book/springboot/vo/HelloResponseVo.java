package com.jhs.book.springboot.vo;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
//final 필드나, @NonNull 이 붙은 필드에 대해 생성자를 생성해 줍니다
public class HelloResponseVo {

    private final String name;
    private final int amount;


}
