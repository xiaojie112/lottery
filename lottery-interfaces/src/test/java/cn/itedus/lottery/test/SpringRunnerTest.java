package cn.itedus.lottery.test;

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.domain.award.model.req.GiveAwardRequest;
import cn.itedus.lottery.domain.award.model.res.GiveAwardResult;
import cn.itedus.lottery.domain.award.service.GiveAward;
import cn.itedus.lottery.domain.award.service.factory.GiveAwardFactory;
import cn.itedus.lottery.domain.strategy.model.req.DrawReq;
import cn.itedus.lottery.domain.strategy.model.res.DrawResult;
import cn.itedus.lottery.domain.strategy.model.vo.AwardRateInfo;
import cn.itedus.lottery.domain.strategy.model.vo.DrawAwardInfo;
import cn.itedus.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import cn.itedus.lottery.domain.strategy.service.draw.IDrawExec;
import cn.itedus.lottery.infrastructure.dao.IActivityDao;
import cn.itedus.lottery.infrastructure.dao.IAwardDao;
import cn.itedus.lottery.infrastructure.po.Activity;
import cn.itedus.lottery.infrastructure.po.Award;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTest {

    private Logger logger = LoggerFactory.getLogger(SpringRunnerTest.class);

    @Resource
    private IActivityDao activityDao;

    @Resource
    private IAwardDao awardDao;

    @Resource
    private IDrawExec drawExec;

    @Resource
    private GiveAwardFactory giveAwardFactory;

    @Test
    public void test_giveAward(){
        DrawResult drawResult = drawExec.doDrawExec(new DrawReq("Damon",10001l));
        if(Constants.DrawState.FAIL.equals(drawResult.getDrawState())){
            logger.info("没有中奖");
            return;
        }

        //中奖成功进行发奖
        DrawAwardInfo drawAwardInfo = drawResult.getDrawAwardInfo();
        Award award = awardDao.queryAwardInfo(drawAwardInfo.getRewardId());
        GiveAward giveAwardService = giveAwardFactory.getGiveAwardService(award.getAwardType());
        GiveAwardResult giveAwardResult = giveAwardService.doGiveAward(new GiveAwardRequest(drawResult.getuId(), "orderID", award.getAwardId(), award.getAwardName(), award.getAwardContent()));
        logger.info("用户{}，发奖状态:{}",giveAwardResult.getuId(), giveAwardResult.getInfo());
    }


    @Test
    public void test_drawExec() {
        drawExec.doDrawExec(new DrawReq("小傅哥", 10001L));
        drawExec.doDrawExec(new DrawReq("小佳佳", 10001L));
        drawExec.doDrawExec(new DrawReq("小蜗牛", 10001L));
        drawExec.doDrawExec(new DrawReq("八杯水", 10001L));
    }

    @Test
    public void test_insert() {
        Activity activity = new Activity();
        activity.setActivityId(100001L);
        activity.setActivityName("测试活动");
        activity.setActivityDesc("仅用于插入数据测试");
        activity.setBeginDateTime(new Date());
        activity.setEndDateTime(new Date());
        activity.setStockCount(100);
        activity.setTakeCount(10);
        activity.setState(0);
        activity.setCreator("xiaofuge");
        activityDao.insert(activity);
    }

    @Test
    public void test_select() {
        Activity activity = activityDao.queryActivityById(100001L);
        logger.info("测试结果：{}", JSON.toJSONString(activity));
    }

}
