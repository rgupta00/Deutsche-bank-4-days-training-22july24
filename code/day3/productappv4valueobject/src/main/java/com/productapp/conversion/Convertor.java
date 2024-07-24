package com.productapp.conversion;

import com.productapp.entities.ProductEntity;
import com.productapp.vo.ProductVO;

public class Convertor {

	public static ProductEntity toProductEntity(ProductVO productVO) {
		ProductEntity entity=new ProductEntity();
		entity.setId(productVO.getId());
		entity.setName(productVO.getName());
		entity.setPrice(productVO.getPrice());
		
		return entity;
	}
	public static ProductVO toProductVO(ProductEntity entity) {
		ProductVO vo=new ProductVO();
		vo.setId(entity.getId());
		vo.setName(entity.getName());
		vo.setPrice(entity.getPrice());
		return vo;
	}
}
