package com.baidu.settings.service.impl;

import com.baidu.settings.dao.UserDao;
import com.baidu.settings.domain.User;
import com.baidu.settings.service.UserService;
import com.baidu.utils.ServiceFactory;
import com.baidu.utils.SqlSessionUtil;

/**
 * @authar zheng
 * @create 2021-11-02-21:38
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = (UserDao) SqlSessionUtil.getSqlSession().getMapper(UserDao.class);

}
