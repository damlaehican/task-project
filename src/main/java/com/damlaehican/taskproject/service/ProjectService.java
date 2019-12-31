package com.damlaehican.taskproject.service;

import com.damlaehican.taskproject.dto.ProjectDto;
import com.damlaehican.taskproject.entity.Issue;
import com.damlaehican.taskproject.entity.Project;
import com.damlaehican.taskproject.entity.User;
import com.damlaehican.taskproject.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    Project getByProjectCode(String projectCode);

    List<ProjectDto> getByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete(ProjectDto project);

    ProjectDto update(Long id, ProjectDto projectDto);
}
