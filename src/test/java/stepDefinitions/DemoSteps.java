package stepDefinitions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utility.DriverManager;

public class DemoSteps {

    private AppiumDriver driver;


    @Given("User navigates to the Health app")
    public void user_navigates_to_the_health_app() {
        driver = DriverManager.getDriver();
        // Wait for app to load
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @When("User clicks on first button")
    public void user_clicks_on_first_button() throws InterruptedException {
//        driver.findElement(By.xpath("//android.widget.Button[@resource-id='org.simple.clinic.staging:id/nextButton']")).click();

    }

    @Then("User should see the next page")
    public void user_should_see_the_next_page() throws InterruptedException {
        // Wait for next page to load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Verify next page loaded
        Thread.sleep(2000);
        driver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"org.simple.clinic.staging:id/nextButton\"]\n")).click();
        String actualSearchFind = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"org.simple.clinic.staging:id/introOneTextView\")")).getText();
//        Assertions.assertEquals("""
//                Search & find\s
//                thousands of patients\s
//                with hypertension""", actualSearchFind);
        String actualRecord = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"org.simple.clinic.staging:id/introTwoTextView\")")).getText();
//        Assertions.assertEquals("""
//                Maintain records of\s
//                blood pressures\s
//                & medicines""", actualRecord);

        String text = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"org.simple.clinic.staging:id/introOneTextView\")")).getText();
        System.out.println("Page loaded with text: " + text);

    }

    @When("User clicks on Next button")
    public void user_clicks_on_next_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"org.simple.clinic.staging:id/nextButton\"]\n")).click();
        String actualSearchFind = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"org.simple.clinic.staging:id/introOneTextView\")")).getText();
//        Assertions.assertEquals("""
//                Search & find\s
//                thousands of patients\s
//                with hypertension""", actualSearchFind);
        String actualRecord = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"org.simple.clinic.staging:id/introTwoTextView\")")).getText();
//        Assertions.assertEquals("""
//                Maintain records of\s
//                blood pressures\s
//                & medicines""", actualRecord);
    }

    @Then("Then Confirm the Start page displayed")
    public void then_confirm_the_start_page_displayed() {

    }

    @When("User clicks on GET STARTED button")
    public void user_clicks_on_get_started_button() {
        driver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"org.simple.clinic.staging:id/getStartedButton\"]\n")).click();
