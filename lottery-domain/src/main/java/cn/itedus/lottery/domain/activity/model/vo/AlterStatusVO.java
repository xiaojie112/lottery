package cn.itedus.lottery.domain.activity.model.vo;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-18
 */
public class AlterStatusVO {
    /** 活动ID */
    private Long activityId;

    /** 更新前状态 */
    private Integer beforeState;

    /** 更新后状态 */
    private Integer afterState;

    public AlterStatusVO() {
    }

    public AlterStatusVO(Long activityId, Integer beforeState, Integer afterState) {
        this.activityId = activityId;
        this.beforeState = beforeState;
        this.afterState = afterState;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }



    public Integer getBeforeState() {
        return beforeState;
    }

    public void setBeforeState(Integer beforeState) {
        this.beforeState = beforeState;
    }

    public Integer getAfterState() {
        return afterState;
    }

    public void setAfterState(Integer afterState) {
        this.afterState = afterState;
    }

    @Override
    public String toString() {
        return "AlterStatusVO{" +
                "activityId=" + activityId +
                ", beforeState=" + beforeState +
                ", afterState=" + afterState +
                '}';
    }

}
