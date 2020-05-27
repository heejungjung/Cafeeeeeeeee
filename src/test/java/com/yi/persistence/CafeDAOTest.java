package com.yi.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.Criteria;
import com.yi.domain.SearchCriteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class CafeDAOTest {
	
	@Autowired
	private CafeDAO dao;
	
	//@Test
	public void test08ListCriteria() throws Exception {
		SearchCriteria cri = new SearchCriteria(); //페이지 번호, 페이지당 display 게시글 갯수
		cri.setPage(1);
		cri.setPerPageNum(20);
		dao.listSearchCriteria(cri);
		
	}
	
//	@Test
	public void testDAO() throws Exception {
		System.out.println(dao);
		
	}
	
	//@Test
	public void testCafeMainSearch() throws Exception {
		SearchCriteria cri = new SearchCriteria();
		cri.setSearchTheme("3");
		String themeNos = "1,3,";
		
		System.out.println("SearchCriteria -------------------------" + cri);
		dao.cafeMainSearch(0, themeNos, cri);
		dao.cafeMainSearchTotalCnt(0, themeNos, cri);
	}
	
	//@Test
	public void testMonthBestSPoint() throws Exception {
		dao.monthBestSPoint();
	}

	//@Test
	public void testMonthBestCafe() throws Exception {
		dao.monthBestCafe();
	}

}
