package com.example.garrettmacmaolain.friendnet;

import android.app.Application;
import android.content.Intent;

import com.parse.Parse;
import com.parse.ParseFacebookUtils;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import java.text.ParseException;

//import java.text.ParseException;



public class MainActivity extends Application {

    //static final String TAG = "MyApp";

    @Override
    public void onCreate() {
        super.onCreate();
        ParseUser user = new ParseUser();
        user.setUsername("my name");
        user.setPassword("my pass");
        user.setEmail("email@example.com");

// other fields can be set just like with ParseObject
        user.put("phone", "650-555-0000");

        user.signUpInBackground(new SignUpCallback() {
            public void done(ParseException e) {
                if (e == null) {

                    private void goToActivity() {
                        Intent intent = new Intent(this, Friends.class);
                        startActivity(intent);
                    }
                    // Hooray! Let them use the app now.
                } else {
                    // Sign up didn't succeed. Look at the ParseException
                    // to figure out what went wrong
                }
            }
        });

        Parse.initialize(this, "BF13dawDLqSv8NHgeqgMdxpuzu4p4B8fxKkfs7AI", "WoArd5qOYJp8XHHJMu4RqdV6yBVjq7uY0n8CShJV");


        // Set your Facebook App Id in strings.xml
        ParseFacebookUtils.initialize(getString(R.string.facebook_app_id));
    }
}