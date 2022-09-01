package com.yansen.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class ResponseDTO<T> {
    private String err_msg;
    private Integer total_data;
    private List<T> data;


}
