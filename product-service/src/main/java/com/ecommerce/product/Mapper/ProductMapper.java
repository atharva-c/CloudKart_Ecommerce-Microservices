package com.ecommerce.product.Mapper;

import com.ecommerce.product.dto.ProductDto;
import com.ecommerce.product.entity.Category;
import com.ecommerce.product.entity.Product;

public class ProductMapper {

    public ProductDto toProductDto(Product product) {

        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .discountPrice(product.getDiscountPrice())
                .quantity(product.getQuantity())
                .brand(product.getBrand())
                .imageUrl(product.getImageUrl())
                .categoryId(product.getCategory().getId())
                .build();
    }

    public Product toProductEntity(ProductDto productDto, Category category) {
        return Product.builder()
                .name(productDto.getName())
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .discountPrice(productDto.getDiscountPrice())
                .quantity(productDto.getQuantity())
                .imageUrl(productDto.getImageUrl())
                .brand(productDto.getBrand())
                .imageUrl(productDto.getImageUrl())
                .category(category)
                .build();
    }
}
