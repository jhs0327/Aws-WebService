package com.jhs.book.springboot.vo;


import com.jhs.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestVo {
    private String title;
    private String content;
    private String author;
    @Builder
    public PostsSaveRequestVo(String title, String content, String author)
    {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEneity()
    {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}
