package com.ghq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghq.mapper.BaseDictMapper;
import com.ghq.pojo.BaseDict;
import com.ghq.service.BaseDictService;

@Service
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictMapper baseDictMapper;
	
	@Override
	public List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode) {
		List<BaseDict> list = baseDictMapper.queryBaseDictByDictTypeCode(dictTypeCode);
		return list;

	}

}
