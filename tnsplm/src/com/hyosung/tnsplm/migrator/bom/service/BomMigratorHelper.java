package com.hyosung.tnsplm.migrator.bom.service;

import wt.services.ServiceFactory;

public class BomMigratorHelper {

	public static final BomMigratorService service = ServiceFactory.getService(BomMigratorService.class);

	public static final BomMigratorHelper manager = new BomMigratorHelper();
}
