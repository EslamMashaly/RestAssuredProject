# RestAssured project for testing Trello's APIs.

I used RestAssured with Java, Maven, TestNG, POJO
and generated ExtentReport

## I tested this E2E scenario:
* Creating a Board
* Updating a Board
* Creating a list
* Creating a Card
* Uploading an Attachment
* Deleting a Board


## To try this test in your environment please check the following steps:
___
* Firstly, make sure Trello's website is working in your environment.
  [Trello](https://api.trello.com)
* Make an account on Trello.
* Generate your token and key from trello [here](https://trello.com/app-key) and give them to RequestSpecBuilder in BaseTest. (src/test/java/base/BaseTest.java)



Thanks