package cn.itedus.lottery.domain.award.service.impl;

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.domain.award.model.req.GiveAwardRequest;
import cn.itedus.lottery.domain.award.model.res.GiveAwardResult;
import cn.itedus.lottery.domain.award.service.DistributionBase;
import cn.itedus.lottery.domain.award.service.GiveAward;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-17
 */

//优惠券
@Component
public class DiscountCoupon extends DistributionBase implements GiveAward {
    @Override
    public GiveAwardResult doGiveAward(GiveAwardRequest giveAwardRequest) {
        // 模拟调用优惠券发放接口
        logger.info("模拟调用优惠券发放接口 uId：{} awardContent：{}", giveAwardRequest.getuId(), giveAwardRequest.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(giveAwardRequest.getuId(), giveAwardRequest.getOrderId(), giveAwardRequest.getAwardId(), Constants.GiveAwardState.SUCCESS.getCode(), Constants.GiveAwardState.SUCCESS.getInfo());

        return new GiveAwardResult(giveAwardRequest.getuId(), Constants.GiveAwardState.SUCCESS.getCode(), Constants.GiveAwardState.SUCCESS.getInfo());
    }
}
