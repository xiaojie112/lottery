package cn.itedus.lottery.domain.activity.repository;

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.domain.activity.model.vo.*;

import java.util.List;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-17
 */
public interface IActivityRepository {
    /**
     * 添加活动配置
     * @param activity 活动配置
     */
    void addActivity(ActivityVO activity);

    /**
     * 添加奖品配置集合
     *
     * @param awardList 奖品配置集合
     */
    void addAward(List<AwardVO> awardList);

    /**
     * 添加策略配置
     *
     * @param strategy 策略配置
     */
    void addStrategy(StrategyVO strategy);

    /**
     * 添加策略明细配置
     *
     * @param strategyDetailList 策略明细集合
     */
    void addStrategyDetailList(List<StrategyDetailVO> strategyDetailList);

    /**
     * 变更活动的状态
     * @param
     * @return
     */
    //todo 为什么需要修改前后的状态，避免两个业务人员同时修改状态
    boolean alterActivityStatus(Long activityId, Enum<Constants.ActivityState> curState, Constants.ActivityState edit);
}
