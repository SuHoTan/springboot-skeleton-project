package org.skeleton2024.Form;

import lombok.Builder;

public record MemberForm(String username, String password, String email, String name, String role) {

    @Builder
    public MemberForm(String username, String password, String email, String name, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.role = role;
    }
}