package com.damlaehican.taskproject.service;

import com.damlaehican.taskproject.dto.IssueDto;
import com.damlaehican.taskproject.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;


public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(Long issue);

    IssueDto update(Long id, IssueDto projectDto);

}
