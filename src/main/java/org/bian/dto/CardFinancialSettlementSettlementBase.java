package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardFinancialSettlementSettlementBase
 */
public class CardFinancialSettlementSettlementBase   {
  private String cardFinancialSettlementProcessType = null;

  private Object cardFinancialSettlementProcessRecord = null;

  private String cardFinancialSettlementProcessDateTime = null;

  private String cardFinancialSettlementProcessStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines the type of settlement process  
   * @return cardFinancialSettlementProcessType
  **/

  public String getCardFinancialSettlementProcessType() {
    return cardFinancialSettlementProcessType;
  }

  public void setCardFinancialSettlementProcessType(String cardFinancialSettlementProcessType) {
    this.cardFinancialSettlementProcessType = cardFinancialSettlementProcessType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: the control record/mechanism used to track the completion of the settlement process 
   * @return cardFinancialSettlementProcessRecord
  **/

  public Object getCardFinancialSettlementProcessRecord() {
    return cardFinancialSettlementProcessRecord;
  }

  public void setCardFinancialSettlementProcessRecord(Object cardFinancialSettlementProcessRecord) {
    this.cardFinancialSettlementProcessRecord = cardFinancialSettlementProcessRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: the scheduled time for the process  
   * @return cardFinancialSettlementProcessDateTime
  **/

  public String getCardFinancialSettlementProcessDateTime() {
    return cardFinancialSettlementProcessDateTime;
  }

  public void setCardFinancialSettlementProcessDateTime(String cardFinancialSettlementProcessDateTime) {
    this.cardFinancialSettlementProcessDateTime = cardFinancialSettlementProcessDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: open, active, completed, etc. 
   * @return cardFinancialSettlementProcessStatus
  **/

  public String getCardFinancialSettlementProcessStatus() {
    return cardFinancialSettlementProcessStatus;
  }

  public void setCardFinancialSettlementProcessStatus(String cardFinancialSettlementProcessStatus) {
    this.cardFinancialSettlementProcessStatus = cardFinancialSettlementProcessStatus;
  }


}

