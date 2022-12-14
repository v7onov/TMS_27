package testdata;

import models.RegistrationModel;
import utilities.PropertiesManager;

public class GetRegistrationModel {

    public static RegistrationModel getRegistrationModelWithAllFields(){
        PropertiesManager propertiesManager = new PropertiesManager();
        return RegistrationModel
                .builder()
                .username("ВесёлыйФермер")
                .email(propertiesManager.get("EMAIL"))
                .password(propertiesManager.get("PASSWORD"))
                .firstName("Анатолий")
                .lastName("Вассерман")
                .phoneNumber("222-33-22")
                .build();
    }
}