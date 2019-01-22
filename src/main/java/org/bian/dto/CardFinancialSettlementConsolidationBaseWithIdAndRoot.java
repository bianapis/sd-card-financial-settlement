package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardFinancialSettlementConsolidationBaseWithIdAndRoot
 */
public class CardFinancialSettlementConsolidationBaseWithIdAndRoot   {
  private String cardFinancialSettlementProcessTransactionConsolidationTaskReference = null;

  private String cardFinancialSettlementProcessReference = null;

  private String cardFinancialSettlementServiceSchedule = null;

  private String participantAcquirerBankReference = null;

  private String participantIssuerBankReference = null;

  private String cardTransactionRecordReference = null;

  private String cardTransactionProductInstanceReference = null;

  private String cardTransactionIssuingBankReference = null;

  private String cardTransactionMerchantAcquiringBankReference = null;

  private String cardTransactionType = null;

  private String cardTransactionCurrency = null;

  private String cardTransactionAmountType = null;

  private String cardTransactionAmount = null;

  private String cardTransactionMerchantReference = null;

  private String cardTransactionLocationReference = null;

  private String cardTransactionProductServiceReference = null;

  private String cardTransactionDateTime = null;

  private Object cardFinancialSettlementProcessTransactionConsolidationTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the transaction consolidation task for the settlement processing instance 
   * @return cardFinancialSettlementProcessTransactionConsolidationTaskReference
  **/

  public String getCardFinancialSettlementProcessTransactionConsolidationTaskReference() {
    return cardFinancialSettlementProcessTransactionConsolidationTaskReference;
  }

