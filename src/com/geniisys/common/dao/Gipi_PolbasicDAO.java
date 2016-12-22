package com.geniisys.common.dao;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.entity.Gipi_Polbasic;
import com.geniisys.common.entity.PolicyNo;

public interface Gipi_PolbasicDAO {
	List<Gipi_Polbasic> fetchRefPolNo(Integer policyId) throws SQLException;
	String getBondDtl(Integer policyID) throws SQLException;
	Integer fetchPolicyId(PolicyNo policyNo) throws SQLException;
}
