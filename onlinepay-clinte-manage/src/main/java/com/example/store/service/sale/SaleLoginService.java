package com.example.store.service.sale;

import com.example.store.model.request.RequestParam;
import com.example.store.model.sale.SaleInfo;

public interface SaleLoginService {

    SaleInfo findUserName(String username);

    SaleInfo addSaleInfo(RequestParam requestParam);
}
