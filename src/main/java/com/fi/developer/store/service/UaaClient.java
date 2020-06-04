package com.fi.developer.store.service;

import com.fi.developer.store.client.AuthorizedUserFeignClient;
import com.fi.developer.store.domain.Product;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@AuthorizedUserFeignClient(name = "cart"/*, fallback = UaaClientFallback.class*/)
public interface UaaClient {

    @RequestMapping(method = RequestMethod.POST, value = "/api/addProduct")
    Product createCart(@RequestBody Product product);
}
