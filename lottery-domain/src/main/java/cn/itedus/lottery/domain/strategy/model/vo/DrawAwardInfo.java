package cn.itedus.lottery.domain.strategy.model.vo;

/**
 * @description: 中奖奖品信息
 * @author：小傅哥，微信：fustack
 * @date: 2021/8/28
 * @Copyright： 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class DrawAwardInfo {

    /**
     * 奖品ID
     */
    private String awardId;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 奖品类型
     */

    private Integer awardType;


    /**
     * 奖品内容
     */
    private String content;


    public DrawAwardInfo() {
    }

    public DrawAwardInfo(String awardId, String awardName, Integer awardType, String content) {
        this.awardId = awardId;
        this.awardName = awardName;
        this.awardType = awardType;
        this.content = content;
    }


    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getAwardId() {
        return awardId;
    }

    public void setAwardId(String awardId) {
        this.awardId = awardId;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
