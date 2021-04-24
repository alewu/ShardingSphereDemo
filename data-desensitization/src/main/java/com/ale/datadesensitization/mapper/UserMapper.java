package com.ale.datadesensitization.mapper;

import com.ale.datadesensitization.entity.MyUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @author ale
 */
@Repository
public interface UserMapper extends BaseMapper<MyUser> {
}
