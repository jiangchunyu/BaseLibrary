package com.kevin.building.demo.dynamic.bean.viewbean.item;

import com.kevin.building.demo.dynamic.bean.viewbean.type.ViewType;
import com.kevin.building.demo.dynamic.bean.viewbean.base.AbsSelectedItem;

/**
 * Author:  liangjin.bai
 * Email: bailiangjin@gmail.com
 * Create Time: 2016/1/6 16:03
 */
public class RBItem extends AbsSelectedItem {

    @Override
    public void setDefaultViewType() {
        setViewType(ViewType.RB);
    }
}