  public void setCardFinancialSettlementProcessTransactionConsolidationTaskReference(String cardFinancialSettlementProcessTransactionConsolidationTaskReference) {
    this.cardFinancialSettlementProcessTransactionConsolidationTaskReference = cardFinancialSettlementProcessTransactionConsolidationTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: referes to the settlement process instance 
   * @return cardFinancialSettlementProcessReference
  **/

  public String getCardFinancialSettlementProcessReference() {
    return cardFinancialSettlementProcessReference;
  }

  public void setCardFinancialSettlementProcessReference(String cardFinancialSettlementProcessReference) {
    this.cardFinancialSettlementProcessReference = cardFinancialSettlementProcessReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Card Financial Settlement Service Schedule 
   * @return cardFinancialSettlementServiceSchedule
  **/

  public String getCardFinancialSettlementServiceSchedule() {
    return cardFinancialSettlementServiceSchedule;
  }

  public void setCardFinancialSettlementServiceSchedule(String cardFinancialSettlementServiceSchedule) {
    this.cardFinancialSettlementServiceSchedule = cardFinancialSettlementServiceSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the Acquiring bank for which the Network orchestrates settlement processing 
   * @return participantAcquirerBankReference
  **/

  public String getParticipantAcquirerBankReference() {
    return participantAcquirerBankReference;
  }

  public void setParticipantAcquirerBankReference(String participantAcquirerBankReference) {
    this.participantAcquirerBankReference = participantAcquirerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the Issuing bank for which the Network orchestrates settlement processing 
   * @return participantIssuerBankReference
  **/

  public String getParticipantIssuerBankReference() {
    return participantIssuerBankReference;
  }

  public void setParticipantIssuerBankReference(String participantIssuerBankReference) {
    this.participantIssuerBankReference = participantIssuerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the card transaction as recorded by issuer and/or acquirer  
   * @return cardTransactionRecordReference
  **/

  public String getCardTransactionRecordReference() {
    return cardTransactionRecordReference;
  }

  public void setCardTransactionRecordReference(String cardTransactionRecordReference) {
    this.cardTransactionRecordReference = cardTransactionRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: account number associated with the card transaction 
   * @return cardTransactionProductInstanceReference
  **/

  public String getCardTransactionProductInstanceReference() {
    return cardTransactionProductInstanceReference;
  }

  public void setCardTransactionProductInstanceReference(String cardTransactionProductInstanceReference) {
    this.cardTransactionProductInstanceReference = cardTransactionProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Card Transaction Issuing Bank Reference 
   * @return cardTransactionIssuingBankReference
  **/

  public String getCardTransactionIssuingBankReference() {
    return cardTransactionIssuingBankReference;
  }

  public void setCardTransactionIssuingBankReference(String cardTransactionIssuingBankReference) {
    this.cardTransactionIssuingBankReference = cardTransactionIssuingBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Card Transaction Merchant Acquiring Bank Reference 
   * @return cardTransactionMerchantAcquiringBankReference
  **/

  public String getCardTransactionMerchantAcquiringBankReference() {
    return cardTransactionMerchantAcquiringBankReference;
  }

  public void setCardTransactionMerchantAcquiringBankReference(String cardTransactionMerchantAcquiringBankReference) {
    this.cardTransactionMerchantAcquiringBankReference = cardTransactionMerchantAcquiringBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Card Transaction Type 
   * @return cardTransactionType
  **/

  public String getCardTransactionType() {
    return cardTransactionType;
  }

  public void setCardTransactionType(String cardTransactionType) {
    this.cardTransactionType = cardTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: Card Transaction Currency 
   * @return cardTransactionCurrency
  **/

  public String getCardTransactionCurrency() {
    return cardTransactionCurrency;
  }

  public void setCardTransactionCurrency(String cardTransactionCurrency) {
    this.cardTransactionCurrency = cardTransactionCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: original amount, billing currency amount, conversion rate, FX mark 
   * @return cardTransactionAmountType
  **/

  public String getCardTransactionAmountType() {
    return cardTransactionAmountType;
  }

  public void setCardTransactionAmountType(String cardTransactionAmountType) {
    this.cardTransactionAmountType = cardTransactionAmountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Card Transaction Amount 
   * @return cardTransactionAmount
  **/

  public String getCardTransactionAmount() {
    return cardTransactionAmount;
  }

  public void setCardTransactionAmount(String cardTransactionAmount) {
    this.cardTransactionAmount = cardTransactionAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Card Transaction Merchant Reference 
   * @return cardTransactionMerchantReference
  **/

  public String getCardTransactionMerchantReference() {
    return cardTransactionMerchantReference;
  }

  public void setCardTransactionMerchantReference(String cardTransactionMerchantReference) {
    this.cardTransactionMerchantReference = cardTransactionMerchantReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: point of sale location 
   * @return cardTransactionLocationReference
  **/

  public String getCardTransactionLocationReference() {
    return cardTransactionLocationReference;
  }

  public void setCardTransactionLocationReference(String cardTransactionLocationReference) {
    this.cardTransactionLocationReference = cardTransactionLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: e.g. purchased service/product 
   * @return cardTransactionProductServiceReference
  **/

  public String getCardTransactionProductServiceReference() {
    return cardTransactionProductServiceReference;
  }

  public void setCardTransactionProductServiceReference(String cardTransactionProductServiceReference) {
    this.cardTransactionProductServiceReference = cardTransactionProductServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Card Transaction Date/Time 
   * @return cardTransactionDateTime
  **/

  public String getCardTransactionDateTime() {
    return cardTransactionDateTime;
  }

  public void setCardTransactionDateTime(String cardTransactionDateTime) {
    this.cardTransactionDateTime = cardTransactionDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: consolidated record of Issuer and Acquirer transactions for settlement window 
   * @return cardFinancialSettlementProcessTransactionConsolidationTaskRecord
  **/

  public Object getCardFinancialSettlementProcessTransactionConsolidationTaskRecord() {
    return cardFinancialSettlementProcessTransactionConsolidationTaskRecord;
  }

  public void setCardFinancialSettlementProcessTransactionConsolidationTaskRecord(Object cardFinancialSettlementProcessTransactionConsolidationTaskRecord) {
    this.cardFinancialSettlementProcessTransactionConsolidationTaskRecord = cardFinancialSettlementProcessTransactionConsolidationTaskRecord;
  }


}

