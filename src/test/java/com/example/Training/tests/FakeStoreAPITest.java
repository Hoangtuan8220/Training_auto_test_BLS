package com.example.Training.tests;

import junit.framework.TestCase;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class FakeStoreAPITest extends TestCase {
    public FakeStoreAPITest() {
        RestAssured.baseURI = "https://fakestoreapi.com";
    }

    public void testGetProducts() {
        Response response = get("/products");
        System.out.println("Response for GET /products:");
        response.then().statusCode(200).log().all();
        List<String> productList = response.jsonPath().getList("findAll { it }");
    }

    public void testGetProduct1() {
        Response response = get("/products/1");
        System.out.println("Response for GET /products/1:");
        response.then().statusCode(200).log().all();
    }

    public void testGetCategories() {
        Response response = get("/products/categories");
        System.out.println("Response for GET /products/categories:");
        response.then().statusCode(200).log().all();
    }

    public void testGetJewelryCategory() {
        Response response = get("/products/category/jewelery");
        System.out.println("Response for GET /products/category/jewelery:");
        response.then().statusCode(200).log().all();
    }

    public void testGetCartsForUserId() {
        Response response = get("/carts?userId=1");
        System.out.println("Response for GET /carts?userId=1:");
        response.then().statusCode(200).log().all();
    }

    public void testGetProductsWithLimit5() {
        Response response = get("/products?limit=5");
        System.out.println("Response for GET /products?limit=5:");
        response.then().statusCode(200).log().all();
    }

    public void testPostProduct() {
        String requestBody = "{"
                + "\"id\": 123,"
                + "\"title\": \"Test Product\","
                + "\"price\": 9.99,"
                + "\"description\": \"This is a test product\","
                + "\"category\": \"Test Category\","
                + "\"image\": \"https://example.com/test_image.jpg\""
                + "}";

        Response response = given().contentType("application/json")
                .body(requestBody)
                .post("/products");
        System.out.println("Response for POST /products:");
        response.then().statusCode(200).log().all();
    }

    public void testPutProduct1() {
        Response response = given().contentType("application/json")
                .body("{\"name\": \"Updated Product\", \"price\": 19.99}")
                .put("/products/1");
        System.out.println("Response for PUT /products/1:");
        response.then().statusCode(200).log().all();
    }

    public void testPatchProduct1() {
        Response response = given().contentType("application/json")
                .body("{\"price\": 29.99}")
                .patch("/products/1");
        System.out.println("Response for PATCH /products/1:");
        response.then().statusCode(200).log().all();
    }

    public void testDeleteProduct1() {
        Response response = delete("/products/1");
        System.out.println("Response for DELETE /products/1:");
        response.then().statusCode(200).log().all();
    }
}
