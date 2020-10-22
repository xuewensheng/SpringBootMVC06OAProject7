package com.mashibing.springboot.service;
import com.mashibing.springboot.entity.AccountEntity;
import com.mashibing.springboot.mapper.AccountDao;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mashibing.springboot.entity.Account;


/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 11:13 2020/10/22
 */
@Service
public class AccountServicePlusImpl extends ServiceImpl<AccountDao, AccountEntity> implements AccountServicePlus {


}
