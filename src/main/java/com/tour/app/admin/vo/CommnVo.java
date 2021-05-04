package com.tour.app.admin.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CommnVo {
	
  @Getter @Setter
  private String regId;

  @Getter @Setter
  private String modId;
  
  @Getter @Setter
  private String regDate;
  
  @Getter @Setter
  private String modDate;

}
