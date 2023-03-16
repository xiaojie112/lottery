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

/**
 * 文字描述
 */
//todo 不是很理解奖品类型是文字描述是什么意思
@Component
public class TextDescService extends DistributionBase implements GiveAward {
    @Override
    public GiveAwardResult doGiveAward(GiveAwardRequest giveAwardRequest) {
        /**
         * 更新用户的领奖状态
         */
        super.updateUserAwardState(giveAwardRequest.getuId(), giveAwardRequest.getOrderId(), giveAwardRequest.getAwardId(),
                Constants.GiveAwardState.SUCCESS.getCode(), Constants.GiveAwardState.SUCCESS.getInfo());

        return new GiveAwardResult  (giveAwardRequest.getuId(), Constants.GiveAwardState.SUCCESS.getCode(), Constants.GiveAwardState.SUCCESS.getInfo());
    }
}
