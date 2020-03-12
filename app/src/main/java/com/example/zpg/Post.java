package com.example.zpg;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {
    public static final String KEY_DESCRPITION = "description";
    public static final String KEY_USER = "user";
    public static final String KEY_IMAGE = "image";

    public String getDescription(){
        return getString(KEY_DESCRPITION);
    }

    public void setDescription(String description){
        put(KEY_DESCRPITION, description);
    }

    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile parseFile){
        put(KEY_IMAGE, parseFile);
    }

    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user){
        put(KEY_USER, user);
    }

}
