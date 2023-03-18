package cn.itedus.lottery.domain.activity.service.stateflow.concrete;

import ch.qos.logback.core.joran.spi.ConsoleTarget;
import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.common.Result;
import cn.itedus.lottery.domain.activity.model.vo.AlterStatusVO;
import cn.itedus.lottery.domain.activity.service.stateflow.AbstractState;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-18
 */
@Component
public class Arraignment extends AbstractState {

//    @Override
//    public Result arraignment(Long activityId, Enum<Constants.ActivityState> curState){
//        return Result.buildErrorResult("待审核状态不可重复提审");
//    }

    /**
     * 提审
     * @param activityId
     * @param
     * @return
     */
    @Override
    public Result arraignment(Long activityId, Enum<Constants.ActivityState> currentState){
        return Result.buildErrorResult("待审核状态不可重复提审");
    }


    /**
     * 活动撤审
     */
    @Override
    //todo 这里的curState可否考虑省去,因为从当前类就可以判断当前是什么状态
    public Result checkRevoke(Long activityId, Enum<Constants.ActivityState> currentState){
        //todo 这里是否可以考虑直接用AlterStatusVO包装传参
        /*
        这里是从提审状态撤销变成编辑状态
         */
        boolean isSuccess = activityRepository.alterActivityStatus(activityId, currentState, Constants.ActivityState.EDIT);
        return isSuccess ? Result.buildSuccessResult("撤审成功退回为编辑状态") : Result.buildErrorResult("活动状态变更失败");
    }

    /**
     * 活动通过
     */
    @Override
    public Result checkPass(Long activityId, Enum<Constants.ActivityState> currentState){
        boolean isSuccess = activityRepository.alterActivityStatus(activityId, currentState, Constants.ActivityState.PASS);
        return isSuccess ? Result.buildSuccessResult("提审通过变为通过状态") : Result.buildErrorResult("活动状态变更失败");
    }

    /**
     * 活动拒绝
     */
    @Override
    public Result checkRefuse(Long activityId, Enum<Constants.ActivityState> currentState){
        boolean isSuccess = activityRepository.alterActivityStatus(activityId, currentState, Constants.ActivityState.REFUSE);
        return isSuccess ? Result.buildSuccessResult("提审未通过成为拒绝状态") : Result.buildErrorResult("活动状态变更失败");
    }


    /**
     * 活动关闭
     */
    @Override
    public Result close(Long activityId, Enum<Constants.ActivityState> curState){
        return Result.buildErrorResult("待审核活动不可直接关闭");
    }

    /**
     * 活动开启
     */
    @Override
    public  Result open(Long activityId, Enum<Constants.ActivityState> curState){
        return Result.buildErrorResult("待审核活动不可直接开启");
    }


    /**
     * 活动中
     */
    @Override
    public Result doing(Long activityId, Enum<Constants.ActivityState> curState){
        return Result.buildErrorResult("待审核活动不可执行活动中变更");
    }


}
