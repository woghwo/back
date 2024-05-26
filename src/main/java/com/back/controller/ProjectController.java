package com.back.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {
    private final ProjectService projectService;

    /**
     * 프로젝트 추가
     */
    @PostMapping("/addProject")
    public ResponseVo createProject(@RequestBody ProjectVo projectVo) {
        return projectService.insertProject(projectVo);
    }


    /** test */
    @GetMapping("allProject")
    public ResponseVo<ProjectVo> selectAll() {
        return projectService.selectAll();
    }


}
