package com.kevin.building.activity.logicutils;

import com.kevin.baselibrary.constant.SuperSPKey;
import com.kevin.baselibrary.utils.SPUtils;
import com.kevin.building.constants.SPKey;

/**
 * Author:  liangjin.bai
 * Email: bailiangjin@gmail.com
 * Create Time: 2015/12/10 14:09
 */
public class AccountUtils {

    /**
     * 账户信息登出
     *
     * @return
     */
    public static boolean logout() {

        // SPUtils.remove(SuperSPKey.USER_NAME);
        //清空存储的密码
        SPUtils.remove(SPKey.PASSWORD);
        //清空是否清楚密码勾选框状态
        SPUtils.remove(SPKey.SAVEPWD);
        return true;
    }


    /**
     * 保存登录信息
     *
     * @param userName       用户名
     * @param password       密码
     * @param isSavePassword 是否记住密码
     */
    public static void saveLoginInfo(String userName, String password, boolean isSavePassword) {
        SPUtils.putString(SuperSPKey.USER_NAME, userName);
        SPUtils.putString(SuperSPKey.PASSWORD, isSavePassword ? password : "");
        SPUtils.putBoolean(SuperSPKey.SAVEPWD, isSavePassword);

    }

    public static String getUserName() {
        return SPUtils.getString(SuperSPKey.USER_NAME);
    }

    public static String getPassword() {
        return SPUtils.getString(SuperSPKey.PASSWORD);
    }

    public static boolean isSavePassword() {
        return SPUtils.getBoolean(SuperSPKey.SAVEPWD);
    }
}
