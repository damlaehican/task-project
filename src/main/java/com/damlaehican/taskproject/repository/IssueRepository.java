package com.damlaehican.taskproject.repository;

import com.damlaehican.taskproject.entity.Issue;
import com.damlaehican.taskproject.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IssueRepository extends JpaRepository<Issue, Long> {



}
