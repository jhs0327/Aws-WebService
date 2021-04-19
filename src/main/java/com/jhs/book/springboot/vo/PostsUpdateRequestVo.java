package com.jhs.book.springboot.vo;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
// @NoArgsConstructor : 생성자 자동 생성
public class PostsUpdateRequestVo
{
    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestVo(String title, String content)
    {
        this.title = title;
        this.content = content;
    }



}
