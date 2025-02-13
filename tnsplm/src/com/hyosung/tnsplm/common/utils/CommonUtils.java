package com.hyosung.tnsplm.common.utils;

import wt.fc.Persistable;
import wt.fc.ReferenceFactory;

/**
 * @클래스명 : CommonUtils.java
 * @최초 작성자 :
 * @최초 작성일 : 2025. 02. 11
 * @설명 :
 */
public class CommonUtils {

	private CommonUtils() {

	}

	/**
	 * @메소드명 :
	 * @최초 작성자 :
	 * @최초 작성일 : 2025. 02. 11
	 * @설명 :
	 */
	public static Persistable getPersistable(String oid) throws Exception {
		ReferenceFactory rf = new ReferenceFactory();
		return rf.getReference(oid).getObject();
	}

}
