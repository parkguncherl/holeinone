package com.tour.app.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tour.app.admin.vo.CodeVo;

@Mapper
public interface AdminMapper {
  
  /**
   * 코드 목록 조회
   * 
   * @param vo
   * @return
   * @throws Exception
   */
  public List<CodeVo> selectCodeList(CodeVo vo) throws Exception;
  

}
