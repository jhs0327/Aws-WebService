package com.jhs.book.springboot.web;


import com.jhs.book.springboot.service.PostsService;
import com.jhs.book.springboot.vo.PostsResponseVo;
import com.jhs.book.springboot.vo.PostsSaveRequestVo;
import com.jhs.book.springboot.vo.PostsUpdateRequestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    @PutMapping("api/v1/posts/{id}")
    public Long updata (@PathVariable Long id, @RequestBody PostsUpdateRequestVo requestVo)
    {
        return postsService.update(id, requestVo);
    }
    @GetMapping("api/v1/posts/{id}")
    public PostsResponseVo findById (@PathVariable Long id)
    {
        return postsService.findById(id);
    }





}
