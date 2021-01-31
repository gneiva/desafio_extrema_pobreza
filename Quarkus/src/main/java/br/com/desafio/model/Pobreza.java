package br.com.desafio.model;

public class Pobreza {

	private Indicador indicator;
	private Pais country;
	private String countryiso3code;
	private String date;
	private Double value;
	private String unit;
	private String obs_status;
	private int decimal;
	public Indicador getIndicator() {
		return indicator;
	}
	public void setIndicator(Indicador indicator) {
		this.indicator = indicator;
	}
	public Pais getCountry() {
		return country;
	}
	public void setCountry(Pais country) {
		this.country = country;
	}
	public String getCountryiso3code() {
		return countryiso3code;
	}
	public void setCountryiso3code(String countryiso3code) {
		this.countryiso3code = countryiso3code;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getObs_status() {
		return obs_status;
	}
	public void setObs_status(String obs_status) {
		this.obs_status = obs_status;
	}
	public int getDecimal() {
		return decimal;
	}
	public void setDecimal(int decimal) {
		this.decimal = decimal;
	}
	
	
	

}
