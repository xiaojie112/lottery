package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.domain.activity.model.vo.AlterStatusVO;
import cn.itedus.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-16
 */
@Mapper
public interface IActivityDao {

   /**
    * 插入数据
    * @param req 入参
    */
   void insert(Activity req);

   /**
    * 根据活动号查询活动信息
    * @param activityId 活动号
    * @return 活动信息
    */
   Activity queryActivityById(Long activityId);


   /**
    * 变更活动的状态
    * @param alterStatusVO
    * @return
    */
   Integer alterStatus(AlterStatusVO alterStatusVO);
}
