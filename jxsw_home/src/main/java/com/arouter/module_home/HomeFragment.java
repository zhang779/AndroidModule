package com.arouter.module_home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.aroute.module_route.HomeRoutePath;
import com.arouter.baselibrary.IUserInfo;
import com.arouter.baselibrary.base.BaseFragment;

/**
 * 主页tab Home
 */
@Route(path = HomeRoutePath.HOME_FRAGMENT)
public class HomeFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home, null);
        TextView tv_text = view.findViewById(R.id.tv_text);
        String name = ARouter.getInstance().navigation(IUserInfo.class).getName();
        tv_text.setText("欢迎 " +name +"～～");
        return view;
    }
}
