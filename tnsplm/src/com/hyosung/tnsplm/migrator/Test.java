package com.hyosung.tnsplm.migrator;

import wt.part.WTPart;
import wt.part.WTPartMaster;
import wt.query.ClassAttribute;
import wt.query.QuerySpec;
import wt.query.SearchCondition;
import wt.vc.views.View;
import wt.vc.views.ViewHelper;

/**
 * @클래스명 : Test.java
 * @최초 작성자 :
 * @최초 작성일 : 2025. 02. 06
 * @설명 :
 */
public class Test {

	/**
	 * @메소드명 :
	 * @최초 작성자 :
	 * @최초 작성일 : 2025. 02. 06
	 * @설명 :
	 */
	public static void main(String[] args) throws Exception {

		View view = ViewHelper.service.getView("Design");

		QuerySpec query = new QuerySpec();
		int idx_m = query.appendClassList(WTPartMaster.class, true);
		int idx_p = query.appendClassList(WTPart.class, true);

		ClassAttribute ca_m = new ClassAttribute(WTPartMaster.class, "thePersistInfo.theObjectIdentifier.id");
		ClassAttribute ca_p = new ClassAttribute(WTPart.class, "masterReference.key.id");
		SearchCondition sc = new SearchCondition(ca_m, "=", ca_p);
		query.appendWhere(sc, new int[] { idx_m, idx_p });
		query.appendAnd();

		sc = new SearchCondition(WTPartMaster.class, WTPartMaster.NUMBER, "=", "ASDASD");
		query.appendWhere(sc, new int[] { idx_m });
		query.appendAnd();

		sc = new SearchCondition(WTPart.class, "view.key.id", "=", view.getPersistInfo().getObjectIdentifier().getId());
		query.appendWhere(sc, new int[] { idx_p });

		System.out.println(query);

	}

}
