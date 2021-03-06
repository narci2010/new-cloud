package com.monitor.api.materialintoinventory;

import com.cloud.core.IService;
import com.monitor.model.materialintoinventory.PanoramicMaterialIntoInventory;

import java.util.List;


/**
* 物料出入库表
* @author summer
* 2017/12/27.
*/
public interface PanoramicMaterialIntoInventoryService extends IService<PanoramicMaterialIntoInventory> {

	/**
	 * 指定编码，时间和出入库种类查询入出库信息
	 * @param code
	 * @param type
	 * @param date
	 * @return
	 */
	List<PanoramicMaterialIntoInventory> findMaterialValue(String code, String type, String date);
	
	/**
	 * 当日入出库总量以及最新更新时间
	 * @param code
	 * @param type
	 * @param date
	 * @return
	 */
	PanoramicMaterialIntoInventory findSummaryByDate(String code,String type,String date);

}
