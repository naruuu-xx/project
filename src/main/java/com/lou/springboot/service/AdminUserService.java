package com.lou.springboot.service;

import com.lou.springboot.entity.AdminUser;
import com.lou.springboot.utils.PageResult;
import com.lou.springboot.utils.PageUtil;

public interface AdminUserService {
    AdminUser updateTokenAndLogin(String userName, String password);

    PageResult getAdminUserPage(PageUtil pageUitl);

    AdminUser selectByUserName(String userName);

    int save(AdminUser user);

    AdminUser selectById(Long id);


    int updatePassword(AdminUser user);

    int deleteBatch(Integer[] ids);

    AdminUser getAdminUserByToken(String token);
}
