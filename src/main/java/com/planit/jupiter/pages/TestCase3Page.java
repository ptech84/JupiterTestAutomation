package com.planit.jupiter.pages;

import com.planit.jupiter.utils.Utilities;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.NoSuchElementException;

public class TestCase3Page extends PageObject {

    float priceVal = 0;
    int quantityVal = 0;
    float subTotalVal = 0;
    double expectedVal = 0;
    public String price = null;
    public String quantity = null;
    public String subTotal = null;

    Utilities utilities;

    public TestCase3Page(){
        utilities = new Utilities();
    }
    public void click_buy_button_twice_on(String arg1) {
        find(By.xpath("//h4[text()='" + arg1 + "']/parent::div/p/a")).click();
        find(By.xpath("//h4[text()='" + arg1 + "']/parent::div/p/a")).click();
    }

    public void click_buy_button_thrice_on(String arg1) {
        find(By.xpath("//h4[text()='" + arg1 + "']/parent::div/p/a")).click();
        find(By.xpath("//h4[text()='" + arg1 + "']/parent::div/p/a")).click();
        find(By.xpath("//h4[text()='" + arg1 + "']/parent::div/p/a")).click();
    }

    public void click_buy_button_five_times_on(String arg1) {
        find(By.xpath("//h4[text()='" + arg1 + "']/parent::div/p/a")).click();
        find(By.xpath("//h4[text()='" + arg1 + "']/parent::div/p/a")).click();
        find(By.xpath("//h4[text()='" + arg1 + "']/parent::div/p/a")).click();
        find(By.xpath("//h4[text()='" + arg1 + "']/parent::div/p/a")).click();
        find(By.xpath("//h4[text()='" + arg1 + "']/parent::div/p/a")).click();
    }

    public void verify_the_subtotal_for_each_product_is_correct() {
        List<WebElementFacade> listOfItems = findAll(By.xpath("//*[@name='form']/table/tbody/tr"));


        for (int i = 0; i < listOfItems.size(); i++) {
            int j = i + 1;
            String value = find(By.xpath("//*[@name='form']/table/tbody/tr[" + j + "]/td[1]")).getText();

            switch (value.trim()) {

                case "Stuffed Frog":
                    Assert.assertTrue(find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Stuffed Frog')]")).isDisplayed());
                    price = find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Stuffed Frog')]/following-sibling::td[1]")).getText();
                  quantity =  find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Stuffed Frog')]/following-sibling::td[2]/input")).getAttribute("value");
                     subTotal = find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Stuffed Frog')]/following-sibling::td[3]")).getText();

                    priceVal =  utilities.currencyConvertor(price);
                    quantityVal =   Integer.parseInt(quantity);
                    subTotalVal=  utilities.currencyConvertor(subTotal);

                    System.out.println("Calculated Sub-total = Multiply Price and Quantity");
                     expectedVal = priceVal * quantityVal;

                     System.out.println("Validated ****" + "$"+Utilities.round(expectedVal,2) + " matches with " + "$"+subTotalVal);
                    Assert.assertEquals("Sub-total value is not matching","$"+Utilities.round(expectedVal,2),"$"+subTotalVal);
                   break;
                case "Fluffy Bunny":
                    Assert.assertTrue(find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Fluffy Bunny')]")).isDisplayed());

                     price = find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Fluffy Bunny')]/following-sibling::td[1]")).getText();
                     quantity =  find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Fluffy Bunny')]/following-sibling::td[2]/input")).getAttribute("value");
                     subTotal = find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Fluffy Bunny')]/following-sibling::td[3]")).getText();

                    priceVal =  utilities.currencyConvertor(price);
                    quantityVal =   Integer.parseInt(quantity);
                    subTotalVal=  utilities.currencyConvertor(subTotal);

                    System.out.println("Calculated Sub-total = Multiply Price and Quantity");
                    expectedVal = priceVal * quantityVal;


                    System.out.println("Validated ****" + "$"+Utilities.round(expectedVal,2) + " matches with " + "$"+subTotalVal);
                    Assert.assertEquals("Sub-total value is not matching","$"+Utilities.round(expectedVal,2),"$"+subTotalVal);
                    break;
                case "Valentine Bear":
                    Assert.assertTrue(find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Valentine Bear')]")).isDisplayed());


                    price = find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Valentine Bear')]/following-sibling::td[1]")).getText();
                    quantity =  find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Valentine Bear')]/following-sibling::td[2]/input")).getAttribute("value");
                    subTotal = find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Valentine Bear')]/following-sibling::td[3]")).getText();

                    priceVal =  utilities.currencyConvertor(price);
                    quantityVal =   Integer.parseInt(quantity);
                    subTotalVal=  utilities.currencyConvertor(subTotal);

                    System.out.println("Calculated Sub-total = Multiply Price and Quantity");
                    expectedVal = priceVal * quantityVal;


                    System.out.println("Validated ****" + "$"+Utilities.round(expectedVal,2) + " matches with " + "$"+subTotalVal);
                    Assert.assertEquals("Sub-total value is not matching","$"+Utilities.round(expectedVal,2),"$"+subTotalVal);
                    break;


                default:
                    throw new NoSuchElementException("Items not in the cart to calculate sub-total");
            }


        }
    }


}
