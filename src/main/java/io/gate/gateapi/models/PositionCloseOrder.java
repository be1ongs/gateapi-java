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
 * Current close order if any, or &#x60;null&#x60;
 */
@ApiModel(description = "Current close order if any, or `null`")

public class PositionCloseOrder {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_IS_LIQ = "is_liq";
  @SerializedName(SERIALIZED_NAME_IS_LIQ)
  private Boolean isLiq;

  public PositionCloseOrder id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Close order ID
   * @return id
  **/
  @ApiModelProperty(value = "Close order ID")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PositionCloseOrder price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Close order price
   * @return price
  **/
  @ApiModelProperty(value = "Close order price")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public PositionCloseOrder isLiq(Boolean isLiq) {
    this.isLiq = isLiq;
    return this;
  }

   /**
   * Is the close order from liquidation
   * @return isLiq
  **/
  @ApiModelProperty(value = "Is the close order from liquidation")
  public Boolean getIsLiq() {
    return isLiq;
  }

  public void setIsLiq(Boolean isLiq) {
    this.isLiq = isLiq;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionCloseOrder positionCloseOrder = (PositionCloseOrder) o;
    return Objects.equals(this.id, positionCloseOrder.id) &&
        Objects.equals(this.price, positionCloseOrder.price) &&
        Objects.equals(this.isLiq, positionCloseOrder.isLiq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, isLiq);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionCloseOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    isLiq: ").append(toIndentedString(isLiq)).append("\n");
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

