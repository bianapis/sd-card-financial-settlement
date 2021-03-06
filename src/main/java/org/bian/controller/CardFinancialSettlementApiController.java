/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CardFinancialSettlementApiController {

	@Autowired
	CardFinancialSettlementApiService service;
	
	@Process.Record
	public BianResponse<CardFinancialSettlementRecordBaseWithIdAndRoot> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardFinancialSettlementRecordBase> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RequestPost
	public BianResponse<CardFinancialSettlementSettlementBaseWithIdAndRoot> requestPost(@RequestBody BianRequest<CardFinancialSettlementSettlementBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Process.RequestPut
	public BianResponse<CardFinancialSettlementSettlementBaseWithIdAndRoot> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardFinancialSettlementSettlementBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CardFinancialSettlementSettlementBaseWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("consolidations")
	@Process.Retrieve
	public BianResponse<CardFinancialSettlementConsolidationBaseWithIdAndRoot> retrieveConsolidations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveConsolidations(crReferenceId, bqReferenceId));
	}
	
	@BQ("instructions")
	@Process.Retrieve
	public BianResponse<CardFinancialSettlementInstructionBaseWithIdAndRoot> retrieveInstructions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInstructions(crReferenceId, bqReferenceId));
	}
	
	@BQ("payments")
	@Process.Retrieve
	public BianResponse<CardFinancialSettlementPaymentBaseWithIdAndRoot> retrievePayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayments(crReferenceId, bqReferenceId));
	}
	
	@BQ("processings")
	@Process.Retrieve
	public BianResponse<CardFinancialSettlementProcessingBaseWithIdAndRoot> retrieveProcessings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProcessings(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("reportings")
	@Process.Retrieve
	public BianResponse<CardFinancialSettlementReportingBaseWithIdAndRoot> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<CardFinancialSettlementSettlementBaseWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardFinancialSettlementSettlementBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
