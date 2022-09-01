package com.yansen.dtos.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class ImportRequest implements Serializable {

    private long id;

    private String name;

    private String ticker;

    @JsonProperty("coin_id")
    private Integer coinId;

    private String code;

    private String exchange;

    private Integer invalid;

    @JsonProperty("record_time")
    private Integer recordTime;

    private BigDecimal usd;

    private BigDecimal idr;

    private BigDecimal hnst;

    private BigDecimal eth;

    private BigDecimal btc;

    @JsonProperty("created_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createdAt;

    @JsonProperty("updated_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String updatedAt;
}
