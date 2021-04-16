package com.jhs.book.springboot.vo;


import com.jhs.book.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseVo {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseVo(Posts entity)
    {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }


}
