import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LookForProduct extends PageObject {

    //WebElements

    @FindBy(id = "mainsearch-input")
    private WebElement submitButon;


    @FindBy(id = "mainsearch-input")
    private WebElement search;


    //Function

    public void introduceProduct(String productTosearch) {
        this.search.clear();
        this.search.sendKeys(productTosearch);

    }

    public void clickinSearch() {
        submitButon.submit();

    }


    public LookForProduct(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }
     //Comprobar esta funcion debug
    public static List<String> sortListString(final List<String> input){
     List<String > sortedList = new ArrayList<String>(input);
     for(String e : sortedList){
         //Sorting the comparation
         sortedList.add(input.contains(e) ? "Yes" : "No");
         System.out.println(sortedList);
     }
     //sortedList.sort(new customComparator());

     return sortedList;
    }
    public void getTitlesofArticles() {

        WebElement articles = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/div[3]/article/div[2]/div"));
        List<WebElement> result = articles.findElements(By.xpath("child::*"));
        System.out.println(result.size());
        //System.out.println("numberOfArticles " + articles.size());
        //List<WebElement> prices = articles.findElements(By.className("price-height"));
        //List<WebElement> title = articles.findElements(By.tagName("strong"));

        for (WebElement element:result) {
            //bucle padre
            String price = element.findElement(By.className("price-height")).getText();
            //String starNo = price.substring();
            String[] result2 = price.split(" ", 3);
            String priceNoStar = result2[0];
            String rest1 = result2[1];

            String title = element.findElement(By.xpath("//html//div[1]/div[1]/a[1]/span[2]/strong[1]")).getText();
            String[] result1 = title.split(" ", 10);
            String first = result1[0];
            String rest = result1[1];
            //System.out.println(first);



            System.out.println(first + " / "+ priceNoStar + "\r\n");


            /*List<WebElement> text = driver.findElements(By.tagName("strong"));

            List<WebElement> prices = driver.findElements(By.className("price-height"));

            for(int i =0;i<text.size();i++) {
                System.out.println(text.get(i).getText() + " / "+prices.get(i).getText() + ")\r\n";
            }

            for (WebElement title : text) {// bucle hijos 1
                System.out.println(title.getText() + " / ");
            }

                for (WebElement price : prices) { // bucle hijos 2
                    System.out.print( price.getText() + "\r\n");
                }


            }*/

        }


    }
}
