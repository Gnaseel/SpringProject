package com.sp.ex.dto;

public class PagingDTO {
	private int range=50;		//������ ���� ����
	private int curPage=1;	//���� ������
	private int startPage=1;	//���� ����������
	private int endPage;	//���� ������������
	private int postCount;	//��ü ����Ʈ ����
	private int pageCount;	//��ü ������ ����
	private int listSize = 10;	//�� �������� ����Ʈ ����
	private boolean prev=true;	//���� ������ �ִ°�
	private boolean next=true;	//���� ������ �ִ°�
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
	
	public void setPageInfo(int curPage, int postCount) {
		this.curPage=curPage;
		this.postCount=postCount;
		
		pageCount=(int)Math.ceil((double)postCount/listSize);
		startPage=this.curPage*(range-1)/range+1;
		endPage=startPage+range;
		if(startPage==1) {
			prev=false;
		}
		if(pageCount<curPage+range) {
			next=false;
		}
	}
	
}
