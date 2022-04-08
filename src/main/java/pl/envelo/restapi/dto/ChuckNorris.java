package pl.envelo.restapi.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class ChuckNorris {

    private List<String> categories;
    private String created_at;
    private String icon_url;
    private String id;
    private String updated_at;
    private String url;
    private String value;

}
