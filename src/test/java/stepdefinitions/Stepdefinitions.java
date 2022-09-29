package stepdefinitions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitions {
	public static WebDriver driver;
	@Given("^Launch Application using valid URL$")
	public void launch_Application_using_valid_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://staging.x0pa.ai/app/roboroy");  
        driver.findElement(By.id("hs-eu-confirmation-button")).click();
        driver.findElement(By.linkText("Candidate Login")).click();      
	}

	@When("^User enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("paul@trainingqa.com");
		driver.findElement(By.name("password")).sendKeys("XPAStag0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='mb-2']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(4000);   
	}
	@Given("^Click on Logout Button$")
	public void click_on_Logout_Button() throws Throwable {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label='Logout']")).click();
		Thread.sleep(4000);  
	}

	/*@Given("^after Login Click on Logout Button$")
	public void after_Login_Click_on_Logout_Button() throws Throwable {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label='Logout']")).click();
		Thread.sleep(4000);  
	}*/
	@Given("^Close Browser$")
	public void close_Browser() throws Throwable {
	    driver.close();
	}
	@When("^User clicks on Jobs Menu$")
	public void user_clicks_on_Jobs_Menu() throws Throwable {
    Thread.sleep(4000);	
	driver.findElement(By.xpath("/html/body/section/div[1]/div/header/nav/ul/li[2]/a")).click();
	}

@Given("^Recruiter clicks on Jobs Menu$")
public void recruiter_clicks_on_Jobs_Menu() throws Throwable {
	Thread.sleep(2000);	
	driver.findElement(By.xpath("/html/body/section/div[1]/div/header/nav/ul/li[2]/a")).click();   
}
	
	@Then("^select create new job section$")
	public void select_create_new_job_section() throws Throwable {
	   
	
	 driver.findElement(By.linkText("Create New Job")).click();
	 Thread.sleep(2000); 
	}

@When("^click on Start button of form$")
public void click_on_Start_button_of_form() throws Throwable {
	driver.findElement(By.xpath("//div[@class='mt-3']//child::button[contains(text(),'Start')]")).click(); 
	Thread.sleep(3000);
}

@When("^click on Add New Office button to add new office Address$")
public void click_on_Add_New_Office_button_to_add_new_office_Address() throws Throwable {
	 WebElement addnewoffice=driver.findElement(By.xpath("//button[contains(text(),'Add New office')]"));
	    addnewoffice.click();
		driver.findElement(By.id("addressLine1")).sendKeys("peaceful city");
		Thread.sleep(2000);
		WebElement city=driver.findElement(By.id("react-select-12-input"));
		city.sendKeys("Hyderabad");
		Thread.sleep(3000);
		city.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		city.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Select country=new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='app-container']/div[1]/div/div[3]/div/section/div/div/div[4]/div/div[3]/button[2]")).click();
	
}

@When("^add Job Title$")
public void add_Job_Title() throws Throwable {
	WebElement jobtitle=driver.findElement(By.xpath("//input[@placeholder='Job Title']"));
	jobtitle.sendKeys("Java Developers");
	Thread.sleep(2000);  
}

@When("^select Job Status$")
public void select_Job_Status() throws Throwable {
	WebElement jobstatus=driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
	jobstatus.sendKeys("Both");
	jobstatus.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	jobstatus.sendKeys(Keys.ENTER);
	Thread.sleep(2000); 
}

@When("^Select Country Location$")
public void select_Country_Location() throws Throwable {
	WebElement countrylocation=driver.findElement(By.xpath("//input[@id='react-select-5-input']"));
	countrylocation.sendKeys("india");
	countrylocation.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	countrylocation.sendKeys(Keys.ENTER);
	Thread.sleep(2000);  
}

@When("^Select City location$")
public void select_City_location() throws Throwable {
	WebElement citylocation=driver.findElement(By.id("react-select-6-input"));
	citylocation.sendKeys("Hyderabad");
	citylocation.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(5000);
	citylocation.sendKeys(Keys.ENTER);
	Thread.sleep(3000);  
}

@When("^add skills$")
public void add_skills() throws Throwable {
	WebElement skills=driver.findElement(By.id("react-select-7-input"));
	skills.sendKeys("java");
	skills.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	skills.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	skills.sendKeys("sql");
	skills.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	skills.sendKeys(Keys.ENTER);
	Thread.sleep(4000);
}

