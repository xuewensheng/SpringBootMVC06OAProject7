package com.mashibing.springboot.mapper;

import com.mashibing.springboot.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mashibing.springboot.entity.AccountEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-10-22 10:40:18
 */
@Mapper
@Component
public interface AccountDao extends BaseMapper<AccountEntity> {
	
}
