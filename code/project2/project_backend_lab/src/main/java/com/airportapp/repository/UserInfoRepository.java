package com.airportapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airportapp.bo.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Integer>{
    public Optional<UserInfo> findByName(String username);
}		 