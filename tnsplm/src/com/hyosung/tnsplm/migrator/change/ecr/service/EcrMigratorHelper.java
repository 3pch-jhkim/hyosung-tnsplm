package com.hyosung.tnsplm.migrator.change.ecr.service;

import com.hyosung.tnsplm.migrator.change.eco.service.EcoMigratorService;

import wt.services.ServiceFactory;

/**
 * @클래스명 : EcrMigratorHelper.java
 * @최초 작성자 :
 * @최초 작성일 : 2025. 02. 10
 * @설명 :
 */
public class EcrMigratorHelper {

	public static final EcoMigratorService service = ServiceFactory.getService(EcoMigratorService.class);

	public static final EcrMigratorHelper manager = new EcrMigratorHelper();
}
