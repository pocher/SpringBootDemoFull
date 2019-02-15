/*
package com.manning.readinglist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.Collections;

*/
/**
 * @author 王禹展 wyuzhan@163.com
 * @date 2019/2/15  10:02
 *//*

//@Configuration
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final ReaderRepository readerRepository;
    private Logger logger = LoggerFactory.getLogger(SecurityConfig.class);

    @Autowired
    public SecurityConfig(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        logger.info("第一个configure");

//        http.authorizeRequests()
//                .antMatchers("/")
//                .access("hasRole('READER')")
//                .antMatchers("/**")
//                .permitAll()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .failureUrl("/login?error=true")
//                .and()
//                .logout()
//                .logoutSuccessUrl("/logout");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        logger.info("第二个configure");
//        auth.userDetailsService(new UserDetailsService() {
//            @Override
//            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//                Reader one = readerRepository.getOne(username);
////                logger.info("one：", one);
//                if (null == one) {
//                    throw new UsernameNotFoundException(username);
//                }
//                return new UserDetails() {
//                    private static final long serialVersionUID = -7458003331440243796L;
//
//                    @Override
//                    public Collection<? extends GrantedAuthority> getAuthorities() {
//                        return  Collections.singletonList(new SimpleGrantedAuthority("READER1"));
//                    }
//
//                    @Override
//                    public String getPassword() {
//                        return "12";
//                    }
//
//                    @Override
//                    public String getUsername() {
//                        return "hh";
//                    }
//
//                    @Override
//                    public boolean isAccountNonExpired() {
//                        return false;
//                    }
//
//                    @Override
//                    public boolean isAccountNonLocked() {
//                        return false;
//                    }
//
//                    @Override
//                    public boolean isCredentialsNonExpired() {
//                        return false;
//                    }
//
//                    @Override
//                    public boolean isEnabled() {
//                        return false;
//                    }
//                };
//            }
//        });
    }
}
*/
