package com.hyosung.tnsplm.migrator.epm.service;

import wt.services.ServiceFactory;

public class EpmMigratorHelper {

	public static final EpmMigratorService service = ServiceFactory.getService(EpmMigratorService.class);

	public static final EpmMigratorHelper manager = new EpmMigratorHelper();
}
