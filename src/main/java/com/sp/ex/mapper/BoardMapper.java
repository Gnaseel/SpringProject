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

	
	//---------------------ī�װ��� ������ �ҷ���
	public List<IDNameDTO> getLocationList();
	public List<IDNameDTO> getCategoryList();
	
	
	//--------------����ȭ�鿡 ���� �α� ����Ʈ, �ֽ� ����Ʈ ����� � �߷��� ��ȯ
	public List<postDTO> getHitPost();
	public List<postDTO> getRecentPost();
	
	//---------------------ī�װ��� ���� �Խñ��� �з��ؼ� ��ȯ
	public List<postDTO> getPostListByLocation(@Param("location")String location, @Param("startPost")int startPost, @Param("endPost")int endPost);
	public List<postDTO> getPostListByCategory(@Param("category")String category, @Param("startPost")int startPost, @Param("endPost")int endPost);
	//------------------------------÷������ �� �̹��� ó��
	public void writeFilePath(FileDTO fileDTO);
	public void writeImagePath(FileDTO fileDTO);
	public List<FileDTO> getFileList(@Param("postID")String postID);
	public FileDTO getImage(@Param("postID")String postID);
	
	public String getPostIDbyUser(String userID);
	
	public List<postDTO> viewAll();
}
