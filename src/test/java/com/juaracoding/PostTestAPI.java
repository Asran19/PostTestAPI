package com.juaracoding;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostTestAPI {

    String endpointSatu = "https://api.themoviedb.org/3/movie/now_playing";


    @Test
    public  void testStatusCode(){
        Response response = RestAssured.get(endpointSatu);
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(),200);
    }

}
