package com.example.rentalcarsrestapi.exceptions;

import com.example.rentalcarsrestapi.dto.UserResponse;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class UserNotFoundAdvice extends ResponseEntityExceptionHandler {

    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public UserResponse userNotFoundHandler(UserNotFoundException e) {
        return new UserResponse(e.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(ExpiredJwtException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public UserResponse jwtTokenExpired(ExpiredJwtException e) {
        return new UserResponse(HttpStatus.UNAUTHORIZED.value() +": JSON Web Token expired");
    }


}
