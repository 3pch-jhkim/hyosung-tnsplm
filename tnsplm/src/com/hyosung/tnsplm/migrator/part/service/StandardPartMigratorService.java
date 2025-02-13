package com.hyosung.tnsplm.migrator.part.service;

import com.aspose.cells.Cells;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

import wt.fc.PersistenceHelper;
import wt.part.WTPart;
import wt.pom.Transaction;
import wt.services.StandardManager;
import wt.util.WTException;
import wt.vc.views.View;
import wt.vc.views.ViewHelper;
import wt.vc.views.ViewReference;

public class StandardPartMigratorService extends StandardManager implements PartMigratorService {

	public static StandardPartMigratorService newStandardPartMigratorService() throws WTException {
		StandardPartMigratorService instance = new StandardPartMigratorService();
		instance.initialize();
		return instance;
	}

	/**
	 * @메소드명 :
	 * @최초 작성자 :
	 * @최초 작성일 : 2025. 02. 06
	 * @설명 :
	 */
	@Override
	public void readExcelSapTransferWindchillPart(String path) throws Exception {
		Transaction trs = new Transaction();
		try {
			trs.start();

			Workbook workbook = new Workbook(path);
			Worksheet worksheet = workbook.getWorksheets().get(0);
			Cells cells = worksheet.getCells();

			// 행과 열을 순회하면서 데이터 읽기
			int rowCount = cells.getMaxRow() + 1; // 실제 데이터가 있는 최대 행 인덱스 + 1

			System.out.println("엑셀 데이터 출력:");
			for (int row = 0; row < rowCount; row++) {
				String cellValue = cells.get(row, 0).getStringValue(); // 셀 값 가져오기

				WTPart ePart = PartMigratorHelper.manager.getWTPartByView(cellValue, "E");

				// 부품이 EPART 없을시 생성한다
				if (ePart != null) {
					// 생성시 모든 버전을 고려해서 생성 해야 하는것인가
					createPart(cells, row, "E");
				} else {
					// 데이터 존재 할 시 어떻게 할 것인가 !

				}

				WTPart mPart = PartMigratorHelper.manager.getWTPartByView(cellValue, "M");
				// 부품이 MPART 없을시 생성한다
				if (mPart != null) {
					// 생성시 모든 버전을 고려해서 생성 해야 하는것인가
					createPart(cells, row, "M");
				} else {
					// 데이터 존재 할 시 어떻게 할 것인가 !
				}

				System.out.println(); // 줄 바꿈
			}

			trs.commit();
			trs = null;
		} catch (Exception e) {
			e.printStackTrace();
			trs.rollback();
			throw e;
		} finally {
			if (trs != null)
				trs.rollback();
		}
	}

	/**
	 * @메소드명 :
	 * @최초 작성자 :
	 * @최초 작성일 : 2025. 02. 07
	 * @설명 :
	 */
	@Override
	public void createPart(Cells cells, int row, String viewType) throws Exception {
		String number = cells.get(row, 0).getStringValue();
		String name = cells.get(row, 1).getStringValue();
		Transaction trs = new Transaction();
		try {
			trs.start();

			View view = PartMigratorHelper.manager.getView(viewType);

			WTPart part = WTPart.newWTPart();
			part.setNumber(number);
			part.setName(name);
			part.setView(ViewReference.newViewReference(view));
			PersistenceHelper.manager.save(part);

			trs.commit();
			trs = null;
		} catch (Exception e) {
			e.printStackTrace();
			trs.rollback();
			throw e;
		} finally {
			if (trs != null)
				trs.rollback();
		}
	}
}
