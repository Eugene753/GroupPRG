package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class EmployeeListPage extends CommonMethods {

   @FindBy(xpath = "//table[@id='resultTable']/tbody/tr")
    public List <WebElement> employeeList;

    @FindBy(linkText = "Next")
    public WebElement nextButton;

    @FindBy(id = "empsearch_employee_name_empName")
    public WebElement employeeNameField;

    @FindBy(id = "searchBtn")
    public WebElement searchButton;
   
    public EmployeeListPage(){
        PageFactory.initElements(driver,this);
    }
}
