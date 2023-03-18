package cn.itedus.lottery.domain.activity.service.deploy;

import cn.itedus.lottery.domain.activity.model.req.ActivityConfigReq;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-17
 */
public interface IActivityDeploy {

    /**
     * 创建活动信息
     * @param req 活动配置信息
     */
    public void createActivity(ActivityConfigReq req);


    /**
     * 修改活动信息
     * @param req
     */
    public void updateActivity(ActivityConfigReq req);
}
