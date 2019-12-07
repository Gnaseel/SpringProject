package com.sp.ex.dto;

public class PagingDTO {
	private int range=5;			//������ ���� ����
	private int curPage=1;			//���� ������
	private int startPage=1;		//���� ����������
	private int endPage;			//���� ������������
	private int postCount;			//��ü ����Ʈ ����
	private int pageCount;			//��ü ������ ����
	private int listSize = 5;		//�� �������� ����Ʈ ����
	private boolean prev=true;		//���� ������ �ִ°�
	private boolean next=true;		//���� ������ �ִ°�
	private int startPost=1;		//�� �������� ���� ����Ʈ ��ȣ
	private int endPost;			//�� �������� �� ����Ʈ ��ȣ
	private String query;			//�˻� ������
	
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getPostCount() {
		return postCount;
	}
	public void setPostCount(int postNum) {
		this.postCount = postNum;
	}
	public int getListSize() {
		return listSize;
	}
	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public int getStartPost() {
		return startPost;
	}
	public void setStartPost(int startPost) {
		this.startPost = startPost;
	}
	public int getEndPost() {
		return endPost;
	}
	public void setEndPost(int endPost) {
		this.endPost = endPost;
	}
	public void setPageInfo(int curPage, int postCount,String query) {

		this.curPage=curPage;
		this.postCount=postCount;
		this.query=query;
		pageCount=(int)Math.ceil((double)postCount/listSize);
		startPage=(curPage-1)/range*range+1;
		endPage=startPage+range;
		if(startPage==1) {
			prev=false;
		}
		if(pageCount<=curPage) {
			curPage=pageCount;
		}
		if(pageCount<=endPage) {
			next=false;
			endPage=pageCount+1;
		}
		startPost=(curPage-1)*listSize+1;
		endPost=(curPage*listSize);
		System.out.println(startPost+" ���� "+endPost+" ����");
		System.out.println("���� ������ = "+curPage);
		System.out.println("���� ������ = "+startPage);
		System.out.println("�� ������ = "+endPage);
		System.out.println("��ü ������ = "+pageCount);
		System.out.println("������ư = "+prev);
		System.out.println("������ư = "+next);
	}
	
}
