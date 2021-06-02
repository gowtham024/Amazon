$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Flip.feature");
formatter.feature({
  "name": "checking amaxon cart  Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validating add to cart functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user open the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.user_open_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logging into page wth valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.user_logging_into_page_wth_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adding a product to cart",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.user_adding_a_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to add the prodcut to cart or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_is_able_to_add_the_prodcut_to_cart_or_not()"
});
formatter.result({
  "status": "passed"
});
});