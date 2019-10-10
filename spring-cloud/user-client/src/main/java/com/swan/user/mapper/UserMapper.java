package com.swan.user.mapper;

import com.swan.user.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserMapper extends JpaRepository<User,String>,JpaSpecificationExecutor<User>{

    User findByNickname(String nickname);

}
