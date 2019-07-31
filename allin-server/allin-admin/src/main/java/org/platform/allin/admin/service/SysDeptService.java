package org.platform.allin.admin.service;

import java.util.List;

import org.platform.allin.admin.model.SysDept;
import org.platform.allin.core.service.CurdService;

/**
 * 机构管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @param userId 
	 * @return
	 */
	List<SysDept> findTree();
}