@When("^add Qualification$")
public void add_Qualification() throws Throwable {
	 WebElement qualification=driver.findElement(By.xpath("//input[@id='react-select-8-input']"));
     qualification.sendKeys("b");
     qualification.sendKeys(Keys.ARROW_DOWN);
     Thread.sleep(2000);
     qualification.sendKeys(Keys.ENTER);
     Thread.sleep(2000);   
}

@When("^add job type$")
public void add_job_type() throws Throwable {
	WebElement jobtype=driver.findElement(By.xpath("//input[@id='react-select-9-input']"));
	jobtype.sendKeys("per");
    jobtype.sendKeys(Keys.ARROW_DOWN);
    Thread.sleep(2000);
    jobtype.sendKeys(Keys.ENTER);
    Thread.sleep(2000);  
}

@When("^select minimum experience$")
public void select_minimum_experience() throws Throwable {
	driver.findElement(By.xpath("//input[@id='minExp']")).sendKeys("3");;
	Thread.sleep(2000); 
}

@When("^select maximum experience$")
public void select_maximum_experience() throws Throwable {
	driver.findElement(By.id("maxExp")).sendKeys("5");
	Thread.sleep(2000);  
}

@When("^choose Employment type$")
public void choose_Employment_type() throws Throwable {
	WebElement emptype=driver.findElement(By.xpath("//input[@id='react-select-10-input']"));
	emptype.sendKeys("full time");
	emptype.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	emptype.sendKeys(Keys.ENTER);
	Thread.sleep(2000);   
}

@When("^add no of vacancies$")
public void add_no_of_vacancies() throws Throwable {
	WebElement vacancies=driver.findElement(By.xpath("//input[@id='noOfVacancies']"));
	vacancies.click();
	Thread.sleep(2000);
	vacancies.sendKeys("15");
	Thread.sleep(2000);  
}

@When("^add Job Description$")
public void add_Job_Description() throws Throwable {
	driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("writing test cases,Exploratory Testing,Automation Testing");
	Thread.sleep(2000);  
}

@When("^add Job Requirements$")
public void add_Job_Requirements() throws Throwable {
	driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("candidates should join immediately & candidates should have knowledge on selenium and core java");
	Thread.sleep(2000);  
	driver.findElement(By.xpath("//div[@class='ml-2']//child::button[contains(text(),'Submit')]")).click();    
}

@When("^choose office location$")
public void choose_office_location() throws Throwable {
	 WebElement OfficeAddress=driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
	    OfficeAddress.sendKeys("Hyderabad");
	    Thread.sleep(2000);
		OfficeAddress.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		OfficeAddress.sendKeys(Keys.ENTER);
		Thread.sleep(2000);  
		  
}
@Given("^click on submit button of job$")
public void click_on_submit_button_of_job() throws Throwable {
  

   driver.findElement(By.xpath("//div[@class='ml-2']//child::button[contains(text(),'Submit')]")).click();    
}
@Given("^add skills and Education$")
public void add_skills_and_Education() throws Throwable {
  

	 driver.findElement(By.xpath("(//li[@class='sui-single-option-facet__item inactive'])[1]")).click();
}

@When("^add industry field$")
public void add_industry_field() throws Throwable {
	WebElement industry=driver.findElement(By.xpath("//input[@id='react-select-13-input']"));
    industry.sendKeys("Computer Software");
    Thread.sleep(2000);
	industry.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	industry.sendKeys(Keys.ENTER);
	Thread.sleep(2000);   
}

@When("^add keyword field$")
public void add_keyword_field() throws Throwable {
	WebElement keyword =driver.findElement(By.xpath("//input[@id='react-select-14-input']"));
    keyword.sendKeys("java");
	keyword.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	keyword.sendKeys(Keys.ENTER);
	Thread.sleep(2000);   
}

@When("^add Education$")
public void add_Education() throws Throwable {
   

	WebElement education=driver.findElement(By.xpath("//input[@id='react-select-15-input']"));
	education.sendKeys("bsc");
	education.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	education.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='sui-single-option-facet__link active']")).click(); 
}

@Given("^click on Additional Information$")
public void click_on_Additional_Information() throws Throwable {
   

	 driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div/section/div/div/div[2]/div[3]/div[2]/div/div[1]/div/div/div/div/ul/li[3]/a")).click();  
}

