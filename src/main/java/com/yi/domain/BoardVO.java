package com.yi.domain; //이 아이가 수정되엇습니당!board

import java.util.ArrayList;
import java.util.Date;

public class BoardVO {
	private int boardNo; // 寃뚯떆湲�踰덊샇
	private BoardKindsVO boardNo2; // 寃뚯떆�뙋踰덊샇
	private KeywordcateVO keySortNo; // �궎�썙�뱶遺꾨쪟踰덊샇
	private UsersVO userNo; // �쉶�썝踰덊샇
	private ZoneVO zoneNo; // 吏��뿭踰덊샇
	private ThemeVO themeNo; // �뀒留덈쾲�샇
	private CafeVO cafeNo; // 移댄럹踰덊샇
	private Condition writingLockCondition;// 湲� �옞湲덉뿬遺�
	private String writingTitle;// 湲��젣紐�
	private Date registrationDate;// �옉�꽦�씪
	private Date updateDate;// �닔�젙�씪
	private int viewNumber;// 議고쉶�닔
	private int voteNumber;// 異붿쿇�닔
	private String writingContent;// 湲��궡�슜
	private String address; // 異붽��맂二쇱냼(臾닿퉴�씤 異붿쿇 -> �깉濡쒖슫 移댄럹 二쇱냼)
	private ArrayList<ImageVO> files; // �씠誘몄�, Image �뀒�씠釉붿뿉�꽌 �뙆�씪 �씠由꾩쓣 媛��졇�샂
	private ArrayList<String> stringFiles; // -- �엫�떆濡� �깮�꽦
	private Condition boardDelCdt; // �궘�젣�뿬遺��뙋�떒
	private int replyCnt;

	public BoardVO() {
		// TODO Auto-generated constructor stub
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public BoardKindsVO getBoardNo2() {
		return boardNo2;
	}

	public void setBoardNo2(BoardKindsVO boardNo2) {
		this.boardNo2 = boardNo2;
	}

	public KeywordcateVO getKeySortNo() {
		return keySortNo;
	}

	public void setKeySortNo(KeywordcateVO keySortNo) {
		this.keySortNo = keySortNo;
	}

	public UsersVO getUserNo() {
		return userNo;
	}

	public void setUserNo(UsersVO userNo) {
		this.userNo = userNo;
	}

	public ZoneVO getZoneNo() {
		return zoneNo;
	}

	public void setZoneNo(ZoneVO zoneNo) {
		this.zoneNo = zoneNo;
	}

	public ThemeVO getThemeNo() {
		return themeNo;
	}

	public void setThemeNo(ThemeVO themeNo) {
		this.themeNo = themeNo;
	}

	public Condition getWritingLockCondition() {
		return writingLockCondition;
	}

	public void setWritingLockCondition(Condition writingLockCondition) {
		this.writingLockCondition = writingLockCondition;
	}

	public String getWritingTitle() {
		return writingTitle;
	}

	public void setWritingTitle(String writingTitle) {
		this.writingTitle = writingTitle;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getViewNumber() {
		return viewNumber;
	}

	public void setViewNumber(int viewNumber) {
		this.viewNumber = viewNumber;
	}

	public int getVoteNumber() {
		return voteNumber;
	}

	public void setVoteNumber(int voteNumber) {
		this.voteNumber = voteNumber;
	}

	public String getWritingContent() {
		return writingContent;
	}

	public void setWritingContent(String writingContent) {
		this.writingContent = writingContent;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CafeVO getCafeNo() {
		return cafeNo;
	}

	public void setCafeNo(CafeVO cafeNo) {
		this.cafeNo = cafeNo;
	}

	public ArrayList<ImageVO> getFiles() {
		return files;
	}

	public void setFiles(ArrayList<ImageVO> files) {
		this.files = files;
	}

	public Condition getBoardDelCdt() {
		return boardDelCdt;
	}

	public void setBoardDelCdt(Condition boardDelCdt) {
		this.boardDelCdt = boardDelCdt;
	}

	public ArrayList<String> getStringFiles() {
		return stringFiles;
	}

	public void setStringFiles(ArrayList<String> stringFiles) {
		this.stringFiles = stringFiles;
	}

	public int getReplyCnt() {
		return replyCnt;
	}

	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}

	@Override
	public String toString() {
		return String.format(
				"BoardVO [boardNo=%s, boardNo2=%s, keySortNo=%s, userNo=%s, zoneNo=%s, themeNo=%s, cafeNo=%s, writingLockCondition=%s, writingTitle=%s, registrationDate=%s, updateDate=%s, viewNumber=%s, voteNumber=%s, writingContent=%s, address=%s, files=%s, stringFiles=%s, boardDelCdt=%s, replyCnt=%s]",
				boardNo, boardNo2, keySortNo, userNo, zoneNo, themeNo, cafeNo, writingLockCondition, writingTitle,
				registrationDate, updateDate, viewNumber, voteNumber, writingContent, address, files, stringFiles,
				boardDelCdt, replyCnt);
	}

}
