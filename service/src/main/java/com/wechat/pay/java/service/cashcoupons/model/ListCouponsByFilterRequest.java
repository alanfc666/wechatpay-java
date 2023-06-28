// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付营销系统开放API
//
// 新增立减金api
//
// API version: 3.4.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.cashcoupons.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** ListCouponsByFilterRequest */
public class ListCouponsByFilterRequest {
  /** 用户标识 说明：用户在商户appid 下的唯一标识 */
  @SerializedName("openid")
  @Expose(serialize = false)
  private String openid;
  /**
   * 公众账号ID
   * 说明：微信为发券方商户分配的公众账号ID，接口传入的所有appid应该为公众号的appid（在mp.weixin.qq.com申请的），不能为APP的appid（在open.weixin.qq.com申请的）。
   */
  @SerializedName("appid")
  @Expose(serialize = false)
  private String appid;
  /** 批次号 说明：批次号，是否指定批次号查询，填写available_mchid，该字段不生效 */
  @SerializedName("stock_id")
  @Expose(serialize = false)
  private String stockId;
  /** 券状态 说明：代金券状态：SENDED-可用，USED-已实扣，填写available_mchid，该字段不生效 */
  @SerializedName("status")
  @Expose(serialize = false)
  private String status;
  /** 创建批次的商户号 说明：批次创建方商户号。创建批次的商户号，批次发放商户号，可用商户号三个参数，任意选填一个。 */
  @SerializedName("creator_mchid")
  @Expose(serialize = false)
  private String creatorMchid;
  /** 批次发放商户号 说明：批次发放商户号。创建批次的商户号，批次发放商户号，可用商户号三个参数，任意选填一个。 */
  @SerializedName("sender_mchid")
  @Expose(serialize = false)
  private String senderMchid;
  /** 可用商户号 说明：可用商户号。 创建批次的商户号，批次发放商户号，可用商户号三个参数，任意选填一个。 */
  @SerializedName("available_mchid")
  @Expose(serialize = false)
  private String availableMchid;
  /** 分页页码 说明：分页页码，默认0，填写available_mchid，该字段不生效 */
  @SerializedName("offset")
  @Expose(serialize = false)
  private Integer offset;
  /** 分页大小 说明：分页大小，默认20，填写available_mchid，该字段不生效 */
  @SerializedName("limit")
  @Expose(serialize = false)
  private Integer limit;

  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public String getStockId() {
    return stockId;
  }

  public void setStockId(String stockId) {
    this.stockId = stockId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCreatorMchid() {
    return creatorMchid;
  }

  public void setCreatorMchid(String creatorMchid) {
    this.creatorMchid = creatorMchid;
  }

  public String getSenderMchid() {
    return senderMchid;
  }

  public void setSenderMchid(String senderMchid) {
    this.senderMchid = senderMchid;
  }

  public String getAvailableMchid() {
    return availableMchid;
  }

  public void setAvailableMchid(String availableMchid) {
    this.availableMchid = availableMchid;
  }

  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCouponsByFilterRequest {\n");
    sb.append("    openid: ").append(toIndentedString(openid)).append("\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    stockId: ").append(toIndentedString(stockId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creatorMchid: ").append(toIndentedString(creatorMchid)).append("\n");
    sb.append("    senderMchid: ").append(toIndentedString(senderMchid)).append("\n");
    sb.append("    availableMchid: ").append(toIndentedString(availableMchid)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}