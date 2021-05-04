package com.tour.app.admin.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CodeVo  extends CommnVo{

	  @Getter @Setter
	  private int codeIdx;
	  
	  @Getter @Setter
	  private String codeId;
	  
	  @Getter @Setter
	  private String codeName;
	  
	  @Getter @Setter
	  private String codeCntn;

}
