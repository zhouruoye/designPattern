package com.cest.design.behavioral.chainofresponsibility.demo1;

public class Test {

    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver sourceApprover = new SourceApprover();
        Approver videoApprover = new VideoApprover();

        //    实例化对象
        Course course = new Course();
        course.setArticle("手记");
        course.setName("张三");
        course.setSource("源码");
        course.setVedio("视频");

        sourceApprover.setNextApprover(videoApprover);
        articleApprover.setNextApprover(sourceApprover);

        articleApprover.chkCourse(course);
    }
}
