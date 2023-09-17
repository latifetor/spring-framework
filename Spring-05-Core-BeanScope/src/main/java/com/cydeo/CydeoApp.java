package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        // Bean Scope = default singleton
//        CommentService cs1 = context.getBean(CommentService.class);
//        CommentService cs2 = context.getBean(CommentService.class);
//
//        // print all the objects: memory_allocation which is the same for both cs1 and cs2
//        System.out.println(cs1); // com.cydeo.service.CommentService@5a45133e
//        System.out.println(cs2); // com.cydeo.service.CommentService@5a45133e
//
//        // comparing the object
//        // true: these two objects cs1 and cs2 are the same object
//        // even though creating in different names
//        System.out.println(cs1 == cs2); // true
//
//        // Bean Scope = Prototype scope
//        CommentService cs3 = context.getBean(CommentService.class);
//        CommentService cs4 = context.getBean(CommentService.class);
//
//        // print all the objects: memory_allocation which is the same for both cs3 and cs4
//        System.out.println(cs3); // com.cydeo.service.CommentService@65c7a252
//        System.out.println(cs4); // com.cydeo.service.CommentService@4d154ccd
//
//        // comparing the object
//        // false: these two objects cs3 and cs4 are different objects
//        System.out.println(cs3 == cs4); // false


    }

}
