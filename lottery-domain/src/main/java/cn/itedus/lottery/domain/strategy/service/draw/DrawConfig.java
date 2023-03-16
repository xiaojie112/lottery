package cn.itedus.lottery.domain.strategy.service.draw;

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-16
 */
public class DrawConfig {

    @Resource
    private IDrawAlgorithm entiretyRateRandomDrawAlgorithm;

    @Resource
    private IDrawAlgorithm singleRateRandomDrawAlgorithm;

    protected static Map<Integer, IDrawAlgorithm> drawAlgorithmGroup = new ConcurrentHashMap<>();

    //todo postconstruct
    @PostConstruct
    public void init() {
        drawAlgorithmGroup.put(Constants.StrategyMode.SINGLE.getCode(), singleRateRandomDrawAlgorithm);
        drawAlgorithmGroup.put(Constants.StrategyMode.ENTIRETY.getCode(), entiretyRateRandomDrawAlgorithm);
    }

}
