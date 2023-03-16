package cn.itedus.lottery.domain.strategy.service.draw;

import cn.itedus.lottery.domain.strategy.model.req.DrawReq;
import cn.itedus.lottery.domain.strategy.model.res.DrawResult;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-16
 */
public interface IDrawExec {

    DrawResult doDrawExec(DrawReq req);

}
