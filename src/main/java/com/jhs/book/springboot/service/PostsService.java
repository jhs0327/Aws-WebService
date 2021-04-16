package com.jhs.book.springboot.service;


import com.jhs.book.springboot.domain.posts.Posts;
import com.jhs.book.springboot.domain.posts.PostsRepository;
import com.jhs.book.springboot.vo.PostsResponseVo;
import com.jhs.book.springboot.vo.PostsSaveRequestVo;
import com.jhs.book.springboot.vo.PostsUpdateRequestVo;
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
        return postsRepository.save(requestVo.toEntity()).getId();
    }
    @Transactional
    public Long update(Long id, PostsUpdateRequestVo requestVo)
    {
        Posts posts = postsRepository.findById(id).orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id="+id));
        posts.update(requestVo.getTitle(), requestVo.getContent());
        return id;
    }
    @Transactional
    public PostsResponseVo findById (Long id)
    {
        Posts entity = postsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));
        return new PostsResponseVo(entity);
    }





}
