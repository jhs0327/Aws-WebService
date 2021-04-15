package com.jhs.book.springboot.service;


import com.jhs.book.springboot.domain.posts.PostsRepository;
import com.jhs.book.springboot.vo.PostsSaveRequestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService
{
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestVo requestVo)
    {
        return postsRepository.save(requestVo.toEneity()).getId();
    }


}
