/*
 * Swagger BookUnity
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Account
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-04-24T18:42:49.417Z")
public class Account   {
  @JsonProperty("login")
  private String login = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("secondName")
  private String secondName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("age")
  private Integer age = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("country")
  private String country = null;

  public Account login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Get login
   * @return login
   **/
  @JsonProperty("login")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public Account firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @JsonProperty("firstName")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Account secondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

  /**
   * Get secondName
   * @return secondName
   **/
  @JsonProperty("secondName")
  @ApiModelProperty(value = "")
  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public Account lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   **/
  @JsonProperty("lastName")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Account password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @JsonProperty("password")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Account phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   **/
  @JsonProperty("phone")
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Account age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
   **/
  @JsonProperty("age")
  @ApiModelProperty(value = "")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Account city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   **/
  @JsonProperty("city")
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Account region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   **/
  @JsonProperty("region")
  @ApiModelProperty(value = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Account country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   **/
  @JsonProperty("country")
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.login, account.login) &&
        Objects.equals(this.firstName, account.firstName) &&
        Objects.equals(this.secondName, account.secondName) &&
        Objects.equals(this.lastName, account.lastName) &&
        Objects.equals(this.password, account.password) &&
        Objects.equals(this.phone, account.phone) &&
        Objects.equals(this.age, account.age) &&
        Objects.equals(this.city, account.city) &&
        Objects.equals(this.region, account.region) &&
        Objects.equals(this.country, account.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, firstName, secondName, lastName, password, phone, age, city, region, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

