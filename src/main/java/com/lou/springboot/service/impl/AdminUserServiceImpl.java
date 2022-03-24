package com.lou.springboot.service.impl;

import com.lou.springboot.dao.AdminUserDao;
import com.lou.springboot.entity.AdminUser;
import com.lou.springboot.service.AdminUserService;
import com.lou.springboot.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminUserService")
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    private AdminUserDao adminUserDao;

    @Override
    public AdminUser updateTokenAndLogin(String userName, String password) {
        AdminUser adminUser = adminUserDao.getAdminUserByUserNameAndPassword(userName, MD5Util.MD5Encode(password, "UTF-8"));
        if (adminUser != null) {
            //登录后即执行修改token的操作
            String token = getNewToken(System.currentTimeMillis() + "", adminUser.getId());
            if (adminUserDao.updateUserToken(adminUser.getId(), token) > 0) {
                //返回数据时带上token
                adminUser.setUserToken(token);
                return adminUser;
            }
        }
        return null;
    }

    /**
     * 获取token值
     *
     * @param sessionId
     * @param userId
     * @return
     */
    private String getNewToken(String sessionId, Long userId) {
        String src = sessionId + userId + NumberUtil.genRandomNum(4);
        return SystemUtil.genToken(src);
    }

    public PageResult getAdminUserPage(PageUtil pageUtil){
        List<AdminUser> users = adminUserDao.findAdminUsers(pageUtil);
        int total = adminUserDao.getTotalAdminUser(pageUtil);
        PageResult pageResult = new PageResult(users, total, pageUtil.getLimit(), pageUtil.getPage());
        return pageResult;
    }

    @Override
    public AdminUser selectByUserName(String userName) {
        return adminUserDao.getAdminUserByUserName(userName);
    }

    @Override
    public int save(AdminUser user) {
        user.setPassword(MD5Util.MD5Encode(user.getPassword(),"UTF-8"));
        return adminUserDao.addUser(user);
    }

    @Override
    public AdminUser selectById(Long id) {
        return adminUserDao.getAdminUserById(id);
    }

    @Override
    public int updatePassword(AdminUser user) {
        return adminUserDao.updateUserPassword(user.getId(), MD5Util.MD5Encode(user.getPassword(), "UTF-8"));
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return adminUserDao.deleteBatch(ids);
    }

    @Override
    public AdminUser getAdminUserByToken(String userToken) {
        return adminUserDao.getAdminUserByToken(userToken);
    }


}
