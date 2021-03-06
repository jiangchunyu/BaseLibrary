package com.kevin.building.demo.databinding;

import android.view.View;

import com.kevin.baselibrary.activity.ItemClickListener;
import com.kevin.baselibrary.utils.ToastUtils;
import com.kevin.building.R;
import com.kevin.building.base.BaseActivity;
import com.kevin.building.databinding.ActivityDataBindingBinding;
import com.kevin.building.model.TaskItemBean;

/**
 * Created by bailiangjin on 16/9/7.
 */
public class ToolbarBindingActivity extends BaseActivity<ActivityDataBindingBinding> {
    TaskItemBean itemBean;


    @Override
    protected int getLayoutResId() {
        return R.layout.activity_data_binding;
    }

    @Override
    protected void initIntentData() {

    }

    @Override
    protected void initView() {

        titleBarBuilder
                .setTitleText("测试绑定绑定绑定绑定绑定绑定绑定")
                .addSearchMenuItem(new ItemClickListener() {
                    @Override
                    public void onClick() {
                        ToastUtils.shortToast("点击了搜索");
                    }
                }).addMenuItem("添加", new ItemClickListener() {
            @Override
            public void onClick() {

            }
        }).addShareMenuItem(new ItemClickListener() {
            @Override
            public void onClick() {
                ToastUtils.shortToast("点击分享");
            }
        }).addMenuItem("测试1", R.drawable.ic_search_white, new ItemClickListener() {
            @Override
            public void onClick() {

            }
        }).addMenuItem("测试3", R.drawable.ic_search_white, new ItemClickListener() {
            @Override
            public void onClick() {

            }
        }).addMenuItem("测试4", R.drawable.ic_search_white, new ItemClickListener() {
            @Override
            public void onClick() {

                ToastUtils.shortToast("点击了测试4");
            }
        }).build();


    }

    @Override
    protected void initData() {

    }


    public void onClick_change(View v) {
        itemBean = new TaskItemBean();
        itemBean.setId("1");
        itemBean.setName("初始名");
        itemBean.setOrder(1);
        getBinding().setUser(itemBean);
        itemBean.setName("更改后的名字" + System.currentTimeMillis());
        invalidateOptionsMenu();
    }
}
