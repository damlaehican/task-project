package com.damlaehican.taskproject.dto;

import com.damlaehican.taskproject.entity.IssueStatus;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class IssueUpdateDto {
    @ApiModelProperty(required = true,value = "ID")
    private Long id;
    @ApiModelProperty(required = true,value = "Description")
    private String description;
    @ApiModelProperty(required = true,value = "Issue Details")
    private String details;
    @ApiModelProperty(required = true,value = "Date")
    private Date date;
    @ApiModelProperty(required = true,value = "Issue Status")
    private IssueStatus issueStatus;
    @ApiModelProperty(required = true,value = "Assignee")
    private Long assignee_id;
    @ApiModelProperty(required = true,value = "Project")
    private Long project_id;
}
