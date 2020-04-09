package com.taotao.service;

import com.taotao.common.pojo.EUDateGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {

    TbItem getTtemById(Long itemId);

    EUDateGridResult getItemList(int page, int rows);

}
