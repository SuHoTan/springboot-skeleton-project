package org.skeleton2024.domain.member;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "MEMBER")  // 테이블 이름을 대문자로 지정
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NAME")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE")
    private Role role;

    @CreatedDate
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Column(name = "DELETED")
    private boolean deleted;

    @Column(name = "DELETED_AT")
    private LocalDateTime deletedAt;

    @Builder
    public Member(String username, String password, String email, String name, Role role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.role = role;
    }
}