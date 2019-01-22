package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardFinancialSettlementReportingBaseWithIdAndRoot
 */
public class CardFinancialSettlementReportingBaseWithIdAndRoot   {
  private String cardFinancialSettlementProcessReportingTaskReference = null;

  private String cardFinancialSettlementProcessReference = null;

  private String cardFinancialSettlementServiceSchedule = null;

  private String participantAcquirerBankReference = null;

  private String participantAcquirerBankSettlementTerms = null;

  private String participantIssuerBankReference = null;

  private String participantIssuerBankSettlementTerms = null;

  private Object cardFinancialSettlementProcessTransactionConsolidationTaskRecord = null;

  private Object cardFinancialSettlementServicePaymentAdviceRecord = null;

  private Object cardFinancialSettlementProcessInstructionTaskRecord = null;

  private String participantAcquirerBankSettlementAccountStatement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to reporting task for the settlement processing instance 
   * @return cardFinancialSettlementProcessReportingTaskReference
  **/

  public String getCardFinancialSettlementProcessReportingTaskReference() {
    return cardFinancialSettlementProcessReportingTaskReference;
  }

  public void setCardFinancialSettlementProcessReportingTaskReference(String cardFinancialSettlementProcessReportingTaskReference) {
    this.cardFinancialSettlementProcessReportingTaskReference = cardFinancialSettlementProcessReportingTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: consolidated record of Issuer and Acquirer transactions for settlement window 
   * @return cardFinancialSettlementProcessTransactionConsolidationTaskRecord
  **/

  public Object getCardFinancialSettlementProcessTransactionConsolidationTaskRecord() {
    return cardFinancialSettlementProcessTransactionConsolidationTaskRecord;
  }

  public void setCardFinancialSettlementProcessTransactionConsolidationTaskRecord(Object cardFinancialSettlementProcessTransactionConsolidationTaskRecord) {
    this.cardFinancialSettlementProcessTransactionConsolidationTaskRecord = cardFinancialSettlementProcessTransactionConsolidationTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: details the individual Acquirer and Issuer payments calculated to be due for this settlement window 
   * @return cardFinancialSettlementServicePaymentAdviceRecord
  **/

  public Object getCardFinancialSettlementServicePaymentAdviceRecord() {
    return cardFinancialSettlementServicePaymentAdviceRecord;
  }

  public void setCardFinancialSettlementServicePaymentAdviceRecord(Object cardFinancialSettlementServicePaymentAdviceRecord) {
    this.cardFinancialSettlementServicePaymentAdviceRecord = cardFinancialSettlementServicePaymentAdviceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: consolidated record of payment instructions and settlement accounts reference in this settlement processing instance 
   * @return cardFinancialSettlementProcessInstructionTaskRecord
  **/

  public Object getCardFinancialSettlementProcessInstructionTaskRecord() {
    return cardFinancialSettlementProcessInstructionTaskRecord;
  }

  public void setCardFinancialSettlementProcessInstructionTaskRecord(Object cardFinancialSettlementProcessInstructionTaskRecord) {
    this.cardFinancialSettlementProcessInstructionTaskRecord = cardFinancialSettlementProcessInstructionTaskRecord;
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


}

