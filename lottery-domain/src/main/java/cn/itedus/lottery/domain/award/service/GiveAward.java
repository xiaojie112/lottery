package cn.itedus.lottery.domain.award.service;

import cn.itedus.lottery.domain.award.model.req.GiveAwardRequest;
import cn.itedus.lottery.domain.award.model.res.GiveAwardResult;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-17
 */


public interface GiveAward {

    /**
     * 发放奖品服务接口，奖品类型有多种，因此发放不同种类的奖品也需要不同类型的奖品服务
     * @param giveAwardRequest 发奖请求
     * @return 发奖结果
     */
    public GiveAwardResult doGiveAward(GiveAwardRequest giveAwardRequest);
}
