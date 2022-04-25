package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class APIHardcodedExamples {

    static String baseURI= RestAssured.baseURI="http://hrm.syntaxtechs.net/syntaxapi/api";
    String token="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2NDY4NTc4OTUsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY0NjkwMTA5NSwidXNlcklkIjoiMzY2NiJ9.dRyyWUz3AoVA1793IWEfHylG5jo5X4SUmN2dSkfhW40";



    public void postResquest(){
        RequestSpecification issueRequest=given().header("Content-Type","application/json").header("Authorization",token).body("{\n" +
                "  \"emp_firstname\": \"Paul \",\n" +
                "  \"emp_lastname\": \"Shah\",\n" +
                "  \"emp_middle_name\": \"M\",\n" +
                "  \"emp_gender\": \"M\",\n" +
                "  \"emp_birthday\": \"1985-10-23\",\n" +
                "  \"emp_status\": \"Employed\",\n" +
                "  \"emp_job_title\": \"QA manager\"\n" +
                "}");
          Response issueResponse=issueRequest.when().post("/createEmployee.php");
          issueResponse.prettyPrint();



        issueResponse.then().assertThat().statusCode(201);

    }
    @Test
    public void getEmployee(){
        RequestSpecification getEmployeeRequest =given().header("Content-Type", "application/json").header("Authorization",token).param("employee_id","28183A");
        Response getEmployeeResponse=getEmployeeRequest.when().get("/getOneEmployee.php");
        System.out.println(getEmployeeResponse.prettyPrint());
        getEmployeeResponse.then().assertThat().statusCode(200);
    }
}
