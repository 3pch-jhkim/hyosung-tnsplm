package com.hyosung.tnsplm.migrator.change.eco.service;

import wt.services.ServiceFactory;

/**
 * @클래스명 : EcrMigratorHelper.java
 * @최초 작성자 :
 * @최초 작성일 : 2025. 02. 10
 * @설명 :
 */
public class EcoMigratorHelper {

	public static EcoMigratorService service = ServiceFactory.getService(EcoMigratorService.class);

	public static final EcoMigratorHelper manager = new EcoMigratorHelper();

}
