import com.greencity.navigation.Navigation;
import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.MainPageBL;
import com.greencity.steps.NewsItemPageBL;
import com.greencity.steps.RegisterPageBL;
import org.testng.annotations.Test;

import static com.greencity.enums.URLs.BASE_URL;

public class NewsItemTest extends BaseTest{
    @Test
    public void registerUserWithValidParameters() throws InterruptedException {

        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        EcoNewsPageBL ecoNewsPageBL = mainPageBL
                .getHeaderPageBL()
                .clickOnEcoNewsButton();

    }

}

