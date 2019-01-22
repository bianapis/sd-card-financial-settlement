/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardFinancialSettlementApiService {

	CardFinancialSettlementRecordBaseWithIdAndRoot record(String crReferenceId, CardFinancialSettlementRecordBase request);
	
	CardFinancialSettlementSettlementBaseWithIdAndRoot requestPost(CardFinancialSettlementSettlementBase request);
	
	CardFinancialSettlementSettlementBaseWithIdAndRoot requestPut(String crReferenceId, CardFinancialSettlementSettlementBase request);
	
	CardFinancialSettlementSettlementBaseWithIdAndRoot retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	CardFinancialSettlementConsolidationBaseWithIdAndRoot retrieveConsolidations(String crReferenceId, String bqReferenceId);
	
	CardFinancialSettlementInstructionBaseWithIdAndRoot retrieveInstructions(String crReferenceId, String bqReferenceId);
	
	CardFinancialSettlementPaymentBaseWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId);
	
	CardFinancialSettlementProcessingBaseWithIdAndRoot retrieveProcessings(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	CardFinancialSettlementReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId);
	
	CardFinancialSettlementSettlementBaseWithIdAndRoot update(String crReferenceId, CardFinancialSettlementSettlementBase request);
	
}
