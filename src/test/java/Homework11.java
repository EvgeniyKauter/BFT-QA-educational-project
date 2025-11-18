import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class Homework11 {

    @Test
    public void Test1 () {
        open("https://ya.ru/");
        $(byXpath("/html/body/main/div[2]/form/div[4]/div[2]/div[2]/div[2]/div/textarea[1]"))
                .setValue("рыбалка").pressEnter();
        $(byXpath("/html/body/div[1]/div[1]/header/form/div[1]/a/svg/path[1]"))
                .shouldBe(visible);
    }

    @Test
    public void Test2 () {
        open("https://ya.ru/");
        $(byXpath("/html/body/main/div[2]/form/div[4]/div[1]/section/ul/li[2]/a/div"))
                .shouldBe(visible);
    }

    //mvn clean -Dtest=Homework11 test
}
