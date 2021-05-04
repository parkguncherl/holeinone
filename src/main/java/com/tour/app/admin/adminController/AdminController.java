package com.tour.app.admin.adminController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tour.app.admin.service.AdminService;
import com.tour.app.admin.vo.CodeVo;
import com.tour.app.admin.vo.ResCodeList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@EnableAutoConfiguration
@RequestMapping("/admin")
public class AdminController {

  @Autowired
  private AdminService adminService;
  
  /**
   * 게시글 목록 조회
   * @param request
   * @param response
   * @return
   * @throws Exception
   */
  @GetMapping(value="/codeList")
  public ResponseEntity<Object> selectCodeList(HttpServletRequest request, CodeVo vo) throws Exception {
    List<CodeVo> codes = adminService.selectCodeList(vo);

    if (codes == null) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("no member");
    }
    
    ResCodeList vos = new ResCodeList();
    vos.setCodes(codes);
    
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(vos);
  }

  
}
