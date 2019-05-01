package com.spring2mo.cn.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.spring2mo.cn.bean.BeanModelDef;

public abstract class AbstractBeanInsert {
	
	protected Map<String, BeanModelDef> beans = new HashMap<String, BeanModelDef>();
	
	private Map<String, Object> cacheSington = new ConcurrentHashMap<String, Object>();
	
	protected void addBean(BeanModelDef beanModelDef) {
		beans.put(beanModelDef.getBeanName(), beanModelDef);
		if(null != beanModelDef.getScope() && beanModelDef.getScope().equals("sington")) {
			try {
				cacheSington.put(beanModelDef.getBeanName(), Class.forName(beanModelDef.getBeanClassName()).newInstance());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
		}}
	}
	
	protected void fresh() {
		
	}
	
	protected BeanModelDef get(String name) {
		return beans.get(name);
	}
	
	protected Object getInCache(String name) {
		return cacheSington.get(name);
	}

}
