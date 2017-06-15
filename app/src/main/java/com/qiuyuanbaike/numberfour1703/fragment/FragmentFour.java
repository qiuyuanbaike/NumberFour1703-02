package com.qiuyuanbaike.numberfour1703.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qiuyuanbaike.numberfour1703.R;
import com.qiuyuanbaike.numberfour1703.ui.MainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFour extends Fragment {


    public FragmentFour() {
        // Required empty public constructor
    }

@Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable
                             Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.fragment_fragment_four, container, false);
    ButterKnife.bind(this,view);
        return view;
    }
    @OnClick(R.id.button_four)
    public void two(View v){
        startActivity(new Intent(getActivity(), MainActivity.class));
        getActivity().finish();
    }

}
