package com.valorant.signUpInfo.controller;

import com.valorant.dbService.entity.SignUpInfo;
import com.valorant.dbService.service.SignUpInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author KenLi
 * @date 2023-07-25
 */
@RestController
public class SignUpInfoController {

    private SignUpInfoService signUpInfoService;

    @Autowired
    public void setSignUpInfoService(SignUpInfoService signUpInfoService) {
        this.signUpInfoService = signUpInfoService;
    }

    @GetMapping("api/v1/admin/signUpInfos")
    public List<SignUpInfo> getSignUpInfos() {
        return signUpInfoService.findAll();
    }
}
