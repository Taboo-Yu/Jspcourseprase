package com.webshop.service;

import java.util.List;

import com.webshop.entity.Comment;


public interface CommentService {

	List<Comment> getCommentByGoodsId(String goodsId);

	Comment getCommentByGoodsIdAndUserId(String goodsId, String userId);

	boolean addComment(Comment commentObj);
	
}
