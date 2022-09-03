package models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Builder
@EqualsAndHashCode
@ToString
public class CreateAdModel {

    private String title;
    private String description;
    private String category;
    private String price;
    private String picture;
    private String location;
    private String contacts;
}
