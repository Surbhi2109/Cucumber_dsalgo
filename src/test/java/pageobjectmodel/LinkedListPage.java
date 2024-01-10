package pageobjectmodel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import driverfactory.DriverFactory;


public class LinkedListPage extends DriverFactory {
	
	public LinkedListPage ()
	  {
	   PageFactory.initElements(getdriver(), this);
	  }

		//General Function to Click Button
		public void ClickBtn(String Xpath) {
		By ClickBtn=By.xpath(Xpath);
		getdriver().findElement(ClickBtn).click();
		}
		
		//General Function to Enter values
		public void EnterValue(String value,String Xpath) {
			By boxvalue=By.xpath(Xpath);
			//Entering the values in the boxes
			getdriver().findElement(boxvalue).sendKeys(value);
		}
		
		//General Function to Get Values 
		public String GetValue(String Xpath) {
			By textvalue=By.xpath(Xpath);
			String outputdata=getdriver().findElement(textvalue).getText();
			return outputdata;
		}
		
		//General Function to retrieve data from ExcelSheet
		public String GetdatafromExcel(String Workbook_path, String Worksheet_name, String Cell_location) throws IOException {
			FileInputStream inputStream = new FileInputStream(Workbook_path);
		    XSSFWorkbook Wb = new XSSFWorkbook(inputStream);
		    XSSFSheet Ws = Wb.getSheet(Worksheet_name);
		    
		    CellAddress cellAddress = new CellAddress(Cell_location);
		    Row row = Ws.getRow(cellAddress.getRow());
		    Cell cell = row.getCell(cellAddress.getColumn());
		    Wb.close();
		    return cell.getStringCellValue();   
		}
		
		
		//Function to click Get Started Button after Home page
		public void getstarted() {
			
			//Initializing browser
			getdriver().get("https://dsportalapp.herokuapp.com");
			
			//Clicking the Get started Button by Xpath
			ClickBtn("//*[@class='btn']");
	    	
			}
		
		
		//Function to Click Signin Button
		public void signinbtn() {
			
			//Clicking the Signin Button by XPath
			ClickBtn("/html/body/div[1]/nav/div/div[2]/ul/a[3]");
		}

		
		//Function to Enter Login Credentials
		public void enterlogincredentials(String username,String password) {
			
			//Entering the values in the boxes
			EnterValue(username,"//*[@id=\"id_username\"]");
			EnterValue(password,"//*[@id=\"id_password\"]");
			
			//Clicking the login button
			ClickBtn("/html/body/div[2]/div/div[2]/form/input[4]");
			
		}
		
		
		//Function to Click linked list get started Button
		public void linkedlistgetstrbtn() {
			
			//Clicking the linked list get started Button by XPath
			ClickBtn("/html/body/div[3]/div[3]/div/div/a");
		}
		

		//Function to Click linked list introduction Button
			public void Introductionllbtn() {
				
				//Clicking the linked list Introduction Button by XPath
				ClickBtn("/html/body/div[2]/ul[1]/a");
			}
			
			
			//Function to Click try here of Introduction Button
			public void tryherebtn() {
				
				//Clicking the  try here of Introduction Button by XPath
				ClickBtn("/html/body/div[2]/div/div[2]/a");
			}
			
			
			public void enterpythoncode(String Workbook_path, String Worksheet_name, String Cell_location) throws IOException{
				
				ClickBtn("//*[@id='answer_form']");
				String textdata = GetdatafromExcel(Workbook_path, Worksheet_name, Cell_location);
				EnterValue(textdata,"/html/body/div/div/form/div/div/div[1]/textarea");

			}
			
			public void runbtn() {
				
				ClickBtn("//*[@id=\"answer_form\"]/button");
				
			}
			
			public void tryhereoutput() {
				
				System.out.println("LinkedListOutput: " + GetValue("//*[@id=\"output\"]"));
				
			}
			
			public void Linkedlistpage() {
				
				getdriver().get("https://dsportalapp.herokuapp.com/linked-list");
				
			}
			
			public void Creatinglinkedlistbtn() {
				
				ClickBtn("/html/body/div[2]/ul[2]/a");
				
			}
			
			public void Typesoflinkedlistbtn() {
				
				ClickBtn("/html/body/div[2]/ul[3]/a");
				
			}
			
			public void  ImplementationoflinkedlistinPythonbtn() {
				
				ClickBtn("/html/body/div[2]/ul[4]/a");
				
			}

			public void Traversalbtn() {
		
				ClickBtn("/html/body/div[2]/ul[5]/a");
		
			}

			public void Insertionbtn() {
		
				ClickBtn("/html/body/div[2]/ul[6]/a");
		
			}

			public void Deletionbtn() {
		
				ClickBtn("/html/body/div[2]/ul[7]/a");
		
			}

			public void Practicequestionsbtn() {
				
				//ClickBtn("/html/body/div[2]/ul[1]/a");
		
				ClickBtn("//*[@id=\"content\"]/a");
		
			}

			public void Homepage() {
		
				getdriver().get("https://dsportalapp.herokuapp.com/home");
		
			}
			

}
