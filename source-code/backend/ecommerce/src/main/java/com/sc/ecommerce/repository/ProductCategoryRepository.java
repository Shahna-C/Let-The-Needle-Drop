package com.sc.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sc.ecommerce.entity.ProductCategory;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
//overrides defaults where ('s) are added
// "productCategory" : Name of JSON entry
// path /product-category
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
