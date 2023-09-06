public class ApplicationOpen {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.get("https://www.bbc.co.uk/");
        WebElement signinButton = driver.findElement(By.xpath("//*[@id=\"header-content\"]/nav/div[1]/div/div[2]/ul[1]/li[1]/a"));
        //click the login button

        signinButton.click();
        //click signin
        WebElement username=driver.findElement(By.id("user-identifier-input"));

        //Enter user name
        username.sendKeys("brindhasengu@gmail.com");

        //Enter password
        WebElement password= driver.findElement(By.id("password-input"));
        password.sendKeys("Anga1234!");
        Thread.sleep(3000);

        //Click submit
        WebElement submit= driver.findElement(By.id("submit-button"));
        submit.click();

    }
}
