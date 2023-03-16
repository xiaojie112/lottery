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

    Award queryAwardInfo(String awardId);

}