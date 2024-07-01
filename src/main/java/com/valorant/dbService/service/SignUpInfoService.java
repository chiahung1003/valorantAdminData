package com.valorant.dbService.service;

import com.valorant.dbService.entity.SignUpInfo;
import com.valorant.dbService.repository.SignUpInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author KenLi
 * @date 2023-08-03
 */
@Service
public class SignUpInfoService {
    private SignUpInfoRepository signUpInfoRepository;

    @Autowired
    public void setSignUpInfoRepository(SignUpInfoRepository signUpInfoRepository) {
        this.signUpInfoRepository = signUpInfoRepository;
    }

    public List<SignUpInfo> findAll() {
        Sort sort = Sort.by(Sort.Direction.ASC, "createAt");
        return signUpInfoRepository.findAll(sort);
    }
}
