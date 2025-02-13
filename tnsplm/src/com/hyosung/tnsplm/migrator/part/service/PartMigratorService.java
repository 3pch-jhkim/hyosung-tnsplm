package com.hyosung.tnsplm.migrator.part.service;

import com.aspose.cells.Cells;

import wt.method.RemoteInterface;

@RemoteInterface
public interface PartMigratorService {

	/**
	 * @메소드명 :
	 * @최초 작성자 :
	 * @최초 작성일 : 2025. 02. 06
	 * @설명 :
	 */
	public abstract void readExcelSapTransferWindchillPart(final String path) throws Exception;

	/**
	 * @메소드명 :
	 * @최초 작성자 :
	 * @최초 작성일 : 2025. 02. 07
	 * @설명 :
	 */
	public abstract void createPart(Cells cells, int row, String viewType) throws Exception;
}
