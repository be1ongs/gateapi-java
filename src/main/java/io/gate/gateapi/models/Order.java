/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
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
 * Spot order details
 */
@ApiModel(description = "Spot order details")

public class Order {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  /**
   * Order status  - &#x60;open&#x60;: to be filled - &#x60;closed&#x60;: filled - &#x60;cancelled&#x60;: cancelled
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OPEN("open"),
    
    CLOSED("closed"),
    
    CANCELLED("cancelled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
  @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
  private String currencyPair;

  /**
   * Order type. limit - limit order
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LIMIT("limit");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.LIMIT;

  /**
   * Account type. spot - use spot account; margin - use margin account
   */
  @JsonAdapter(AccountEnum.Adapter.class)
  public enum AccountEnum {
    SPOT("spot"),
    
    MARGIN("margin");

    private String value;

    AccountEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountEnum fromValue(String text) {
      for (AccountEnum b : AccountEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<AccountEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccountEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private AccountEnum account = AccountEnum.SPOT;

  /**
   * Order side
   */
  @JsonAdapter(SideEnum.Adapter.class)
  public enum SideEnum {
    BUY("buy"),
    
    SELL("sell");

    private String value;

    SideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SideEnum fromValue(String text) {
      for (SideEnum b : SideEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<SideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SideEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SideEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private SideEnum side;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  /**
   * Time in force
   */
  @JsonAdapter(TimeInForceEnum.Adapter.class)
  public enum TimeInForceEnum {
    GTC("gtc"),
    
    IOC("ioc");

    private String value;

    TimeInForceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeInForceEnum fromValue(String text) {
      for (TimeInForceEnum b : TimeInForceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<TimeInForceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeInForceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeInForceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TimeInForceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TIME_IN_FORCE = "time_in_force";
  @SerializedName(SERIALIZED_NAME_TIME_IN_FORCE)
  private TimeInForceEnum timeInForce = TimeInForceEnum.GTC;

  public static final String SERIALIZED_NAME_AUTO_BORROW = "auto_borrow";
  @SerializedName(SERIALIZED_NAME_AUTO_BORROW)
  private Boolean autoBorrow;

  public static final String SERIALIZED_NAME_LEFT = "left";
  @SerializedName(SERIALIZED_NAME_LEFT)
  private String left;

  public static final String SERIALIZED_NAME_FILL_PRICE = "fill_price";
  @SerializedName(SERIALIZED_NAME_FILL_PRICE)
  private String fillPrice;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private String fee;

  public static final String SERIALIZED_NAME_FEE_CURRENCY = "fee_currency";
  @SerializedName(SERIALIZED_NAME_FEE_CURRENCY)
  private String feeCurrency;

  public static final String SERIALIZED_NAME_POINT_FEE = "point_fee";
  @SerializedName(SERIALIZED_NAME_POINT_FEE)
  private String pointFee;

  public static final String SERIALIZED_NAME_GT_FEE = "gt_fee";
  @SerializedName(SERIALIZED_NAME_GT_FEE)
  private String gtFee;

   /**
   * Order ID
   * @return id
  **/
  @ApiModelProperty(value = "Order ID")
  public String getId() {
    return id;
  }

  public Order text(String text) {
    this.text = text;
    return this;
  }

   /**
   * User defined information. If not empty, must follow the rules below:  1. prefixed with &#x60;t-&#x60; 2. no longer than 16 bytes without &#x60;t-&#x60; prefix 3. can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.) 
   * @return text
  **/
  @ApiModelProperty(value = "User defined information. If not empty, must follow the rules below:  1. prefixed with `t-` 2. no longer than 16 bytes without `t-` prefix 3. can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.) ")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

   /**
   * Order creation time
   * @return createTime
  **/
  @ApiModelProperty(value = "Order creation time")
  public String getCreateTime() {
    return createTime;
  }

   /**
   * Order last modification time
   * @return updateTime
  **/
  @ApiModelProperty(value = "Order last modification time")
  public String getUpdateTime() {
    return updateTime;
  }

   /**
   * Order status  - &#x60;open&#x60;: to be filled - &#x60;closed&#x60;: filled - &#x60;cancelled&#x60;: cancelled
   * @return status
  **/
  @ApiModelProperty(value = "Order status  - `open`: to be filled - `closed`: filled - `cancelled`: cancelled")
  public StatusEnum getStatus() {
    return status;
  }

  public Order currencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
    return this;
  }

   /**
   * Currency pair
   * @return currencyPair
  **/
  @ApiModelProperty(required = true, value = "Currency pair")
  public String getCurrencyPair() {
    return currencyPair;
  }

  public void setCurrencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
  }

  public Order type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Order type. limit - limit order
   * @return type
  **/
  @ApiModelProperty(value = "Order type. limit - limit order")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Order account(AccountEnum account) {
    this.account = account;
    return this;
  }

   /**
   * Account type. spot - use spot account; margin - use margin account
   * @return account
  **/
  @ApiModelProperty(value = "Account type. spot - use spot account; margin - use margin account")
  public AccountEnum getAccount() {
    return account;
  }

  public void setAccount(AccountEnum account) {
    this.account = account;
  }

  public Order side(SideEnum side) {
    this.side = side;
    return this;
  }

   /**
   * Order side
   * @return side
  **/
  @ApiModelProperty(required = true, value = "Order side")
  public SideEnum getSide() {
    return side;
  }

  public void setSide(SideEnum side) {
    this.side = side;
  }

  public Order amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Trade amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Trade amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Order price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Order price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "Order price")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Order timeInForce(TimeInForceEnum timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * Time in force
   * @return timeInForce
  **/
  @ApiModelProperty(value = "Time in force")
  public TimeInForceEnum getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(TimeInForceEnum timeInForce) {
    this.timeInForce = timeInForce;
  }

  public Order autoBorrow(Boolean autoBorrow) {
    this.autoBorrow = autoBorrow;
    return this;
  }

   /**
   * Used in margin trading(e.g. &#x60;account&#x60; is &#x60;margin&#x60;) to allow automatic loan of insufficient part if balance is not enough.
   * @return autoBorrow
  **/
  @ApiModelProperty(value = "Used in margin trading(e.g. `account` is `margin`) to allow automatic loan of insufficient part if balance is not enough.")
  public Boolean getAutoBorrow() {
    return autoBorrow;
  }

  public void setAutoBorrow(Boolean autoBorrow) {
    this.autoBorrow = autoBorrow;
  }

   /**
   * Amount left to fill
   * @return left
  **/
  @ApiModelProperty(value = "Amount left to fill")
  public String getLeft() {
    return left;
  }

   /**
   * Total filled in quote currency
   * @return fillPrice
  **/
  @ApiModelProperty(value = "Total filled in quote currency")
  public String getFillPrice() {
    return fillPrice;
  }

   /**
   * Fee deducted
   * @return fee
  **/
  @ApiModelProperty(value = "Fee deducted")
  public String getFee() {
    return fee;
  }

   /**
   * Fee currency unit
   * @return feeCurrency
  **/
  @ApiModelProperty(value = "Fee currency unit")
  public String getFeeCurrency() {
    return feeCurrency;
  }

   /**
   * Point used to deduct fee
   * @return pointFee
  **/
  @ApiModelProperty(value = "Point used to deduct fee")
  public String getPointFee() {
    return pointFee;
  }

   /**
   * GT used to deduct fee
   * @return gtFee
  **/
  @ApiModelProperty(value = "GT used to deduct fee")
  public String getGtFee() {
    return gtFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.text, order.text) &&
        Objects.equals(this.createTime, order.createTime) &&
        Objects.equals(this.updateTime, order.updateTime) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.currencyPair, order.currencyPair) &&
        Objects.equals(this.type, order.type) &&
        Objects.equals(this.account, order.account) &&
        Objects.equals(this.side, order.side) &&
        Objects.equals(this.amount, order.amount) &&
        Objects.equals(this.price, order.price) &&
        Objects.equals(this.timeInForce, order.timeInForce) &&
        Objects.equals(this.autoBorrow, order.autoBorrow) &&
        Objects.equals(this.left, order.left) &&
        Objects.equals(this.fillPrice, order.fillPrice) &&
        Objects.equals(this.fee, order.fee) &&
        Objects.equals(this.feeCurrency, order.feeCurrency) &&
        Objects.equals(this.pointFee, order.pointFee) &&
        Objects.equals(this.gtFee, order.gtFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, createTime, updateTime, status, currencyPair, type, account, side, amount, price, timeInForce, autoBorrow, left, fillPrice, fee, feeCurrency, pointFee, gtFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    autoBorrow: ").append(toIndentedString(autoBorrow)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    fillPrice: ").append(toIndentedString(fillPrice)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    feeCurrency: ").append(toIndentedString(feeCurrency)).append("\n");
    sb.append("    pointFee: ").append(toIndentedString(pointFee)).append("\n");
    sb.append("    gtFee: ").append(toIndentedString(gtFee)).append("\n");
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

