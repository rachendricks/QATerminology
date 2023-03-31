package FacebookLogin;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//hello world
public class Login {

	public static void main(String[] args) throws InterruptedException {

		//set the path to the chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RachelHendricks\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//navigate to site and wait for the page to load
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


	//enter the username and password and login to the site
	//cannot include double quotes in an xpath value (i.e., 'app' vs "app", By.xpath("//*[@id='app'])
	driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button['Login']")).click();

	//get URL of the page
	String DashboardURL = driver.getCurrentUrl();

	//verify successful login
	if(DashboardURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
		System.out.println("Yay! Successful Login");
	} else {
		System.out.println("Opps! Unsuccessful Login");
	}
	
	//verify that all the links on the dashboard page work

	
	//1. "Time at Work" link verification (1 link)

	//go to time at work URL
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/attendance/punchOut");
	
	//get URL of the page
	String TimeworkedURL = driver.getCurrentUrl();

	//verify current URL
	if(TimeworkedURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/attendance/punchOut")) {
		System.out.println("Time at Work link Verified");
	} else {
		System.out.println("Time at Work link Verified is NOT VERIFIED");
	}

	
	//2. "My Actions" link verification (4 links)
	
	//Go to leave request URL
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
	
	//get URL of the page
	String LeaveRequestURL = driver.getCurrentUrl();

	//verify current URL
	if(LeaveRequestURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList")) {
		System.out.println("Leave Request link Verified");
	} else {
		System.out.println("Leave Request link Verified is NOT VERIFIED");
	}
	

	//Go to time sheets to approve URL
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");
	
	//get URL of the page
	String TimesheetapprovalURL = driver.getCurrentUrl();
			
	//verify current URL
	if(TimesheetapprovalURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet")) {
		System.out.println("Timesheet Approval link Verified");
	} else {
		System.out.println("Timesheet Approval link is NOT VERIFIED");
		}


	//Go to pending self review URL
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/performance/myPerformanceReview");
	
	//get URL of the page
	String PendingselfreviewURL = driver.getCurrentUrl();
			
	//verify current URL
	if(PendingselfreviewURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/performance/myPerformanceReview")) {
		System.out.println("Pending Self Review link Verified");
	} else {
		System.out.println("Pending Self Review link is NOT VERIFIED");
		}


	//Go to Candidate to interview URL
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates?statusId=4");
	
	//get URL of the page
	String CandidatetointerviewURL = driver.getCurrentUrl();
			
	//verify current URL
	if(CandidatetointerviewURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates?statusId=4")) {
		System.out.println("Candidate to Interview link Verified");
	} else {
		System.out.println("Candidate to Interview link is NOT VERIFIED");
		}


	//3. "Quick Launch" link verification (6 links)

	//Go to Assignee Leave URL
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/assignLeave");
	
	//get URL of the page
	String AssigneeleaveURL = driver.getCurrentUrl();
			
	//verify current URL
	if(AssigneeleaveURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/leave/assignLeave")) {
		System.out.println("Assignee Leave link Verified");
	} else {
		System.out.println("Assignee Leave link is NOT VERIFIED");
		}


	//Go to Leave list URL
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
	
	//get URL of the page
	String LeavelistURL = driver.getCurrentUrl();
			
	//verify current URL
	if(LeavelistURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList")) {
		System.out.println("Leave List link Verified");
	} else {
		System.out.println("Leave List link is NOT VERIFIED");
		}

	
	//Go to Timesheets URL
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");
	
	//get URL of the page
	String TimesheetsURL = driver.getCurrentUrl();
			
	//verify current URL
	if(TimesheetsURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet")) {
		System.out.println("Timesheets link Verified");
	} else {
		System.out.println("Timesheets link is NOT VERIFIED");
		}


	//Go to Apply Leave URL
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/applyLeave");
	
	//get URL of the page
	String ApplyLeaveURL = driver.getCurrentUrl();
			
	//verify current URL
	if(ApplyLeaveURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/leave/applyLeave")) {
		System.out.println("Apply Leave link Verified");
	} else {
		System.out.println("Apply Leave link is NOT VERIFIED");
		}

	
	//Go to My Leave URL
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewMyLeaveList");
	
	//get URL of the page
	String MyLeaveURL = driver.getCurrentUrl();
			
	//verify current URL
	if(MyLeaveURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewMyLeaveList")) {
		System.out.println("My Leave link Verified");
	} else {
		System.out.println("My Leave link is NOT VERIFIED");
		}


	//Go to My Timesheet URL
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewMyTimesheet");
	
	//get URL of the page
	String MytimesheetURL = driver.getCurrentUrl();
			
	//verify current URL
	if(MytimesheetURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewMyTimesheet")) {
		System.out.println("My Timesheet link Verified");
	} else {
		System.out.println("My Timesheet link is NOT VERIFIED");
		}

	//4. "Buzz Latest Posts" link verification (1 link)

	//Go to Buzzfeed News URL
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz");
	
	//get URL of the page
	String BuzzfeednewsURL = driver.getCurrentUrl();
			
	//verify current URL
	if(BuzzfeednewsURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz")) {
		System.out.println("Buzzfeed News link Verified");
	} else {
		System.out.println("Buzzfeed News link is NOT VERIFIED");
		}

	//5. "Employees on Leave today" link verification (1 link)

	//Go to Employees on Leave element
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
				
	
	//get URL of the page
	String EmployeesonleaveURL = driver.getCurrentUrl();
			
	
	//navigate to xpath
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[5]/div/div[1]/i")).click();

	//verify current URL
	if(EmployeesonleaveURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
		System.out.println("Employees on Leave link Verified");
	} else {
		System.out.println("Employees on Leave link is NOT VERIFIED");
		}


	}


}
	/*driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/p")).click();
	System.out.println("Leave Requests to Approve Link Verified");
	driver.navigate().back();
	*/
	/*
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/p")).click();
	System.out.println("Timesheets to Approve Link Verified");
	driver.navigate().back();
	
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[3]/p")).click();
	System.out.println("Pending Self Review Link Verified");
	driver.navigate().back();

	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[4]/p")).click();
	System.out.println("Candidate to Interview Link Verified");
	driver.navigate().back();

	
	//3. "Quick Launch" link verification (6 links)
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[1]/button")).click();
	System.out.println("Assign Leave Link Verified");
	driver.navigate().back();

	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[2]/button")).click();
	System.out.println("Leave List Link Verified");
	driver.navigate().back();
	
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[3]/button")).click();
	System.out.println("Timesheets Link Verified");
	driver.navigate().back();
	
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[4]/button")).click();
	System.out.println("Apply Leave Link Verified");
	driver.navigate().back();
	
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[5]/button")).click();
	System.out.println("My Leave Link Verified");
	driver.navigate().back();
	
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[6]/button")).click();
	System.out.println("My Timesheet Link Verified");
	driver.navigate().back();
	
	
	//4. "Buzz Latest Posts" link verification (1 link)
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[4]/div/div[2]/div/div[1]/div/div[2]/p[1]")).click();
	System.out.println("Buzz latest Post link verified");
	driver.navigate().back();

	//5. "Employees on Leave today" link verification (1 link)
	
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[5]/div/div[1]/i")).click();
	System.out.println("Employees on Leave Link Verified");
	driver.navigate().back();

*/








		

				



	

	


		


		// Prints current url that the automation script is on: System.out.println(driver.getCurrentUrl());
	//object = url
	//new instance of object = "driver.getCurrentUrl"
	//String url = new String(driver.getCurrentUrl());
//	System.out.println(url);

//String test = new String("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");



 //button[@id='app']
	