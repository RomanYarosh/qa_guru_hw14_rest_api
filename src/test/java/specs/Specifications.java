package specs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static helpers.CustomApiListener.withCustomTemplates;
import static io.restassured.filter.log.LogDetail.*;

import static tests.BaseTest.API_KEY;
import static tests.BaseTest.BASE_PATH;
import static tests.BaseTest.BASE_URL;

public class Specifications {

public static RequestSpecification requestSpec() {
    return new RequestSpecBuilder()
            .setBaseUri(BASE_URL)
            .setBasePath(BASE_PATH)
            .addHeader("x-api-key", API_KEY)
            .setContentType(ContentType.JSON)
            .addFilter(withCustomTemplates())
            .log(URI)
            .log(BODY)
            .log(HEADERS)
            .build();
}

    public static ResponseSpecification responseSpec(int status) {
        return new ResponseSpecBuilder()
                .expectStatusCode(status)
                .log(STATUS)
                .log(BODY)
                .build();
    }
}