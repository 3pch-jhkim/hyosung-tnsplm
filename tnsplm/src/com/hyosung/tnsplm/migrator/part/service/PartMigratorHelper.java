package com.hyosung.tnsplm.migrator.part.service;

import wt.part.WTPart;
import wt.part.WTPartMaster;
import wt.query.ClassAttribute;
import wt.query.QuerySpec;
import wt.query.SearchCondition;
import wt.services.ServiceFactory;
import wt.vc.views.View;
import wt.vc.views.ViewHelper;

public class PartMigratorHelper {

	public static final PartMigratorService service = ServiceFactory.getService(PartMigratorService.class);

	public static final PartMigratorHelper manager = new PartMigratorHelper();

	public static final String E_VIEW = "Engineering";
	public static final String M_VIEW = "Manufacturing";

	/**
	 * @메소드명 :
	 * @최초 작성자 :
	 * @최초 작성일 : 2025. 02. 07
	 * @설명 :
	 */
	public WTPart getWTPartByView(String number, String viewName) throws Exception {

		View view = getView(viewName);

		WTPart part = null;

		QuerySpec query = new QuerySpec();
		int idx_m = query.appendClassList(WTPartMaster.class, true);
		int idx_p = query.appendClassList(WTPart.class, true);

		ClassAttribute ca_m = new ClassAttribute(WTPartMaster.class, "hePersistInfo.theObjectIdentifier.id");
		ClassAttribute ca_p = new ClassAttribute(WTPart.class, "	masterReference.key.id");
		SearchCondition sc = new SearchCondition(ca_m, "=", ca_p);
		query.appendWhere(sc, new int[] { idx_m, idx_p });

		return part;

	}

	/**
	 * @메소드명 :
	 * @최초 작성자 :
	 * @최초 작성일 : 2025. 02. 07
	 * @설명 :
	 */
	public View getView(String viewName) throws Exception {
		View view = null;
		if ("E".equals(viewName)) {
			view = ViewHelper.service.getView(E_VIEW);
		} else if ("M".equals(viewName)) {
			view = ViewHelper.service.getView(M_VIEW);
		}
		return view;
	}
}
