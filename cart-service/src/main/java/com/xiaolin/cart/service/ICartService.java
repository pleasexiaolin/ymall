package com.xiaolin.cart.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaolin.cart.domain.dto.CartFormDTO;
import com.xiaolin.cart.domain.po.Cart;
import com.xiaolin.cart.domain.vo.CartVO;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 订单详情表 服务类
 * </p>
 *
 * @author 小林
 * @since 2023-05-05
 */
public interface ICartService extends IService<Cart> {

    void addItem2Cart(CartFormDTO cartFormDTO);

    List<CartVO> queryMyCarts();

    void removeByItemIds(Collection<Long> itemIds);
}
