package com.example.rentalcarsrestapi.security;

import com.example.rentalcarsrestapi.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

public class UserDetailsImpl implements UserDetails {
    //  email as username
    private String username;
    private Long id;
    private String password;
    private boolean isEnabled;
    private Collection<GrantedAuthority> authorities;

    public UserDetailsImpl(User user) {
        //  email as username
        this.username = user.getEmail();
        this.id = user.getId();
        this.password = user.getPassword();
        this.isEnabled = user.isEnabled();
        authorities = user.getRoles().stream().map(roleType -> new SimpleGrantedAuthority(roleType.getRole().name())).collect(Collectors.toSet());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}
