package com.sanxia.salesManagement.system.model;

import java.util.Date;

public class StatisticsInfo {
    private Integer id;

    private Integer salesmanId;

    private String salesmanName;

    private Date statisticTime;

    private Long totalWork;

    private Long totalOver;

    private Long totalOff;

    private String attendance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(Integer salesmanId) {
        this.salesmanId = salesmanId;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public Date getStatisticTime() {
        return statisticTime;
    }

    public void setStatisticTime(Date statisticTime) {
        this.statisticTime = statisticTime;
    }

    public Long getTotalWork() {
        return totalWork;
    }

    public void setTotalWork(Long totalWork) {
        this.totalWork = totalWork;
    }

    public Long getTotalOver() {
        return totalOver;
    }

    public void setTotalOver(Long totalOver) {
        this.totalOver = totalOver;
    }

    public Long getTotalOff() {
        return totalOff;
    }

    public void setTotalOff(Long totalOff) {
        this.totalOff = totalOff;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }
}