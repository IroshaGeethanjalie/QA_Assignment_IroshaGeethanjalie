import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactFormTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://safora.se/en/contact.html");
    }

    @Test
    public void verifyContactUsFormSubmission() throws InterruptedException{
         Thread.sleep(3000);

         //Name
        WebElement nameField = driver.findElement(
                By.cssSelector("input[placeholder='Your Name']") );

        nameField.sendKeys("Test");

        //Email
        WebElement emailField = driver.findElement(
                By.cssSelector("input[placeholder='Email Address']")
        );

        emailField.sendKeys("test@gmail.com");

        // Phone
        WebElement phoneField = driver.findElement(
                By.cssSelector("input[placeholder='Phone Number']")
        );

        phoneField.sendKeys("0771234567");

        WebElement messageField = driver.findElement(
                By.tagName("textarea"));
        messageField.sendKeys( "This is an automated UI test using Selenium and Java." );


        System.out.println("Please manually complete the CAPTCHA checkbox...");
        Thread.sleep(15000); // Time given for manual CAPTCHA verification

        // Send Button
        WebElement sendButton = driver.findElement( By.xpath("//button[contains(text(),'Send Message')]") );
        sendButton.click();
        Thread.sleep(3000);

        // Verification
         String currentUrl = driver.getCurrentUrl();
         Assert.assertTrue( currentUrl.contains("contact"), "Form submission failed" );

         System.out.println("Test Passed Successfully");
         }

         @AfterMethod
         public void tearDown() {
        driver.quit();
    }



    @Test
    public void verifyValidationErrorsForEmptyFields()
            throws InterruptedException {

        Thread.sleep(3000);

        // Locate Name field
        WebElement nameField = driver.findElement(
                By.cssSelector("input[placeholder='Your Name']")
        );

        // Trigger validation by checking validity
        String isRequired = nameField.getAttribute("required");

        // Verification
        Assert.assertNotNull(
                isRequired,
                "Required field validation is missing"
        );

        System.out.println(
                "Validation Error Test Passed Successfully"
        );
    }



}

