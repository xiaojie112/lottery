package cn.itedus.lottery.domain.strategy.model.req;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-16
 */
public class DrawReq {

    // 用户ID
    private String uId;

    // 策略ID
    private Long strategyId;

    public DrawReq() {
    }

    public DrawReq(String uId, Long strategyId) {
        this.uId = uId;
        this.strategyId = strategyId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

}
