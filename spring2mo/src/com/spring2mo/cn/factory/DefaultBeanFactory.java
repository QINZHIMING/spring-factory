package com.spring2mo.cn.factory;

import com.spring2mo.cn.bean.BeanModelDef;

public class DefaultBeanFactory extends AbstractBeanInsert implements BeanFactory {

	@Override
	public Object getBean(String name) {	
		BeanModelDef model = super.get(name);
		Object object = super.getInCache(name);
		if(null != object) {
			return object;
		}
		try {
			object = Class.forName(model.getBeanClassName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getBean(String name, Class<T> T) {
		return (T) this.getBean(name);
	}

	@Override
	public <T> T getBean(Class<T> T) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addModel(String name, String path, String scope) {
		BeanModelDef def = new BeanModelDef();
		def.setBeanName(name);
		def.setBeanClassName(path);
		def.setScope(scope);
		this.addBean(def);
	}

}
