package cn.itedus.lottery.domain.strategy.model.vo;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-17
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
