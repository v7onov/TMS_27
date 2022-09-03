package testdata;

import models.LoginModel;
import utilities.PropertiesManager;

public class GetLoginModel {

    public static LoginModel getLoginModelWithAllFields(){
        PropertiesManager propertiesManager = new PropertiesManager();
        return LoginModel
                .builder()
                .email(propertiesManager.get("EMAIL"))
                .password(propertiesManager.get("PASSWORD"))
                .build();
    }
}