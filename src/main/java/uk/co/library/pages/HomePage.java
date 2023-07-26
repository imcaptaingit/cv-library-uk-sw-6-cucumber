package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath="//input[@id='keywords']")
    WebElement enterJobTitle;
    @CacheLookup
    @FindBy(xpath="//input[@id='location']")
    WebElement enterLocation;
    @CacheLookup
    @FindBy(xpath="//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath="//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath="//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath="//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath="//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath="//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath="//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void enterJobTitle(String jobTitle)
    {
        //enter job title 'jobTitle'
        sendTextToElement(enterJobTitle,jobTitle);
        log.info("enter the job title"+ enterJobTitle.toString());
    }
    public void enterLocation(String location)
    {
        //enter Location 'location'
        sendTextToElement(enterLocation,location);
        log.info("enter location"+ enterLocation.toString());
    }
    public void selectDistance(String distance)
    {
        //select distance 'distance'
        selectByValueFromDropDown(distanceDropDown,distance);
        log.info("select distance"+ distanceDropDown.toString());
    }
    public void clickOnMoreSearchOptionLink()
    {
        //click on moreSearchOptionsLink
        clickOnElement(moreSearchOptionsLink);
        log.info("click on search option"+ moreSearchOptionsLink.toString());
    }
    public void enterMinSalary(String minSalary)
    {
        //enter salaryMin 'salaryMin'
        sendTextToElement(salaryMin,minSalary);
        log.info("enter minimum salary"+ salaryMin.toString());
    }
    public void enterMaxSalary(String maxSalary)
    {
        //enter salaryMax 'salaryMax'
        sendTextToElement(salaryMax,maxSalary);
        log.info("enter maximum salary"+ salaryMax.toString());
    }
    public void selectSalaryType(String sType)
    {
        //select salaryType 'salaryType'
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
        log.info("select salary type"+ salaryTypeDropDown.toString());
    }
    public void selectJobType(String jobType)
    {
        //select jobType 'jobType'
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
        log.info("select job type"+ jobTypeDropDown.toString());
    }
    public void clickOnFindJobsButton()
    {
        //click on 'Find Jobs' button
        clickOnElement(findJobsBtn);
        log.info("click on find job button"+ findJobsBtn.toString());
    }

}
