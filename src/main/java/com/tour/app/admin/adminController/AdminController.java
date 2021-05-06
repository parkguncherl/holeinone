package com.tour.app.admin.adminController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tour.app.admin.service.AdminService;
import com.tour.app.admin.vo.CodeVo;
import com.tour.app.admin.vo.ResCodeList;
import com.tour.app.util.CommonUtil;
import com.tour.app.util.Const;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@EnableAutoConfiguration
@RequestMapping("/admin")
public class AdminController {

  @Autowired
  private AdminService adminService;
  
  @Autowired
  private CommonUtil commonUtil;
  

  
  /**
   * 게시글 목록 조회
   * @param request
   * @param response
   * @return
   * @throws Exception
   */
  @GetMapping(value="/codeList")
  @ResponseBody
  public ResponseEntity selectCodeList(HttpServletRequest request, CodeVo vo) throws Exception {

	
    List<CodeVo> codes = adminService.selectCodeList(vo);
    ResCodeList vos = new ResCodeList();
    vos.setCodes(codes);
    
    if (codes == null) {
    	return commonUtil.comRtnJson(vos, Const.NOT_FOUND);
    }
    
    return commonUtil.comRtnJson(vos, Const.NOT_FOUND);
  }

  
}
