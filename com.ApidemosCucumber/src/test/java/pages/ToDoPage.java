package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;


public class ToDoPage extends BasePage{

    @AndroidFindBy(id = "com.example.yeshasprabhakar.todo:id/fab")
    public WebElement plusButton;

    @AndroidFindBy(id = "com.example.yeshasprabhakar.todo:id/edit_title")
    public WebElement textBox;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement doneButton;

    @AndroidFindBy(id = "com.example.yeshasprabhakar.todo:id/titleRow")
    public WebElement firstRow;

    @AndroidFindBy(className = "android.widget.Toast")
    public WebElement toastMessage;

    @AndroidFindBy(id = "com.example.yeshasprabhakar.todo:id/themeActionButton")
    public WebElement moonSunButton;

    @AndroidFindBy(id = "android:id/button2")
    public WebElement cancelButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView")
    public WebElement deleteIcon;

}
