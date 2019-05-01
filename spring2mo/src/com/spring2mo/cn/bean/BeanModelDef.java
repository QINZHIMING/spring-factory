package com.spring2mo.cn.bean;

import java.util.Map;

/*
 * 
 */
public class BeanModelDef {
	
	private String beanName;
	
	private String beanClassName;
	
	private Map<String, BeanModelDef> refs = null;
	
	private String scope = "propotype";

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanClassName() {
		return beanClassName;
	}

	public void setBeanClassName(String beanClassName) {
		this.beanClassName = beanClassName;
	}

	public Map<String, BeanModelDef> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, BeanModelDef> refs) {
		this.refs = refs;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}
	
	

}
