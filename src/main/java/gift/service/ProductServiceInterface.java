package gift.service;

import gift.dto.request.ProductRequestDto;
import gift.dto.request.ProductUpdateRequestDto;
import gift.dto.response.ProductResponseDto;
import gift.entity.Product;

interface ProductServiceInterface {

    Product getProduct(long productId);

    ProductResponseDto createProduct(ProductRequestDto productRequestDto);

    ProductResponseDto updateProduct(long productId,
        ProductUpdateRequestDto productUpdateRequestDto);

    void deleteProduct(long productId);

    boolean containsProduct(long productId);

}
