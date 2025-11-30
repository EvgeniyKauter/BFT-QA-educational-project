import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class UITest {

//    System.out.println(null); пример где на 0 делить нельзя
//    Assertions.assertTrue(false);

    @Test
    void exception() {

        int a = 5;
        int b = 5;
        int c = a - b;

        try {
            System.out.println(a / c);
        }
        catch (Exception e) {
            System.out.println("Нельзя делить на 0");
        }

        try {
            Assertions.assertTrue(false);
        } catch (AssertionError e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

}
