package com.shinowit.validate;

import com.shinowit.entity.TbaMemberinfo;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Administrator on 2014/12/25.
 */
public class UserinfoValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz==TbaMemberinfo.class; //判断待校验对象是否是UserInfo类
    }

    @Override
    public void validate(Object target, Errors errors) {
        TbaMemberinfo userInfo=(TbaMemberinfo)target;
        if ((userInfo.getUsername()==null) || (userInfo.getUsername().trim().length()>3)){
            ValidationUtils.rejectIfEmpty(errors, "username", null, "用户名输入不正确或不能为空");
        }
        if (null == userInfo.getPwd() || "".equals(userInfo.getPwd()))
            errors.rejectValue("Pwd", null, "密码输入不正确");
    }

}
