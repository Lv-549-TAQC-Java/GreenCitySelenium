import com.greencity.navigation.Navigation;
import com.greencity.steps.MainPageBL;
import com.greencity.steps.RegisterPageBL;
import org.testng.annotations.Test;

import static com.greencity.enums.URLs.BASE_URL;

public class UserRegisterTest extends BaseTest {
    @Test
    public void registerUserWithValidParameters() {

        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnSignUpButton()
                .registerNewPerson();
        registerPageBL.verifyUserRegistration();
    }
}
