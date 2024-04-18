package com.itbank.service;

public class Paging {
	private int reqPage;				// 사용자가 요청한 페이지
	private int totalBoard;				// 총 게시글 수
	private int boardCount = 20;		// 한 페이지에 출력할 게시글 수
	private int totalPage;				// 전체 페이지 수
	private int offset;					// SQL에서 게시글을 가져올 시작점
	private int pageCount = 10;			// 한 페이지에 출력할 페이지 번호 수
	private int section;				// 페이지 번호 범위를 구분할 index 역할
	private int begin;					// 해당 section에서 첫 페이지 번호
	private int end;					// 해당 section에서 끝 페이지 번호
	private boolean prev, next;			// 이전/다음 section 존재 여부
	
	public Paging(int reqPage, int totalBoard) {
		// 1. 외부로 부터 전달 받아야 하는 데이터(요청 페이지, 전체 글 수)
		this.reqPage = reqPage;
		this.totalBoard = totalBoard;
		
		// 2. 전체 페이지 수를 구한다
		totalPage = totalBoard / boardCount;
		totalPage += (totalBoard % boardCount == 0) ? 0 : 1;
		
		// 3. 게시글을 분할에 필요한 offset을 구한다
		offset = (reqPage - 1) * boardCount;
		
		// 4. 페이지 숫자 범위 나누기
		section = (reqPage - 1) / pageCount;
		begin = section * pageCount + 1;
		end = (section + 1) * pageCount;
		
		end = (end < totalPage) ? end : totalPage;
		
		// 5. 이전/다음 section이 있는지 판별
		prev = section != 0;
		next = totalPage != end;
	}

	public int getReqPage() {
		return reqPage;
	}
	public void setReqPage(int reqPage) {
		this.reqPage = reqPage;
	}
	public int getTotalBoard() {
		return totalBoard;
	}
	public void setTotalBoard(int totalBoard) {
		this.totalBoard = totalBoard;
	}
	public int getBoardCount() {
		return boardCount;
	}
	public void setBoardCount(int boardCount) {
		this.boardCount = boardCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public boolean getPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean getNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}
	
}
