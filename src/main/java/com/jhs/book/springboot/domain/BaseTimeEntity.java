package com.jhs.book.springboot.domain;


import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
//jpa entity 클래스들이 BaseTimeEntity을 상속할 경우 필드가 칼럼으로 인식하도록 함
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity
{
    @CreatedDate
    //Entity가 생성되어 저장될 때 시간이 자동 저장됩니다.
    private LocalDateTime createdDate;

    @LastModifiedDate
    //조회한 Entity의 값을 변경할때 시간이 자동 저장됩니다.
    private LocalDateTime modifiedDate;
}
