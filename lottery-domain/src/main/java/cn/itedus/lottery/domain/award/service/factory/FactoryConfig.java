package cn.itedus.lottery.domain.award.service.factory;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-17
 */

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.domain.award.service.GiveAward;
import cn.itedus.lottery.domain.award.service.impl.ChangeCode;
import cn.itedus.lottery.domain.award.service.impl.DiscountCoupon;
import cn.itedus.lottery.domain.award.service.impl.RealGood;
import cn.itedus.lottery.domain.award.service.impl.TextDescService;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * 配置类，配置工厂类可以提供的发奖服务
 */
public class FactoryConfig {
    protected Map<Integer, GiveAward> giveAwardServiceMap = new ConcurrentHashMap<>();

    @Resource
    ChangeCode changeCode;

    @Resource
    DiscountCoupon discountCoupon;

    @Resource
    RealGood realGood;

    @Resource
    TextDescService textDescService;

    @PostConstruct
    private void initServiceMap(){
        giveAwardServiceMap.put(Constants.AwardType.CHANGECODE.getType(), changeCode);
        giveAwardServiceMap.put(Constants.AwardType.COUPON.getType(), discountCoupon);
        giveAwardServiceMap.put(Constants.AwardType.REAL.getType(), realGood);
        giveAwardServiceMap.put(Constants.AwardType.TEXT.getType(), textDescService);
    }
}
