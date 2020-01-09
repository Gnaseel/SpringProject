package com.sp.ex.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sp.ex.dto.*;
public interface BoardMapper {
	//---------------�Խñ� �� ��� �ۼ�
	public int createPost(postDTO dto);
	public void createComment(CommentDTO dto);

	public postDTO showPost(int idx);
	public int getPostCount();
	
	public int getLastPostNum(); //���� post Num ���ϱ�(���� ������ ������ ������ ������ Ȯ��)
	//--------------------�Խñ� ���
	public List<postDTO> getPostList(PagingDTO pageDTO);
	public List<CommentDTO> getCommentList(int postNum);
	public List<postDTO> getSearchedPostList(PagingDTO pageDTO);

	public List<IDNameDTO> getLocationList();
	public List<IDNameDTO> getCategoryList();
	
	public List<postDTO> getHitPost();
	public List<postDTO> getRecentPost();
	
	//------------------------------÷������ �� �̹��� ó��
	public void writeFilePath(FileDTO fileDTO);
	public void writeImagePath(FileDTO fileDTO);
	public List<FileDTO> getFileList(@Param("postID")String postID);
	public FileDTO getImage(@Param("postID")String postID);
	
	public String getPostIDbyUser(String userID);
	
	public List<postDTO> viewAll();
}
