package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    public static final String BASE_URL = "https://reqres.in";
    public static final String BASE_PATH = "/api";
    public static final String API_KEY = "reqres_a37e4386c6fa47fbb39791e6a1d6f4bc";

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = BASE_URL;
        RestAssured.basePath = BASE_PATH;

    }
}
