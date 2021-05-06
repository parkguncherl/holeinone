package com.tour.app.util;

import java.nio.charset.Charset;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author PARK
 * 공통 클래스
 */
@Component
public class CommonUtil {


	/**
	 * 화면 return method
	 * */
	public  ResponseEntity comRtnJson(Object obj,HttpStatus hs) throws Exception {
		HttpHeaders headers= new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
	    ObjectMapper objectMapper = new ObjectMapper();
		String result = objectMapper.writeValueAsString(obj);
		return new ResponseEntity(obj,headers, hs);
	}
	
}
