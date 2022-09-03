package testdata;

import models.CreateAdModel;

import static staticdata.Images.*;

public class GetCreateAdModel {

    public static CreateAdModel getCreateAdModelWithAllFields(){
        return CreateAdModel
                .builder()
                .title("Картофель")
                .description("Отличная картошечка")
                .category("Овощи")
                .price("200")
                .picture(POTATOES)
                .build();
    }
}
