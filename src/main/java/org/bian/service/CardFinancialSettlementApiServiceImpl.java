/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardFinancialSettlementApiServiceImpl implements CardFinancialSettlementApiService {

	public CardFinancialSettlementRecordBaseWithIdAndRoot record(String crReferenceId, CardFinancialSettlementRecordBase request){
		return JsonReader.read("record-CardFinancialSettlementRecordBaseWithIdAndRoot.json",new TypeReference<CardFinancialSettlementRecordBaseWithIdAndRoot>(){});
	}
	
	public CardFinancialSettlementSettlementBaseWithIdAndRoot requestPost(CardFinancialSettlementSettlementBase request){
		return JsonReader.read("requestPost-CardFinancialSettlementSettlementBaseWithIdAndRoot.json",new TypeReference<CardFinancialSettlementSettlementBaseWithIdAndRoot>(){});
	}
	
	public CardFinancialSettlementSettlementBaseWithIdAndRoot requestPut(String crReferenceId, CardFinancialSettlementSettlementBase request){
		return JsonReader.read("requestPut-CardFinancialSettlementSettlementBaseWithIdAndRoot.json",new TypeReference<CardFinancialSettlementSettlementBaseWithIdAndRoot>(){});
	}
	
	public CardFinancialSettlementSettlementBaseWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CardFinancialSettlementSettlementBaseWithIdAndRoot.json",new TypeReference<CardFinancialSettlementSettlementBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CardFinancialSettlementConsolidationBaseWithIdAndRoot retrieveConsolidations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardFinancialSettlementConsolidationBaseWithIdAndRoot.json",new TypeReference<CardFinancialSettlementConsolidationBaseWithIdAndRoot>(){});
	}
	
	public CardFinancialSettlementInstructionBaseWithIdAndRoot retrieveInstructions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardFinancialSettlementInstructionBaseWithIdAndRoot.json",new TypeReference<CardFinancialSettlementInstructionBaseWithIdAndRoot>(){});
	}
	
	public CardFinancialSettlementPaymentBaseWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardFinancialSettlementPaymentBaseWithIdAndRoot.json",new TypeReference<CardFinancialSettlementPaymentBaseWithIdAndRoot>(){});
	}
	
	public CardFinancialSettlementProcessingBaseWithIdAndRoot retrieveProcessings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardFinancialSettlementProcessingBaseWithIdAndRoot.json",new TypeReference<CardFinancialSettlementProcessingBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CardFinancialSettlementReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardFinancialSettlementReportingBaseWithIdAndRoot.json",new TypeReference<CardFinancialSettlementReportingBaseWithIdAndRoot>(){});
	}
	
	public CardFinancialSettlementSettlementBaseWithIdAndRoot update(String crReferenceId, CardFinancialSettlementSettlementBase request){
		return JsonReader.read("update-CardFinancialSettlementSettlementBaseWithIdAndRoot.json",new TypeReference<CardFinancialSettlementSettlementBaseWithIdAndRoot>(){});
	}
	
}
