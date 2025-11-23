package com.xiaolin.pay.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaolin.pay.domain.dto.PayApplyDTO;
import com.xiaolin.pay.domain.dto.PayOrderFormDTO;
import com.xiaolin.pay.domain.po.PayOrder;

/**
 * <p>
 * 支付订单 服务类
 * </p>
 *
 * @author 小林
 * @since 2023-05-16
 */
public interface IPayOrderService extends IService<PayOrder> {

    String applyPayOrder(PayApplyDTO applyDTO);

    void tryPayOrderByBalance(PayOrderFormDTO payOrderFormDTO);
}
