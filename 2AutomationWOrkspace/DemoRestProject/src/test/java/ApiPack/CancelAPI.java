package ApiPack;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class CancelAPI {
    public static void main(String args[]) {

        //Authorization API

        RestAssured.baseURI = "https://3hatbykz3i.execute-api.ap-south-1.amazonaws.com/v1/orin/api/cancel";
        given().log().all()
                .header("Server","nginx/1.18.0 (Ubuntu)")
                .header("Date","Mon, 17 May 2021 07:02:39 GMT")
                .header("Content-Type","application/json")
                .header("Connectione","keep-alive")
                .header("Vary","Accept, Cookie, Origin")
                .header("Allow","POST, OPTIONS")
                .header("X-Frame-Options","DENY")
                .header("X-Content-Type-Options","nosniff")
                .header("Referrer-Policy","same-origin")
                .body("[{\n" +
                        "    \"field\": \"channel_order_id\",\n" +
                        "    \"value\": \"700\"\n" +
                        "}]")
                .when().post()
                .then().log().all()
                .assertThat().statusCode(200);
    }

}
