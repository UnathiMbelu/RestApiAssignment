package RestApiAssignment.RestApiAssignment;

import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;


public class Doggie {
	
	
	public static RequestSpecification request;
	io.restassured.response.Response response;

	@Test
	@Given("^running Api$")
	public void running_Api() throws Throwable {
		
		 request = given().log().all().baseUri("https://dog.ceo");

	}
	@Test
	@When("^sending get http  request$")
	public void sending_get_http_request_all()  {
		
		response = request.get("/api/breeds/image/random").then().extract().response();
		String jsonBody = "{\r\n" + 
				"    \"message\": \"https://images.dog.ceo/breeds/retriever-flatcoated/n02099267_353.jpg\",\r\n" + 
				"    \"status\": \"success\"\r\n" + 
				"}";
		System.out.println(jsonBody);
		
	}
	@Test
	@Then("^success message must be retured$")
	public void success_message_must_be_retured()  {
		
		String json = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(json);
		String statusData = jsonPath.getJsonObject("status");
		Assert.assertEquals(statusData, "success");

	}
	@Test
	@When("^sending  get http  request$")
	public void sending_get_http_request_bulldog() {
		
		response = request.get("/api/breeds/list?dog=bulldog").then().extract().response();
		String jsonBody2="{\r\n" + 
				"    \"message\": [\r\n" + 
				"        \"affenpinscher\",\r\n" + 
				"        \"african\",\r\n" + 
				"        \"airedale\",\r\n" + 
				"        \"akita\",\r\n" + 
				"        \"appenzeller\",\r\n" + 
				"        \"australian\",\r\n" + 
				"        \"basenji\",\r\n" + 
				"        \"beagle\",\r\n" + 
				"        \"bluetick\",\r\n" + 
				"        \"borzoi\",\r\n" + 
				"        \"bouvier\",\r\n" + 
				"        \"boxer\",\r\n" + 
				"        \"brabancon\",\r\n" + 
				"        \"briard\",\r\n" + 
				"        \"buhund\",\r\n" + 
				"        \"bulldog\",\r\n" + 
				"        \"bullterrier\",\r\n" + 
				"        \"cairn\",\r\n" + 
				"        \"cattledog\",\r\n" + 
				"        \"chihuahua\",\r\n" + 
				"        \"chow\",\r\n" + 
				"        \"clumber\",\r\n" + 
				"        \"cockapoo\",\r\n" + 
				"        \"collie\",\r\n" + 
				"        \"coonhound\",\r\n" + 
				"        \"corgi\",\r\n" + 
				"        \"cotondetulear\",\r\n" + 
				"        \"dachshund\",\r\n" + 
				"        \"dalmatian\",\r\n" + 
				"        \"dane\",\r\n" + 
				"        \"deerhound\",\r\n" + 
				"        \"dhole\",\r\n" + 
				"        \"dingo\",\r\n" + 
				"        \"doberman\",\r\n" + 
				"        \"elkhound\",\r\n" + 
				"        \"entlebucher\",\r\n" + 
				"        \"eskimo\",\r\n" + 
				"        \"finnish\",\r\n" + 
				"        \"frise\",\r\n" + 
				"        \"germanshepherd\",\r\n" + 
				"        \"greyhound\",\r\n" + 
				"        \"groenendael\",\r\n" + 
				"        \"havanese\",\r\n" + 
				"        \"hound\",\r\n" + 
				"        \"husky\",\r\n" + 
				"        \"keeshond\",\r\n" + 
				"        \"kelpie\",\r\n" + 
				"        \"komondor\",\r\n" + 
				"        \"kuvasz\",\r\n" + 
				"        \"labrador\",\r\n" + 
				"        \"leonberg\",\r\n" + 
				"        \"lhasa\",\r\n" + 
				"        \"malamute\",\r\n" + 
				"        \"malinois\",\r\n" + 
				"        \"maltese\",\r\n" + 
				"        \"mastiff\",\r\n" + 
				"        \"mexicanhairless\",\r\n" + 
				"        \"mix\",\r\n" + 
				"        \"mountain\",\r\n" + 
				"        \"newfoundland\",\r\n" + 
				"        \"otterhound\",\r\n" + 
				"        \"ovcharka\",\r\n" + 
				"        \"papillon\",\r\n" + 
				"        \"pekinese\",\r\n" + 
				"        \"pembroke\",\r\n" + 
				"        \"pinscher\",\r\n" + 
				"        \"pitbull\",\r\n" + 
				"        \"pointer\",\r\n" + 
				"        \"pomeranian\",\r\n" + 
				"        \"poodle\",\r\n" + 
				"        \"pug\",\r\n" + 
				"        \"puggle\",\r\n" + 
				"        \"pyrenees\",\r\n" + 
				"        \"redbone\",\r\n" + 
				"        \"retriever\",\r\n" + 
				"        \"ridgeback\",\r\n" + 
				"        \"rottweiler\",\r\n" + 
				"        \"saluki\",\r\n" + 
				"        \"samoyed\",\r\n" + 
				"        \"schipperke\",\r\n" + 
				"        \"schnauzer\",\r\n" + 
				"        \"setter\",\r\n" + 
				"        \"sheepdog\",\r\n" + 
				"        \"shiba\",\r\n" + 
				"        \"shihtzu\",\r\n" + 
				"        \"spaniel\",\r\n" + 
				"        \"springer\",\r\n" + 
				"        \"stbernard\",\r\n" + 
				"        \"terrier\",\r\n" + 
				"        \"vizsla\",\r\n" + 
				"        \"waterdog\",\r\n" + 
				"        \"weimaraner\",\r\n" + 
				"        \"whippet\",\r\n" + 
				"        \"wolfhound\"\r\n" + 
				"    ],\r\n" + 
				"    \"status\": \"success\"\r\n" + 
				"}";
		System.out.println(jsonBody2);

	}
	@Test
	@Then("^success message must be retured with status code$")
	public void success_message_must_be_retured_with_status_code()  {
		String json2 = response.getBody().asString();
		JsonPath jsonPath2 = new JsonPath(json2);
		String statusData = jsonPath2.getJsonObject("status");
		Assert.assertEquals(statusData, "success");

	}
	@Test
	@When("^sending get  http  request$")
	public void sending_get_http_request()  {
		response = request.get("/api/breed/bulldog/images/?dog=bulldog").then().extract().response();
		String jsonBody3 = "{\r\n" + 
				"    \"message\": [\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_10380.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_10452.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_10596.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_10604.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1069.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_10734.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_10768.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_10823.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_10846.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_11180.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_11417.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_11427.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1143.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_11476.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_11614.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1172.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_11731.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_11776.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1179.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_11808.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_11817.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_11836.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1207.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_12168.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_12352.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_12362.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_12372.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_12374.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_12464.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_12485.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1260.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_12716.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_12776.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1281.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_12825.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_12844.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_12880.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1295.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1307.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1311.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1313.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1347.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1403.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1439.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1449.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_145.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1450.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1525.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1532.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1559.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1562.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1568.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1571.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1572.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1583.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1586.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1624.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1645.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1668.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_169.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1692.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1737.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1753.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1756.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1761.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1775.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1856.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_19.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1924.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1947.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1952.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1963.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1970.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1976.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_1992.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2008.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2042.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2082.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2098.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_210.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2108.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2177.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2180.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2260.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2354.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_237.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2374.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2379.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2394.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2419.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2431.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2450.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2493.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2513.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2560.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2583.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2671.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2696.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2725.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2727.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2800.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2809.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2821.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2828.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2900.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_2947.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_296.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_3105.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_311.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_318.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_32.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_341.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_342.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_353.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_3681.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_3697.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_3738.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_3861.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_4103.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_4136.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_414.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_4321.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_4418.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_4451.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_4534.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_454.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_4575.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_4662.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_4774.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_4983.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_5043.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_507.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_5104.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_5171.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_5260.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_554.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_5599.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_5855.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_5943.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_5980.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_6028.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_6238.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_6367.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_6567.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_657.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_664.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_6653.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_670.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_6766.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_6855.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_6874.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_6940.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_7101.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_7314.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_7542.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_772.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_7859.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_7887.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_7933.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_8065.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_8120.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_8148.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_8203.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_8323.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_8396.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_865.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_8971.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_904.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_9122.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_9153.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_9343.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_942.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_9511.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_9534.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_956.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_9681.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_9725.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_976.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_9834.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_9909.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_9912.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-boston/n02096585_994.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-english/bunz.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-english/jager-1.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-english/jager-2.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/IMG_0846.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/IMG_1657.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_10204.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_10564.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_110.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1114.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1119.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_11207.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_11220.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_11327.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_11335.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1137.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_11498.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_11550.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_11653.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1188.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_12139.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_12288.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_12317.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_12319.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_12460.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_12618.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_12904.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1343.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_142.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1465.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1513.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_160.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1612.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1752.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1788.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1839.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1866.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1871.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1895.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1911.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_1958.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_198.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2118.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2166.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_225.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2279.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2307.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2312.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2326.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2380.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2391.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2514.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2545.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2570.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2603.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2681.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2756.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2807.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2835.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2899.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2926.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2946.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_2980.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3083.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3098.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3104.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_311.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3129.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3140.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3153.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3184.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3202.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3219.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3258.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3266.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_328.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3300.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3346.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3369.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3382.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3398.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_341.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3464.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_350.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3520.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3527.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3544.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3557.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3575.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3640.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3665.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3702.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3766.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_38.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3880.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3913.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_3988.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4066.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4133.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4160.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4176.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4193.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4214.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4303.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4372.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4474.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4477.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4500.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4603.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4731.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4776.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_481.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4860.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4901.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_4991.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_5087.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_5096.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_5201.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_5306.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_5319.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_5337.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_5367.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_5458.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_553.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_5596.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_5667.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_5669.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_57.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_571.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_5813.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_6008.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_6142.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_618.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_623.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_6270.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_644.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_6462.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_6521.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_653.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_656.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_696.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_7115.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_716.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_720.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_7266.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_759.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_7608.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_7806.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_7883.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_8258.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_8425.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_8604.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_8696.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_8923.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_895.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_9125.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_9202.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_9399.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_9457.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_9530.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_9666.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_971.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_977.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_9804.jpg\",\r\n" + 
				"        \"https://images.dog.ceo/breeds/bulldog-french/n02108915_9899.jpg\"\r\n" + 
				"    ],\r\n" + 
				"    \"status\": \"success\"\r\n" + 
				"}";
		System.out.println(jsonBody3);

	}
	@Test
	@Then("^success message must be retured with status$")
	public void success_message_must_be_retured_with_status() 
	{
		String json3 = response.getBody().asString();
		JsonPath jsonPath3 = new JsonPath(json3);
		String statusData = jsonPath3.getJsonObject("status");
		Assert.assertEquals(statusData, "success");

	}


}






