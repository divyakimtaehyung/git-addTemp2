package ApiPack;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class AuthorizationAPI {
    public static void main(String args[]) {

        //Authorization API

        RestAssured.baseURI = "https://qx8xua0qji.execute-api.ap-south-1.amazonaws.com/v1";
        given().log().all()
                .header("Date","Mon, 17 May 2021 07:03:49 GMT")
                .header("x-amzn-RequestId","52e3e4a6-6b81-4bcf-9f25-e69f7c170ed9")
                .header("x-amz-apigw-id","fdhDTEvEBcwFqZg=")
                .header("X-Amzn-Trace-Id","Root=1-60a21548-3f861f0c428ec9f069b68ee8")
                .header("X-Cache","Miss from cloudfront")
                .header("Via","1.1 b36ddec370f7850b1ba9df083d7c920a.cloudfront.net (CloudFront)")
                .header("X-Amz-Cf-Pop","DEL54-C4")
                .header("X-Amz-Cf-Id","QLm3JkaKSwu642hl2qgd_vMN2CqPCFJWIQ7_5OXG8DEyW9Fh5QAfaQ==")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"username\":\"gaurav\",\n" +
                        "    \"password\":\"password\"\n" +
                        "}")
                .when().post()
                .then().log().all()
                .assertThat().statusCode(200);
    }

}
