package cn.itedus.lottery.domain.award.service;

import cn.itedus.lottery.domain.award.repository.IAwardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-17
 */

//todo 该类含义无法理解
public class DistributionBase {

    protected Logger logger = LoggerFactory.getLogger(DistributionBase.class);

    @Resource
    private IAwardRepository awardRepository;

    /**
     * 更新用户的领奖状态
     * @param uId
     * @param orderId
     * @param awardId
     * @param awardState
     * @param awardStateInfo
     */
    protected void updateUserAwardState(String uId, String orderId, String awardId, Integer awardState, String awardStateInfo) {
        // TODO 后期添加更新分库分表中，用户个人的抽奖记录表中奖品发奖状态
        logger.info("TODO 后期添加更新分库分表中，用户个人的抽奖记录表中奖品发奖状态 uId：{}", uId);
    }

}
