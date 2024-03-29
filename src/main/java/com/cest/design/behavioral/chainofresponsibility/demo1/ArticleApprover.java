package com.cest.design.behavioral.chainofresponsibility.demo1;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * 验证手记
 */
@Slf4j
public class ArticleApprover extends Approver{
    @Override
    public void chkCourse(Course course) {
        if(StringUtils.isNotEmpty(course.getArticle())){
            log.info("{}的课程手记验证成功",course.getName());
            if(super.approver != null){
                super.approver.chkCourse(course);
            }
        }else {
            log.info("{}的课程手记验证失败",course.getName());
            return;
        }
    }
}
