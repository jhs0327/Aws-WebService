package com.jhs.book.springboot.web;


import com.jhs.book.springboot.service.PostsService;
import com.jhs.book.springboot.vo.PostsSaveRequestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController
{
    private final PostsService postsService;

    @PostMapping("api/v1/posts")
    public Long sava(@RequestBody PostsSaveRequestVo requestVo)
    {
        return postsService.save(requestVo);
    }
}
