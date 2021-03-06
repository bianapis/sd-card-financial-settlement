package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardFinancialSettlementPaymentBaseWithIdAndRoot
 */
public class CardFinancialSettlementPaymentBaseWithIdAndRoot   {
  private String cardFinancialSettlementProcessPaymentTaskReference = null;

  private String cardFinancialSettlementProcessReference = null;

  private String cardFinancialSettlementServiceSchedule = null;

  private String participantAcquirerBankReference = null;

  private String participantAcquirerBankSettlementTerms = null;

  private String participantIssuerBankReference = null;

  private String participantIssuerBankSettlementTerms = null;

  private Object cardFinancialSettlementServicePaymentAdviceRecord = null;

  private String participantPaymentTransaction = null;

  private String participantAcquirerBankSettlementAccountStatement = null;

  private String participantIssuerBankSettlementAccountStatement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to individual participant payment task for the processing instance 
   * @return cardFinancialSettlementProcessPaymentTaskReference
  **/

  public String getCardFinancialSettlementProcessPaymentTaskReference() {
    return cardFinancialSettlementProcessPaymentTaskReference;
  }

  public void setCardFinancialSettlementProcessPaymentTaskReference(String cardFinancialSettlementProcessPaymentTaskReference) {
    this.cardFinancialSettlementProcessPaymentTaskReference = cardFinancialSettlementProcessPaymentTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: referes to overarching settlement process instance 
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines card settlement fees/terms in force  
   * @return participantAcquirerBankSettlementTerms
  **/

  public String getParticipantAcquirerBankSettlementTerms() {
    return participantAcquirerBankSettlementTerms;
  }

  public void setParticipantAcquirerBankSettlementTerms(String participantAcquirerBankSettlementTerms) {
    this.participantAcquirerBankSettlementTerms = participantAcquirerBankSettlementTerms;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines card settlement fees/terms in force  
   * @return participantIssuerBankSettlementTerms
  **/

  public String getParticipantIssuerBankSettlementTerms() {
    return participantIssuerBankSettlementTerms;
  }

  public void setParticipantIssuerBankSettlementTerms(String participantIssuerBankSettlementTerms) {
    this.participantIssuerBankSettlementTerms = participantIssuerBankSettlementTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: details the individual participant Issuer or Acquirer payments calculated to be due for this settlement window  
   * @return cardFinancialSettlementServicePaymentAdviceRecord
  **/

  public Object getCardFinancialSettlementServicePaymentAdviceRecord() {
    return cardFinancialSettlementServicePaymentAdviceRecord;
  }

  public void setCardFinancialSettlementServicePaymentAdviceRecord(Object cardFinancialSettlementServicePaymentAdviceRecord) {
    this.cardFinancialSettlementServicePaymentAdviceRecord = cardFinancialSettlementServicePaymentAdviceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: details the payment made, typically from Issuer to Acquirer participant bank 
   * @return participantPaymentTransaction
  **/

  public String getParticipantPaymentTransaction() {
    return participantPaymentTransaction;
  }

  public void setParticipantPaymentTransaction(String participantPaymentTransaction) {
    this.participantPaymentTransaction = participantPaymentTransaction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: settlement account statement for processing window  
   * @return participantAcquirerBankSettlementAccountStatement
  **/

  public String getParticipantAcquirerBankSettlementAccountStatement() {
    return participantAcquirerBankSettlementAccountStatement;
  }

  public void setParticipantAcquirerBankSettlementAccountStatement(String participantAcquirerBankSettlementAccountStatement) {
    this.participantAcquirerBankSettlementAccountStatement = participantAcquirerBankSettlementAccountStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: settlement account statement for processing window  
   * @return participantIssuerBankSettlementAccountStatement
  **/

  public String getParticipantIssuerBankSettlementAccountStatement() {
    return participantIssuerBankSettlementAccountStatement;
  }

  public void setParticipantIssuerBankSettlementAccountStatement(String participantIssuerBankSettlementAccountStatement) {
    this.participantIssuerBankSettlementAccountStatement = participantIssuerBankSettlementAccountStatement;
  }


}

