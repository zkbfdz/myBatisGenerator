package cn.anjun.admin.model.track;

import java.math.BigDecimal;
import java.util.Date;

public class order {
    private Integer orderId;

    private Integer appId;

    private Integer packageId;

    private Integer userId;

    private String gameUserId;

    private String transactionId;

    private String gameOrderId;

    private String thirdGameZoneId;

    private Byte cardCode;

    private String roleId;

    private String roleName;

    private Integer level;

    private Integer vipLevel;

    private Byte source;

    private Byte payChannel;

    private Integer productId;

    private String productName;

    private String currency;

    private BigDecimal amount;

    private Integer gameCoin;

    private String gameCoinCurrency;

    private Integer status;

    private Byte orderEnv;

    private Byte refund;

    private Byte postGameServer;

    private Long ipAddress;

    private String country;

    private String gameExt;

    private String channelExt;

    private Date clientTime;

    private Date createTime;

    private Date modifyTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getGameUserId() {
        return gameUserId;
    }

    public void setGameUserId(String gameUserId) {
        this.gameUserId = gameUserId == null ? null : gameUserId.trim();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public String getGameOrderId() {
        return gameOrderId;
    }

    public void setGameOrderId(String gameOrderId) {
        this.gameOrderId = gameOrderId == null ? null : gameOrderId.trim();
    }

    public String getThirdGameZoneId() {
        return thirdGameZoneId;
    }

    public void setThirdGameZoneId(String thirdGameZoneId) {
        this.thirdGameZoneId = thirdGameZoneId == null ? null : thirdGameZoneId.trim();
    }

    public Byte getCardCode() {
        return cardCode;
    }

    public void setCardCode(Byte cardCode) {
        this.cardCode = cardCode;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Byte getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Byte payChannel) {
        this.payChannel = payChannel;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getGameCoin() {
        return gameCoin;
    }

    public void setGameCoin(Integer gameCoin) {
        this.gameCoin = gameCoin;
    }

    public String getGameCoinCurrency() {
        return gameCoinCurrency;
    }

    public void setGameCoinCurrency(String gameCoinCurrency) {
        this.gameCoinCurrency = gameCoinCurrency == null ? null : gameCoinCurrency.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Byte getOrderEnv() {
        return orderEnv;
    }

    public void setOrderEnv(Byte orderEnv) {
        this.orderEnv = orderEnv;
    }

    public Byte getRefund() {
        return refund;
    }

    public void setRefund(Byte refund) {
        this.refund = refund;
    }

    public Byte getPostGameServer() {
        return postGameServer;
    }

    public void setPostGameServer(Byte postGameServer) {
        this.postGameServer = postGameServer;
    }

    public Long getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(Long ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getGameExt() {
        return gameExt;
    }

    public void setGameExt(String gameExt) {
        this.gameExt = gameExt == null ? null : gameExt.trim();
    }

    public String getChannelExt() {
        return channelExt;
    }

    public void setChannelExt(String channelExt) {
        this.channelExt = channelExt == null ? null : channelExt.trim();
    }

    public Date getClientTime() {
        return clientTime;
    }

    public void setClientTime(Date clientTime) {
        this.clientTime = clientTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}