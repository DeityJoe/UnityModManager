package io.github.xausky.bh3modmanager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.xausky.bh3modmanager.R;

/**
 * Created by xausky on 18-3-7.
 */

public class VisibilityFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.visibility_fragment, container, false);
    }

    @Override
    public int actionButtonVisibility() {
        return View.VISIBLE;
    }
}