package com.tour.app.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.app.admin.mapper.AdminMapper;
import com.tour.app.admin.vo.CodeVo;

@Service
public class CommonService {
	
	@Autowired
	AdminMapper adminMapper;
	
	public List<CodeVo> selectCodeList(CodeVo vo) throws Exception {
		return adminMapper.selectCodeList(vo);
	}

  
}
