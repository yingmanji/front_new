package com.front.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Generate {
    private Long generateId;

    private Long parkinglotId;

    private Date generateShareBegin;

    private Date generateShareEnd;

    private BigDecimal generatePrice;

    private String generateStatus;

    public Generate(Long generateId, Long parkinglotId, Date generateShareBegin, Date generateShareEnd, BigDecimal generatePrice, String generateStatus) {
        this.generateId = generateId;
        this.parkinglotId = parkinglotId;
        this.generateShareBegin = generateShareBegin;
        this.generateShareEnd = generateShareEnd;
        this.generatePrice = generatePrice;
        this.generateStatus = generateStatus;
    }

    public Generate() {
        super();
    }

    public Long getGenerateId() {
        return generateId;
    }

    public void setGenerateId(Long generateId) {
        this.generateId = generateId;
    }

    public Long getParkinglotId() {
        return parkinglotId;
    }

    public void setParkinglotId(Long parkinglotId) {
        this.parkinglotId = parkinglotId;
    }

    public Date getGenerateShareBegin() {
        return generateShareBegin;
    }

    public void setGenerateShareBegin(Date generateShareBegin) {
        this.generateShareBegin = generateShareBegin;
    }

    public Date getGenerateShareEnd() {
        return generateShareEnd;
    }

    public void setGenerateShareEnd(Date generateShareEnd) {
        this.generateShareEnd = generateShareEnd;
    }

    public BigDecimal getGeneratePrice() {
        return generatePrice;
    }

    public void setGeneratePrice(BigDecimal generatePrice) {
        this.generatePrice = generatePrice;
    }

    public String getGenerateStatus() {
        return generateStatus;
    }

    public void setGenerateStatus(String generateStatus) {
        this.generateStatus = generateStatus == null ? null : generateStatus.trim();
    }
}