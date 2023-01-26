package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	private static HomePage loginPageInstance;
	
	//Dummy private constructor prevents the object creation
	private HomePage() {
		
	}
	
	//this method prevents second object creation for the same type, Singleton pattern lazy loading
	public static HomePage getInstance()
	{
		if(loginPageInstance==null) {
			loginPageInstance = new HomePage();		
		}
		
		return loginPageInstance;
		
	}		
	
	//Web elements declaration
	
	@FindBy (className="btn")WebElement btngetstarted;	
	@FindBy (xpath="//div[contains(text(),'You are not logged in')]")WebElement regsuccessalert;	
	@FindBy (className="//div[@class='navbar-nav']/div/a")WebElement DSdropdown;	
	@FindBy (xpath = "//a[@href=\"/login\"]")WebElement linksignin;	
	@FindBy (xpath="//a[@href=\"/register\"]")WebElement linkregister;	
	@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement DSintro;	
	@FindBy (xpath="//a[@href='array']")WebElement LinkArray;
	@FindBy (xpath="//a[@href='linked-list']")WebElement Linklinkedlist;	
	@FindBy (xpath="//a[@href='stack']")WebElement Linkstack;	
	@FindBy (xpath="//a[@href='queue']")WebElement Linkqueue;
	@FindBy (xpath="//a[@href='tree']")WebElement Linktree;	
	@FindBy (xpath="//a[@href='graph']")WebElement Linkgraph;
	
	@FindBy (xpath="//div[@class='navbar-nav']/div/a")WebElement dropdown;	
	@FindBy (xpath="//a[@href='array']")WebElement drp_Array;
	
	@FindBy (xpath="//a[text()='Linked List']")WebElement drp_Linked_List;
	@FindBy (xpath="//a[text()='Stack']")WebElement drp_Stack;
	@FindBy (xpath="//a[text()='Queue']")WebElement drp_Queue;
	@FindBy (xpath="//a[text()='Tree']")WebElement drp_Tree;
	@FindBy (xpath="//a[text()='Graph']")WebElement drp_Graph;	
	
	@FindBy (linkText="Sign out")WebElement lnkSignout;
	
	public String successalertmessage() {		
		
		String successmsg = regsuccessalert.getText();
		return successmsg;
		
	}
	
	public void Signout_Click()
	{
		lnkSignout.click();
	}
	
	//Web elements action / events
	public void btn_getstartedclick() {
		
		btngetstarted.click();
		
		}
	
	public void btnArrayGetstarted_Click()
	{
		drp_Array.click();
	}
	
	public void drp_Item_Click(String strItem) throws InterruptedException {
		
		dropdown.click();
		
		Thread.sleep(3000);
		
		switch (strItem) {
			case "Arrays":
				drp_Array.click();
				break;
			case "Linked List":
				drp_Linked_List.click();
				break;			
			case "Stack":
				drp_Stack.click();
				break;
			case "Queue":
				drp_Queue.click();
				break;
			case "Tree":
				drp_Tree.click();
				break;			
			case "Graph":
				drp_Graph.click();
				break;
			default:
				break;
			}		
	}
	
	public void link_signin() {
		linksignin.click();
	}
	
	public void likn_register() {
		linkregister.click();
	}
	public void btn_dsintro(){
		DSintro.click();
	}
	public void btn_linkarray() {
		LinkArray.click();
	}
	public void btn_linkedlist() {
		Linklinkedlist.click();
	}
	
	public void btn_stake() {
		Linkstack.click();
	}
	
	public void btn_queue() {
		Linkqueue.click();
	}
	
	public void btn_tree() {
		Linktree.click();
	}
	
	public void btn_graph() {
		Linkgraph.click();
	}
	
	
}
