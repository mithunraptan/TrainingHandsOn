package com.collections.map.practice.insurance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;


public class PolicyManager {
	
	List<Policy> policyList = new ArrayList<>();
	Map<Integer, Policy> policyMap = new HashMap<>();
	
	//add new policy
	public void addPolicy(Policy policy) {
		if(policyMap.containsKey(policy.getPolicyNumber())){
			System.out.println("policy number already exist !!!");
			return;
		}
		else {
			policyList.add(policy);
			policyMap.put(policy.getPolicyNumber(), policy);
			System.out.println("policy added successfully");
		}
	}
	
	//find policy
	public Policy findPolicy(int policyNumber) {
		return policyMap.get(policyNumber);
	}
	
	//display active policies
	public void displayActivePolicies() {
		Map<String, Integer> activePolicies = new HashMap<String, Integer>();
		
		for(Policy policy : policyList) {
			int count = 0;
			if(policy.getPolicyStatus() == Policy.PolicyStatus.ACTIVE) {
				count ++;
			}
			if(activePolicies.containsKey(policy.getPolicyType().toString())) {
				Integer integer = activePolicies.get(policy.getPolicyType().toString());
				integer = integer +count;
				activePolicies.put(policy.getPolicyType().toString(), integer);
			}
			else {
				
				activePolicies.put(policy.getPolicyType().toString(), count);
			}
		}
			
		//showing all active policies
		for( Entry<String, Integer> entst : activePolicies.entrySet()) {
			System.out.println(entst.getKey() + " : "+ entst.getValue());
		}
		
		
	}
	
	// find highest premium policy
	public void findHighestPremiumPolicy() {
		Optional<Policy> max = policyList.stream().max(Comparator.comparingDouble(Policy::getFinalPremium));
		Policy foundHighesPolicy = max.get();
		System.out.println(foundHighesPolicy.getPolicyType() + " : " + foundHighesPolicy.getFinalPremium());
	}
	
	//remove expired policies
	public void removeExpiredPolicies() {
		boolean policyFind = false;
		Policy policyToBeDeleted = null;
		for(Policy policy : policyList) {
			if(policy.getPolicyStatus() == Policy.PolicyStatus.EXPIRED) {
				policyFind = true;
				policyToBeDeleted = policy;
			}
		}
		if(policyFind) {
			policyList.remove(policyToBeDeleted);
			//remove from policy map too
			policyMap.remove(policyToBeDeleted.getPolicyNumber());
			System.out.println("policy removed successfully");
		}
	}

}
