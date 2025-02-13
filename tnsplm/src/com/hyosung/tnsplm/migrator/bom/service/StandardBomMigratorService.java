package com.hyosung.tnsplm.migrator.bom.service;

import wt.services.StandardManager;
import wt.util.WTException;

public class StandardBomMigratorService extends StandardManager implements BomMigratorService {

	public static StandardBomMigratorService newStandardBomMigratorService() throws WTException {
		StandardBomMigratorService instance = new StandardBomMigratorService();
		instance.initialize();
		return instance;
	}
}
