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
public class FragmentThree extends Fragment {


    public FragmentThree() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,@Nullable
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_fragment_three, container, false);
        ButterKnife.bind(this,view);
        return view;
    }
    @OnClick(R.id.text_three)
    public void three(View v){
        startActivity(new Intent(getActivity(), MainActivity.class));
        getActivity().finish();
    }

}
