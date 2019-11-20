package com.woniu.domain;

import java.util.List;

public class Page<T> {
	private int size; //每页行数
	private int index; //当前页
	private int totalCount; //总条数
	private int totalPageCount; //总页数
	private int prev; //上一页
	private int next; //下一页
	private List<T> data;
	
	
	public Page() {
		super();
	}
	public Page(int index,int totalCount,int size) {
		this.index = index;
		this.totalCount=totalCount;
		this.size=size;
		
		this.totalPageCount= (int)Math.ceil(this.totalCount*1.0/size);
		
		if( index > this.totalPageCount) this.index = totalPageCount;
		if( index < 1 ) this.index = 1;
		
		this.prev=index-1;
		this.next=index+1;
//		
//		startLine=(p-1)*size;
//		
//		if(maxPage<10) {
//			startPage=1;
//			endPage=maxPage;
//		}else {
//			startPage=p-5;
//			endPage=p+4;
//			if(startPage<1) {
//				startPage=1;
//				endPage=10;
//			}
//			if(endPage>maxPage) {
//				startPage=maxPage-9;
//				endPage=maxPage;
//			}
//		}
	}
	/**
	 * 开始行
	 * @return
	 */
	public int getStartRow() {
		return (index-1) * size;
	}
	/**
	 * 结束行
	 * @return
	 */
	public int getEndRow() {
		return index * size;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(Integer size) {
		if(size > 0) {
			this.size = size;
		}
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public int getPrev() {
		return prev;
	}
	public void setPrev(int prev) {
		this.prev = prev;
	}
	public int getNext() {
		return next;
	}
	public void setNext(int next) {
		this.next = next;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Page [size=" + size + ", index=" + index + ", totalCount=" + totalCount + ", totalPageCount="
				+ totalPageCount + ", prev=" + prev + ", next=" + next + "]";
	}

	
	
}
