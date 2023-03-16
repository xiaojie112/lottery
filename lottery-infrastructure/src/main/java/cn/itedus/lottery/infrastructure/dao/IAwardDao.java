package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-16
 */
@Mapper
public interface IAwardDao {

    /**
     * 根据奖品id查询奖品信息
     * @param awardId 奖品id
     * @return  奖品信息
     */
    Award queryAwardInfo(String awardId);

}
