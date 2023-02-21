package trello.base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import static io.restassured.RestAssured.given;

public class BaseTest {
    protected static RequestSpecification requestSpec;
    protected static String boardID;


    @BeforeClass
    public static void createRequestSpecifications(){
        requestSpec=new RequestSpecBuilder()
                .setBaseUri("https://api.trello.com")
                .addQueryParam("token","Your token")
                .addQueryParam("key","Your key")
                .addHeader("Content-Type","application/json")
                .build();
    }
   @AfterClass
    public static void deleteBoard(){
        given().spec(requestSpec)
                .pathParam("id", boardID)
                .body("")
                .when().delete("1/boards/{id}");

    }
    @DataProvider(name="BoardField")
    public Object [][] getData(){
        return new Object[][]{
                {"idMemberCreator"},
                {"idOrganization"},
                {"desc"},
                {"name"}
        };
    }

}
