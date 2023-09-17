package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope("prototype") or can be used
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    // @Autowired : Rule: if there is only one Constructor in the class, does not need to annotated with @Autowired
    public CommentService(CommentRepository commentRepository,
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    // Building the Business Logic purpose:  the publishComment ( )
    // Concept: Behavior Parameterization:
    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}