package com.ghq.service;

import java.util.List;

import com.ghq.pojo.BaseDict;

public interface BaseDictService {
	/**
	 * 根据类别代码查询
	 * 
	 * @param dictTypeCode
	 * @return
	 */
	List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode);

}
