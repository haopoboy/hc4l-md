package hc4l.course.repository;


import hc4l.course.Run;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.support.Repositories;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@Run
public class RepositoriesTests {

	@Inject Repositories repositories;
	
	@Before
	public void save() {
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void findByFirstPage() throws InstantiationException, IllegalAccessException {
		for (Class<?> entityClass : repositories) {
			Pageable pageable = new PageRequest(0, 1);
			PagingAndSortingRepository repo = (PagingAndSortingRepository) repositories.getRepositoryFor(entityClass);
			repo.findAll(pageable);
		}
	}
}
