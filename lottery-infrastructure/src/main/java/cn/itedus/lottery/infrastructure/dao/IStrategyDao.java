package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-16
 */
@Mapper
public interface IStrategyDao {

    /**
     * 根据策略ID插叙策略配置信息
     * @param strategyId 策略ID
     * @return 策略信息
     */
    Strategy queryStrategy(Long strategyId);

    /**
     * 插入策略配置
     *
     * @param req 策略配置
     */
    void insert(Strategy req);

}
