package com.kevin.building.ui.demo.dynamic.view.viewbean.item;

import com.kevin.building.ui.demo.dynamic.view.viewbean.base.BaseItem;
import com.kevin.building.ui.demo.dynamic.view.viewbean.constants.ViewType;

/**
 * Author:  liangjin.bai
 * Email: bailiangjin@gmail.com
 * Create Time: 2016/1/6 16:02
 */
public class BtnItem extends BaseItem {

    private int btnType;

    @Override
    public void setDefaultViewType() {
        setViewType(ViewType.BTN);
    }

    public int getBtnType() {
        return btnType;
    }

    public void setBtnType(int btnType) {
        this.btnType = btnType;
    }
}
