package com.dapp.entity;

public class Contract {
    private Integer id;

    private String contractNum;

    private String partner;

    private String pledgeApplicant;

    private String amount;

    private String enterTime;

    private String signatureTime;

    private String credentialIssuer;

    private String issueCertificate;

    private String daysPayableOutstanding;

    private String status;

    private String contractType;

    private String outboundOrder;

    private String godownEntry;

    private String contract;

    private Integer certificateContractId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum == null ? null : contractNum.trim();
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner == null ? null : partner.trim();
    }

    public String getPledgeApplicant() {
        return pledgeApplicant;
    }

    public void setPledgeApplicant(String pledgeApplicant) {
        this.pledgeApplicant = pledgeApplicant == null ? null : pledgeApplicant.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(String enterTime) {
        this.enterTime = enterTime == null ? null : enterTime.trim();
    }

    public String getSignatureTime() {
        return signatureTime;
    }

    public void setSignatureTime(String signatureTime) {
        this.signatureTime = signatureTime == null ? null : signatureTime.trim();
    }

    public String getCredentialIssuer() {
        return credentialIssuer;
    }

    public void setCredentialIssuer(String credentialIssuer) {
        this.credentialIssuer = credentialIssuer == null ? null : credentialIssuer.trim();
    }

    public String getIssueCertificate() {
        return issueCertificate;
    }

    public void setIssueCertificate(String issueCertificate) {
        this.issueCertificate = issueCertificate == null ? null : issueCertificate.trim();
    }

    public String getDaysPayableOutstanding() {
        return daysPayableOutstanding;
    }

    public void setDaysPayableOutstanding(String daysPayableOutstanding) {
        this.daysPayableOutstanding = daysPayableOutstanding == null ? null : daysPayableOutstanding.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getOutboundOrder() {
        return outboundOrder;
    }

    public void setOutboundOrder(String outboundOrder) {
        this.outboundOrder = outboundOrder == null ? null : outboundOrder.trim();
    }

    public String getGodownEntry() {
        return godownEntry;
    }

    public void setGodownEntry(String godownEntry) {
        this.godownEntry = godownEntry == null ? null : godownEntry.trim();
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract == null ? null : contract.trim();
    }

    public Integer getCertificateContractId() {
        return certificateContractId;
    }

    public void setCertificateContractId(Integer certificateContractId) {
        this.certificateContractId = certificateContractId;
    }
}