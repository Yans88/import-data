package com.yansen.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "schedule_coins")
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class ScheduleCoin {

    @Id
    private Long id;

    private String name;

    private String ticker;

    @Column(name = "coin_id")
    private Integer coinId;

    private String code;

    private String exchange;

    private Integer invalid;

    @Column(name = "record_time")
    private Integer recordTime;

    @Column(precision = 22)
    private BigDecimal usd;

    @Column(precision = 22)
    private BigDecimal idr;

    @Column(precision = 22)
    private BigDecimal hnst;

    @Column(precision = 22)
    private BigDecimal eth;

    @Column(precision = 22)
    private BigDecimal btc;

    @Column(name = "created_at", nullable = false, updatable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;

    @Column(name = "updated_at", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;
}
