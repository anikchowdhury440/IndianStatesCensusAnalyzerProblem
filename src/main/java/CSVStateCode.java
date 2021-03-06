import com.opencsv.bean.CsvBindByName;

public class CSVStateCode {
	@CsvBindByName(column = "SrNo", required = true)
	private String srNo;
	
	@CsvBindByName(column = "StateName", required = true)
	private String stateName;
	
	@CsvBindByName(column = "TIN", required = true)
	private String tin;
	
	@CsvBindByName(column = "StateCode", required = true)
	private String stateCode;
	
	public String getSrNo() {
		return srNo;
	}
	
	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}
	
	public String getStateName() {
		return stateName;
	}
	
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public String getTin() {
		return tin;
	}
	
	public void setTin(String tin) {
		this.tin = tin;
	}
	
	public String getStateCode() {
		return stateCode;
	}
	
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	
	@Override
	public String toString() {
	    return  "Sr No ='" + srNo + '\'' +
	                ", State Name ='" + stateName + '\'' +
	                ", TIN ='" + tin + '\'' +
	                ", State Code ='" + stateCode + '\''
	                +"\n";
	 }
}