//        String actualTermPage = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Terms of Use\")")).getText();
////        Assertions.assertEquals("Terms of Use", actualTermPage);

    }

    @Then("Then Confirm the Licence Agreement page is displayed")
    public void then_confirm_the_licence_agreement_page_is_displayed() {

    }

    @When("User clicks the AGREE AND CONTINUE button")
    public void user_clicks_the_agree_and_continue_button() throws InterruptedException {
        driver.findElement(new By.ByXPath("//android.widget.Button\n")).click();
        Thread.sleep(1000);

    }

    @Then("Then Confirm the Select Your County page is displayed")
    public void then_confirm_the_select_your_county_page_is_displayed() {

    }

    @When("User select India radio button")
    public void user_select_india_radio_button() throws InterruptedException {
        driver.findElement(new By.ByXPath("//android.widget.RadioButton[@resource-id=\"org.simple.clinic.staging:id/countryButton\" and @text=\"India\"]")).click();
        Thread.sleep(1000);
    }

    @Then("User should see the Where is your clinic page")
    public void user_should_see_the_where_is_your_clinic_page() {

    }

    @When("User select clinic from the list")
    public void user_select_clinic_from_the_list() {
        driver.findElement(new By.ByXPath("//android.widget.RadioButton[@resource-id=\"org.simple.clinic.staging:id/stateRadioButton\" and @text=\"Goa\"]")).click();

    }

    @Then("Then Confirm the Your Phone Number page is displayed")
    public void then_confirm_the_your_phone_number_page_is_displayed() {

    }

    @When("User enter a valid new user phone number")
    public void user_enter_a_valid_new_user_phone_number() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(new By.ByXPath("//android.widget.EditText[@resource-id=\"org.simple.clinic.staging:id/phoneNumberEditText\"]")).sendKeys("0881203456");


    }

    @When("User enter a valid phone number")
    public void user_enter_a_valid_phone_number() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(new By.ByXPath("//android.widget.EditText[@resource-id=\"org.simple.clinic.staging:id/phoneNumberEditText\"]")).sendKeys("91203456");


    }

    @When("Click the NEXT button")
    public void click_the_next_button() {
        driver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"org.simple.clinic.staging:id/nextButton\"]")).click();

    }

    @Then("Then Confirm the Your role and full name page is displayed")
    public void then_confirm_the_your_role_and_full_name_page_is_displayed() {

    }
    @When("User enter a new role and full name")
    public void user_enter_a_new_role_and_full_name() {
        driver.findElement(new By.ByXPath("//android.widget.EditText[@resource-id=\"org.simple.clinic.staging:id/fullNameEditText\"]")).sendKeys("Dr. Jane Doe");
    }

    @When("User enter a valid role and full name")
    public void user_enter_a_valid_role_and_full_name() {
        driver.findElement(new By.ByXPath("//android.widget.EditText[@resource-id=\"org.simple.clinic.staging:id/fullNameEditText\"]")).sendKeys("John Doe");
    }


    @Then("Confirm the Create your security PIN page is displayed")
    public void confirm_the_create_your_security_pin_page_is_displayed() throws InterruptedException {
        driver.findElement(new By.ByXPath("//android.view.ViewGroup[@resource-id=\"org.simple.clinic.staging:id/registrationname_root\"]/android.widget.FrameLayout")).click();
        Thread.sleep(1000);

    }

    @When("User enter a valid pin")
    public void user_enter_a_valid_pin() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new By.ByXPath("//android.widget.EditText[@resource-id=\"org.simple.clinic.staging:id/pinEditText\"]")).sendKeys("1234");
        Thread.sleep(3000);
    }

    @Then("Confirm Enter security PIN again page is displayed")
    public void confirm_enter_security_pin_again_page_is_displayed() {

    }

    @When("User re-enter a valid pin")
    public void user_re_enter_a_valid_pin() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new By.ByXPath("//android.widget.EditText[@resource-id=\"org.simple.clinic.staging:id/confirmPinEditText\"]")).sendKeys("1234");


    }


    @Then("Confirm the Location access page is displayed")
    public void confirm_the_location_access_page_is_displayed() {

    }

    @When("User click the SKIP button")
    public void user_click_the_skip_button() throws InterruptedException {
        driver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"org.simple.clinic.staging:id/skipButton\"]")).click();
        Thread.sleep(1000);

    }

    @Then("Confirm the Enter facility name page is displayed")
    public void confirm_the_enter_facility_name_page_is_displayed() {

    }

    @When("User select facility")
    public void user_select_facility() throws InterruptedException {
        driver.findElement(new By.ByXPath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"org.simple.clinic.staging:id/facilityRecyclerView\"]/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout")).click();
        Thread.sleep(1000);
    }

    @When("User select YES button to confirm")
    public void user_select_yes_button_to_confirm() {
        driver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"org.simple.clinic.staging:id/yesButton\"]")).click();


    }

    @Then("Then Confirm the How to use simple App page is displayed")
    public void then_confirm_the_how_to_use_simple_app_page_is_displayed() {
        driver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"org.simple.clinic.staging:id/skipButton\"]")).click();
        driver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")).click();
        driver.findElement(new By.ByXPath("//android.widget.Button[@resource-id=\"android:id/button2\"]")).click();
    }

    @Then("Confirm the user is navigated to the facility homepage")
    public void confirm_the_user_is_navigated_to_the_facility_homepage() {

    }


}

//        //Pass elements
//        driver.findElement(new By.ByXPath("//android.widget.RadioButton[@resource-id=\"org.simple.clinic.staging:id/stateRadioButton\" and @text=\"Goa\"]")).click();
//        driver.findElement(new By.ByXPath("//android.widget.EditText[@resource-id=\"org.simple.clinic.staging:id/pinEditText\"]")).sendKeys("1234");
//        driver.findElement(new By.ByXPath("//android.widget.EditText[@resource-id=\"org.simple.clinic.staging:id/confirmPinEditText\"]")).sendKeys("1234");