@When("^add Work Location$")
public void add_Work_Location() throws Throwable {
	driver.findElement(By.xpath("//textarea[@id='workLocation']")).sendKeys("Hyderabad");  
}

@Then("^add working Hours$")
public void add_working_Hours() throws Throwable {
	 driver.findElement(By.xpath("//textarea[@name='workHours']")).sendKeys("8hrs");  
}

@Then("^enter minimal Annual Salary$")
public void enter_minimal_Annual_Salary() throws Throwable {
	  driver.findElement(By.xpath("//input[@id='minSalary']")).sendKeys("30,000");  
}

@Then("^enter maximum Annual Salary$")
public void enter_maximum_Annual_Salary() throws Throwable {
	driver.findElement(By.xpath("//input[@id='maxSalary']")).sendKeys("1,00,000");   
}


@Given("^add pre screening questions$")
public void add_pre_screening_questions() throws Throwable {
   


	driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div/section/div/div/div[2]/div[3]/div[2]/div/div[1]/div/div/div/div/ul/li[4]/a")).click();
	} 


@When("^click on Add Question button$")
public void click_on_Add_Question_button() throws Throwable {
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[contains(text(),'Select Questions')]")).click();  
}

@When("^enter Question$")
public void enter_Question() throws Throwable {
	Thread.sleep(2000);
	 driver.findElement(By.xpath("(//button[contains(text(),'Add')])[1]")).click();
	   driver.findElement(By.xpath("//textarea[@name='question']")).sendKeys("done any course?");
}

@When("^choose the Category of Question$")
public void choose_the_Category_of_Question() throws Throwable {
	WebElement category=driver.findElement(By.xpath("//input[@id='react-select-17-input']"));
	   category.sendKeys("hr");
	   Thread.sleep(2000);
	   category.sendKeys(Keys.ARROW_DOWN);
	   Thread.sleep(2000);
	   category.sendKeys(Keys.ENTER);
	   Thread.sleep(2000); 
}
@Then("^click on Submit Button$")
public void click_on_Submit_Button() throws Throwable {
   

   driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]")).click();
	   Thread.sleep(2000);
}
@When("^Select questions from displayed List$")
public void select_questions_from_displayed_List() throws Throwable {
	Thread.sleep(3000);
  driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div/section/div/div/div[2]/div[3]/div[2]/div/div[2]/div[2]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/table/thead/tr/th[1]/label")).click();
}

@When("^click on Add Selected option$")
public void click_on_Add_Selected_option() throws Throwable {
	driver.findElement(By.xpath("(//button[@class='bx--btn bx--btn--primary'])[2]")).click(); 
}


@Then("^Select questions from Questions List$")
public void select_questions_from_Questions_List() throws Throwable {
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div/section/div/div/div[4]/div[2]/div[2]/div[2]/div/table/tbody/tr[2]/td/div[3]/div/div[2]/div/div[4]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/table/thead/tr/th[1]/label")).click();
	 
}


@Then("^click on Add Selected$")
public void click_on_Add_Selected() throws Throwable {
       Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[contains(text(),'Add Selected')]")).click();
	   		//button[@class='bx--btn bx--btn--primary'])[5]")).click();
	   		//button[contains(text(),'Submit')])[1]")).click();
	   		//button[contains(text(),'Add Selected')]")).click();
	   Thread.sleep(2000); 
}
@Given("^Click on Attachments section$")
public void click_on_Attachments_section() throws Throwable {
   driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div/section/div/div/div[2]/div[3]/div[2]/div/div[1]/div/div/div/div/ul/li[5]/a")).click();
   driver.findElement(By.xpath("//div[@class='bx--file__drop-container']")).click();

}
@When("^choose candidates from other countries$")
public void choose_candidates_from_other_countries() throws Throwable {
  driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[3]")).click();
}

@When("^enable rank and file job$")
public void enable_rank_and_file_job() throws Throwable {
	driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[4]")).click(); 
}

