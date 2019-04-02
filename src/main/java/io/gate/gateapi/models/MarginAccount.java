/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * OpenAPI spec version: 4.6.1
 * Contact: support@mail.gate.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.gate.gateapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gate.gateapi.models.MarginAccountCurrency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Margin account detail. &#x60;base&#x60; refers to base currency, while &#x60;quotes to quote currency
 */
@ApiModel(description = "Margin account detail. `base` refers to base currency, while `quotes to quote currency")

public class MarginAccount {
  public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
  @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
  private String currencyPair;

  public static final String SERIALIZED_NAME_BASE = "base";
  @SerializedName(SERIALIZED_NAME_BASE)
  private MarginAccountCurrency base = null;

  public static final String SERIALIZED_NAME_QUOTE = "quote";
  @SerializedName(SERIALIZED_NAME_QUOTE)
  private MarginAccountCurrency quote = null;

  public MarginAccount currencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
    return this;
  }

   /**
   * Currency pair
   * @return currencyPair
  **/
  @ApiModelProperty(value = "Currency pair")
  public String getCurrencyPair() {
    return currencyPair;
  }

  public void setCurrencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
  }

  public MarginAccount base(MarginAccountCurrency base) {
    this.base = base;
    return this;
  }

   /**
   * Get base
   * @return base
  **/
  @ApiModelProperty(value = "")
  public MarginAccountCurrency getBase() {
    return base;
  }

  public void setBase(MarginAccountCurrency base) {
    this.base = base;
  }

  public MarginAccount quote(MarginAccountCurrency quote) {
    this.quote = quote;
    return this;
  }

   /**
   * Get quote
   * @return quote
  **/
  @ApiModelProperty(value = "")
  public MarginAccountCurrency getQuote() {
    return quote;
  }

  public void setQuote(MarginAccountCurrency quote) {
    this.quote = quote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarginAccount marginAccount = (MarginAccount) o;
    return Objects.equals(this.currencyPair, marginAccount.currencyPair) &&
        Objects.equals(this.base, marginAccount.base) &&
        Objects.equals(this.quote, marginAccount.quote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyPair, base, quote);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarginAccount {\n");
    
    sb.append("    currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
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

