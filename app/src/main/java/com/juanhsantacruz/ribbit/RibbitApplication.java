package com.juanhsantacruz.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Juan Santa Cruz on 9/14/14.
 */
public class RibbitApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        Parse.initialize(this, "tvbG7ZZGH3a7QpW5v6iNZ8lc057bWkdksQQLjvIy",
                "bLnwPYhy0mHgnl8A4rK2Jc9qw1Z8fdQXHMj7BpeQ");

    }
}
