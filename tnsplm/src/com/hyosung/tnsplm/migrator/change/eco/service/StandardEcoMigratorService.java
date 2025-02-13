package com.hyosung.tnsplm.migrator.change.eco.service;

import wt.services.StandardManager;
import wt.util.WTException;

/**
 * @클래스명 : StandardEcrMigratorService.java
 * @최초 작성자 :
 * @최초 작성일 : 2025. 02. 10
 * @설명 :
 */
public class StandardEcoMigratorService extends StandardManager implements EcoMigratorService {

	public static StandardEcoMigratorService newStandardEcoMigratorService() throws WTException {
		StandardEcoMigratorService instance = new StandardEcoMigratorService();
		instance.initialize();
		return instance;
	}

}
