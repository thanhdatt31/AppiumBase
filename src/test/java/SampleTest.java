import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import vn.datnt.base.BaseTest;

public class SampleTest extends BaseTest {
    @Test
    public void testTapCartAndViewDetails() {
        WebElement cartItem = driver
                .findElement(By.xpath("(//android.widget.ImageView[@content-desc='Product Image'])[1]"));
        cartItem.click();
    }
}
