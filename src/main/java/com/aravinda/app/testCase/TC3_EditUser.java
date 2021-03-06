package com.aravinda.app.testCase;

import com.aravinda.app.Preconditions.LoginPrecon;
import com.aravinda.app.script.CreateNewUserScript;
import com.aravinda.app.script.EditUserScript;
import org.seleniumx.annotations.DriverSettings;
import org.seleniumx.annotations.Precondition;
import org.seleniumx.annotations.Script;
import org.seleniumx.util.Set;
import org.seleniumx.util.TestCase;

public class TC3_EditUser extends TestCase {
    @DriverSettings(
            OS = Set.OS.MAC,
            WINDOW_SIZE = Set.WINDOW_SIZE.FULLSCREEN,
            BROWSER = Set.BROWSER.CHROME,
            BASE_URL = "https://cafetownsend-angular-rails.herokuapp.com/login",
            IMPLICIT_WAIT = 10000
    )
    @Precondition(precondition = LoginPrecon.class, data = {"Luke", "Skywalker", "Hello Luke"})
    @Script(script = EditUserScript.class)
    public void testCase() {
        data.put("userToEdit","Test user222");
        data.put("firstName", "Test2");
        data.put("lastName", "user333");
        data.put("date", "2019-02-04");
        data.put("email", "testuser333@email.com");
        data.put("mainPageUserName", "Hello Luke");
        data.put("newUserName", "Test2 user333");
        testCase(data);
    }
}
