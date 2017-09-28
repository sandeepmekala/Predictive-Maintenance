package com.sap.pm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CPU_METRIC_FORECASTS")
public class MetricForecast {
	
	@Id
	@Column(name = "")
	private Date date;
	
	@Column(name = "")
	private double value;

}
