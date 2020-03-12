package com.example.zpg;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("zarsla-parstagram") // should correspond to APP_ID env variable
                .clientKey("ZarslaParserEpic")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://zarsla-parstagram.herokuapp.com/parse/").build());
    }
}
