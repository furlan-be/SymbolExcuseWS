package com.example.symbolexcusesws.dao;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Excuses")
@Getter
@Setter
@Builder
public class ExcuseDao {

    @Id
    private String id;
    @Field("http_code")
    private int httCode;
    @Field("tag ")
    private String tag;
    @Field("message ")
    private String message;

}
