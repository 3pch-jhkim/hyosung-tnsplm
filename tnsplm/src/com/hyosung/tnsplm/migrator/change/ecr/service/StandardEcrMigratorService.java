package com.hyosung.tnsplm.migrator.change.ecr.service;

import wt.services.StandardManager;
import wt.util.WTException;

/**
 * @클래스명 : StandardEcrMigratorService.java
 * @최초 작성자 :
 * @최초 작성일 : 2025. 02. 10
 * @설명 :
 */
public class StandardEcrMigratorService extends StandardManager implements EcrMigratorService {

	public static StandardEcrMigratorService newStandardEcrMigratorService() throws WTException {
		StandardEcrMigratorService instance = new StandardEcrMigratorService();
		instance.initialize();
		return instance;
	}

}
