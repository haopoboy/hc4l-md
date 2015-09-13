package hc4l.course.repository;

import hc4l.course.entity.User;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
}