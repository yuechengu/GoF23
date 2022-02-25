package com.learning.factory.abs;

// 抽象产品工厂
public interface ProductFactory {

    PhoneProduct phoneProduct();

    RouterProduct routerProduct();
}
