package com.udacity.gradle.builditbigger.backend;

import com.example.joker.JokesLib;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /**
     * A simple endpoint method that returns a Joke.
     */
    @ApiMethod(name = "tellAJoke")
    public MyJoke tellAJoke() {

        MyJoke response = new MyJoke();
        JokesLib jokesLib = new JokesLib();
        response.setData(jokesLib.getJoke());

        return response;
    }

}
