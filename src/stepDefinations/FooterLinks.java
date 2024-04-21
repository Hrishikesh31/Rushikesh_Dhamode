package stepDefinations;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class FooterLinks {

TestContextSetup testContextSetup;

public FooterLinks(TestContextSetup testContextSetup) {
	this.testContextSetup=testContextSetup;
}

@When("User navigate to the footer links")
public void user_navigate_to_the_footer_links() throws InterruptedException, IOException{
    
   
}
@Then("Click on all the links")
public void click_on_all_the_links()throws InterruptedException, IOException {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Open it in new tabs")
public void open_it_in_new_tabs()throws InterruptedException, IOException {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Grab the title of each page")
public void grab_the_title_of_each_page() throws InterruptedException, IOException{
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}




}


