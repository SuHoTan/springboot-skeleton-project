package org.skeleton2024.cofig;

import lombok.RequiredArgsConstructor;
import org.skeleton2024.security.CustomUserDetailsManger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final CustomUserDetailsManger customUserDetailsManger;
    private final PasswordEncoder passwordEncoder;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // csrf 비보호
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/login", "/register", "h2-console/**").permitAll() // 특정 경로는 인증 없이 접근 허용
                        .anyRequest().authenticated() // 나머지 요청 인증 필요
                )
                .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS) // 세션 미사용, JWT 관리
                )
                .formLogin(form -> form
                        .loginPage("/login") // 로그인페이지 설정
                        .permitAll() // 누구나 접근
                )
                .logout(logout -> logout
                        .permitAll() //
                )
                .headers(headers -> headers
                        .frameOptions(frameOptions -> frameOptions.disable()) // H2 콘솔을 위한 X-Frame-Options 비활성화
                );

        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder =
                http.getSharedObject(AuthenticationManagerBuilder.class);

        authenticationManagerBuilder
                .userDetailsService(customUserDetailsManger) // 커스텀한 DetailsManager 설정
                .passwordEncoder(passwordEncoder);
        return authenticationManagerBuilder.build();
    }

}