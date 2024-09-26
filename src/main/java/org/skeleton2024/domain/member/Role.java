package org.skeleton2024.domain.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
    USER("사용자"),
    ADMIN("관리자");

    String name;
}
