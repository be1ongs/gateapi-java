/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * OpenAPI spec version: 4.7.2
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Transfer
 */

public class Transfer {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  /**
   * Account transferred from. &#x60;spot&#x60; - spot account. &#x60;margin&#x60; - margin account
   */
  @JsonAdapter(FromEnum.Adapter.class)
  public enum FromEnum {
    SPOT("spot"),
    
    MARGIN("margin");

    private String value;

    FromEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FromEnum fromValue(String text) {
      for (FromEnum b : FromEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<FromEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FromEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FromEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FromEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private FromEnum from;

  /**
   * Account transferred to. &#x60;spot&#x60; - spot account. &#x60;margin&#x60; - margin account
   */
  @JsonAdapter(ToEnum.Adapter.class)
  public enum ToEnum {
    SPOT("spot"),
    
    MARGIN("margin");

    private String value;

    ToEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ToEnum fromValue(String text) {
      for (ToEnum b : ToEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<ToEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ToEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ToEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ToEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private ToEnum to;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
  @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
  private String currencyPair;

  public Transfer currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Transfer currency name
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Transfer currency name")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Transfer from(FromEnum from) {
    this.from = from;
    return this;
  }

   /**
   * Account transferred from. &#x60;spot&#x60; - spot account. &#x60;margin&#x60; - margin account
   * @return from
  **/
  @ApiModelProperty(required = true, value = "Account transferred from. `spot` - spot account. `margin` - margin account")
  public FromEnum getFrom() {
    return from;
  }

  public void setFrom(FromEnum from) {
    this.from = from;
  }

  public Transfer to(ToEnum to) {
    this.to = to;
    return this;
  }

   /**
   * Account transferred to. &#x60;spot&#x60; - spot account. &#x60;margin&#x60; - margin account
   * @return to
  **/
  @ApiModelProperty(required = true, value = "Account transferred to. `spot` - spot account. `margin` - margin account")
  public ToEnum getTo() {
    return to;
  }

  public void setTo(ToEnum to) {
    this.to = to;
  }

  public Transfer amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Transfer amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Transfer amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Transfer currencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
    return this;
  }

   /**
   * Required if transfer from or to margin account
   * @return currencyPair
  **/
  @ApiModelProperty(required = true, value = "Required if transfer from or to margin account")
  public String getCurrencyPair() {
    return currencyPair;
  }

  public void setCurrencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transfer transfer = (Transfer) o;
    return Objects.equals(this.currency, transfer.currency) &&
        Objects.equals(this.from, transfer.from) &&
        Objects.equals(this.to, transfer.to) &&
        Objects.equals(this.amount, transfer.amount) &&
        Objects.equals(this.currencyPair, transfer.currencyPair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, from, to, amount, currencyPair);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfer {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
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

