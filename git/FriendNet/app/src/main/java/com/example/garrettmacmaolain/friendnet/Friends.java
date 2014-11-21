package com.example.garrettmacmaolain.friendnet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.parse.ParseFacebookUtils;

public class Friends extends Fragment {
    static final String TAG = "MyApp";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View friends = inflater.inflate(com.example.garrettmacmaolain.friendnet.R.layout.friend_fragment, container, false);
        ((TextView) friends.findViewById(com.example.garrettmacmaolain.friendnet.R.id.textView)).setText("Friends");
        return friends;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ParseFacebookUtils.finishAuthentication(requestCode, resultCode, data);
    }

}