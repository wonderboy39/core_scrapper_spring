package com.spring.scrapper.board.video.vo;

import java.util.Date;

public class VideoBoardVO {
	private int postId;
	private String content;
	private int writerId;
	private int parentId;
	private Date createDate;
	private Date modifyDate;
	private String deleteFlag;
	
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getWriterId() {
		return writerId;
	}
	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	@Override
	public String toString() {
		return "VideoBoardVO [postId=" + postId + ", content=" + content + ", writerId=" + writerId + ", parentId="
				+ parentId + ", createDate=" + createDate + ", modifyDate=" + modifyDate + ", deleteFlag=" + deleteFlag
				+ "]";
	}
}