@When("^enable if job requires approvals$")
public void enable_if_job_requires_approvals() throws Throwable {
	driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[5]")).click(); 
}
@When("^add choose Approval for$")
public void add_choose_Approval_for() throws Throwable {
	WebElement approvalfor=driver.findElement(By.xpath("//input[@id='react-select-13-input']"));
	Thread.sleep(2000);
	approvalfor.sendKeys(Keys.ARROW_DOWN);
	   Thread.sleep(2000);
	   approvalfor.sendKeys(Keys.ENTER);
	   Thread.sleep(2000); 
}
@Given("^Enable collaborator control$")
public void enable_collaborator_control() throws Throwable {
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id='app-container']/div[1]/div/div[3]/div/section/div/div/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/label/span")).click();
}
@Given("^user clicks on Add Collaborator option$")
public void user_clicks_on_Add_Collaborator_option() throws Throwable {
	driver.findElement(By.xpath("(//button[contains(text(),'Add Collaborator')])[2]")).click(); 
	Thread.sleep(2000);
	Select Collabrole=new Select(driver.findElement(By.xpath("//select[@name='selectedRoleId']")));
	Collabrole.selectByVisibleText("Team Member");
	Thread.sleep(2000);
	WebElement collaborator=driver.findElement(By.xpath("//div[contains(text(),'Select User')]"));
	collaborator.sendKeys("Sai Charan");
	Thread.sleep(2000);
	collaborator.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	collaborator.sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//button[contains(text(),'Add')])[3]")).click(); 
}

@Given("^enable prescreening settings$")
public void enable_prescreening_settings() throws Throwable {
	Thread.sleep(3000);
   driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[2]")).click();
   }
@When("^ask pre screening questions via chatbot$")
public void ask_pre_screening_questions_via_chatbot() throws Throwable {
	Thread.sleep(3000);
 driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[3]")).click();  
}

@When("^enable submit only if candidate answers knockout Questions$")
public void enable_submit_only_if_candidate_answers_knockout_Questions() throws Throwable {
	Thread.sleep(3000);
	 driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[4]")).click();  
}

@When("^save pre screening Settings$")
public void save_pre_screening_Settings() throws Throwable {
	Thread.sleep(3000);
	 driver.findElement(By.xpath("(//button[@class='bx--btn bx--btn--primary'])[5]")).click();  
}
@Given("^user Enables Autoshortlist button$")
public void user_Enables_Autoshortlist_button() throws Throwable {
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[5]")).click(); 
}
@When("^user gives passing points$")
public void user_gives_passing_points() throws Throwable {
   driver.findElement(By.xpath("//input[@id='passingPoints']")).sendKeys("0");
}


@Then("^Save Autoshortlist settings$")
public void save_Autoshortlist_settings() throws Throwable {
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[@class='bx--btn bx--btn--primary'])[6]")).click();  
}

@Given("^user enable interview setup button$")
public void user_enable_interview_setup_button() throws Throwable {
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[6]")).click();  
}

@When("^user click on add interview stage$")
public void user_click_on_add_interview_stage() throws Throwable {
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[@class='bx--btn bx--btn--primary'])[7]")).click(); 
}
@When("^Choose interview Stage$")
public void choose_interview_Stage() throws Throwable {
 Thread.sleep(2000);
 driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[3]")).click();  
}

@When("^choose interview type$")
public void choose_interview_type() throws Throwable {
  Select interviewtype=new Select(driver.findElement(By.xpath("//select[@id='workflowStage']"))); 
  interviewtype.selectByVisibleText("Phone Interview");
  Thread.sleep(2000);
}

@When("^submit interview setup$")
public void submit_interview_setup() throws Throwable {
	driver.findElement(By.xpath("(//button[@class='bx--btn bx--btn--primary'])[9]")).click();
	Thread.sleep(4000);
}
@When("^upload Attachment file$")
public void upload_Attachment_file() throws Throwable {
	
	Thread.sleep(2000);
	Robot rb = new Robot();
	 
    StringSelection str = new StringSelection("C:\\Users\\paul\\Desktop\\X0PAAI\\AI_AUTOMATION\\Docfiles\\jd.docx");
    Thread.sleep(2000);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     rb.keyPress(KeyEvent.VK_CONTROL);
     rb.keyPress(KeyEvent.VK_V);
     rb.keyRelease(KeyEvent.VK_CONTROL);
     rb.keyRelease(KeyEvent.VK_V);
     rb.keyPress(KeyEvent.VK_ENTER);
     rb.keyRelease(KeyEvent.VK_ENTER);
}
@When("^click on submit after uploading file$")
public void click_on_submit_after_uploading_file() throws Throwable {
 Thread.sleep(2000);
 driver.findElement(By.xpath("(//button[@class='bx--btn bx--btn--primary'])[1]")).click();
}
}
