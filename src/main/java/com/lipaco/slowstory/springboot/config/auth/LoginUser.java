package com.lipaco.slowstory.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션 생성 위치 지정
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
// 어노테이션이 생성됨
public @interface LoginUser {
}