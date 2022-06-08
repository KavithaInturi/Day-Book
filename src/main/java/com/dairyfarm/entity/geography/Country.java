package com.dairyfarm.entity.geography;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

/**
 * Holds Country properties.
 * 
 * Data is taken from
 * <Reef>https://github.com/datasets/country-codes/blob/master/data/country-codes.csv</Reef>
 * 
 * @author ACJW8ZZ
 *
 */
@Data
@Entity
@Table(name = "countries", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" }),
		@UniqueConstraint(columnNames = { "alpha3" }) })
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String alpha2;
	private String alpha3;
	private String numericCode;
	private String dial;
	private String currName;
	private String currAlphabeticCode;
	private String currnumericCode;
	private int currminorUnit;
}
