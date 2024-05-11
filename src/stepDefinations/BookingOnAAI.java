package stepDefinations;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.java.pageObjects.BookingOnAAIPageObject;
import utils.TestContextSetup;

public class BookingOnAAI {

TestContextSetup testContextSetup;
public BookingOnAAIPageObject book;


public BookingOnAAI(TestContextSetup testContextSetup) {
	this.testContextSetup=testContextSetup;
	this.book=testContextSetup.pageObjectManager.getBookingOnAAI();
}
@Given("User should be on AirIndiaExpress website")
public void user_should_be_on_AirIndiaExpress_website()throws InterruptedException, IOException{
	book.driver.get("https://www.airindiaexpress.com/home");
}
@And("Select Source and Destination")
public void select_source_and_destination() throws InterruptedException, IOException{
    book.clickMethod(book.sourceClickReturn());
    book.sendKeysMethod(book.sourceEditReturn(), "Delhi");
    book.clickMethod(book.destinationClickReturn());
    book.sendKeysMethod(book.destinationEditReturn(), "Mumbai");
    
    List<By> result = new ArrayList<>();
    result = book.grabInList(book.sourceResultReturn());
}
@And("Select perticular date")
public void select_perticular_date()throws InterruptedException, IOException {
  
}
@When("User clicks on next button")
public void user_clicks_on_next_button()throws InterruptedException, IOException {

}
@And("Select the Flight with minimun price and continue")
public void select_the_flight_with_minimum_price_and_cintinue() throws InterruptedException, IOException{
  
}
@And ("Select basic plan in popup")
public void select_basic_plan_in_popup() throws InterruptedException, IOException {
	
}
@Then ("Fill the Guest Details")
public void fill_the_guest_details() throws InterruptedException, IOException{
	
}
@And ("Select Some addons")
public void select_some_addons() throws InterruptedException, IOException{
	
}
@And ("Select 7F Seat") 
public void select_7F_Seat()throws InterruptedException, IOException {
	
}
@And ("Continue to Payment Page")
public void continue_to_payment_page() throws InterruptedException, IOException{
	
}
@And ("Add Fake Credit Card Details")
public void add_fake_credit_card_details() throws InterruptedException, IOException {
	
}
@Then ("Check weather payment gets confirmed or not")
public void check_weather_payment_gets_confirmed_or_not() throws InterruptedException, IOException{
	
}



}


