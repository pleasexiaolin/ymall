package com.xiaolin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaolin.domain.dto.LoginFormDTO;
import com.xiaolin.domain.po.User;
import com.xiaolin.domain.vo.UserLoginVO;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author 小林
 * @since 2023-05-05
 */
public interface IUserService extends IService<User> {

    UserLoginVO login(LoginFormDTO loginFormDTO);

    void deductMoney(String pw, Integer totalFee);
}
