package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class APITest extends BaseApiTest {

    String API_key = "91ea5a78c3beb41486275dcb1e1fb2c1";

    private Map<String, Object> reqBody = new HashMap<>();

    @BeforeEach
    public void setReqBody(){
    Map<String, Object> methodProperties = new HashMap<>();
    methodProperties.put("Limit","5");

    reqBody.put("apiKey", API_key);
    reqBody.put("modelName", "Address");
    reqBody.put("calledMethod", "getSettlements");
    reqBody.put("methodProperties", methodProperties);
}

    @Test
    public void checkThatSuccess(){
        given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body("success", equalTo(true));
    }

    @Test
    public void checkJasonSchema(){
        given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body(matchesJsonSchema(new File(System.getProperty("user.dir")+
                        "\\src\\main\\resources\\scratch.json")));
    }

    @Test
    public void checkRegions(){
        given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body("data[0].Description", equalTo("Абазівка"))
                .body("data[0].RegionsDescription", equalTo("Полтавський р-н"))
                .body("data[0].AreaDescription", equalTo("Полтавська область"));
    }

    @Test
    public void checkWordRegionIsPresent() {
        List<Address> addressList = given()
                .spec(requestSpecification)
                .when()
                .contentType(ContentType.JSON).when().body(this.reqBody)
                .post()
                .then().log().all()
                .extract()
                .body().jsonPath().getList("data", Address.class);

        System.out.println(addressList);
        addressList.forEach(el -> Assertions.assertTrue(el.getAreaDescriptionRu().contains("область")));
    }
}
