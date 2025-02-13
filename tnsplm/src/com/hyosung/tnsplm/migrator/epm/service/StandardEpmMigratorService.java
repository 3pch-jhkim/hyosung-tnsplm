package com.hyosung.tnsplm.migrator.epm.service;

import wt.doc.WTDocument;
import wt.fc.ObjectReference;
import wt.iba.definition.StringDefinition;
import wt.iba.definition.StringDefinitionReference;
import wt.services.StandardManager;
import wt.util.WTException;

public class StandardEpmMigratorService extends StandardManager implements EpmMigratorService {

	public static StandardEpmMigratorService newStandardEpmMigratorService() throws WTException {
		StandardEpmMigratorService instance = new StandardEpmMigratorService();
		instance.initialize();
		return instance;
	}
}
