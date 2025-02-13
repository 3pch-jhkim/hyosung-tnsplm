package com.hyosung.tnsplm.common.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

/**
 * @클래스명 : ResponseUtils.java
 * @최초 작성자 :
 * @최초 작성일 : 2025. 02. 11
 * @설명 :
 */
public class ResponseUtils {

	protected final boolean SUCCESS = true;
	protected final boolean FAIL = false;

	protected final String PREFIX = "/WEB-INF/tnsplm/jsp";
	protected final String SUFFIX = ".jsp";

	/**
	 * @메소드명 :
	 * @최초 작성자 :
	 * @최초 작성일 : 2025. 02. 11
	 * @설명 :
	 */
	protected ModelAndView model(String url) {
		return new ModelAndView(PREFIX + url + SUFFIX);
	}

	/**
	 * @메소드명 :
	 * @최초 작성자 :
	 * @최초 작성일 : 2025. 02. 11
	 * @설명 :
	 */
	protected Map<String, Object> map() {
		return new HashMap<>();
	}

	/**
	 * 
	 * @메소드명 :
	 * @최초 작성자 :
	 * @최초 작성일 : 2025. 02. 11
	 * @설명 :
	 */
	protected void success(Map<String, Object> map, String msg) {
		map.put("result", SUCCESS);
		map.put("msg", msg);
	}

	/**
	 * @메소드명 :
	 * @최초 작성자 :
	 * @최초 작성일 : 2025. 02. 11
	 * @설명 :
	 */
	protected void fail(Map<String, Object> map, String msg) {
		map.put("result", FAIL);
		map.put("msg", msg);
	}
}
