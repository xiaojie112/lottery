package cn.itedus.lottery.domain.award.service.factory;

import cn.itedus.lottery.domain.award.service.GiveAward;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-17
 */
//todo Component和service的区别
@Service
public class GiveAwardFactory extends FactoryConfig {
    public GiveAward getGiveAwardService(Integer awardType){
        return giveAwardServiceMap.get(awardType);
    }
}
