package tr.com.burakgul.profileapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.burakgul.profileapi.model.dto.ProjectDTO;
import tr.com.burakgul.profileapi.service.ProjectService;
import java.util.List;

import javax.xml.ws.Response;

@RestController
@RequiredArgsConstructor
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping(params = "id")
    public ResponseEntity<ProjectDTO> findProject(@RequestParam Long id){
        return ResponseEntity.ok(this.projectService.findProject(id));
    }

    @GetMapping
    public ResponseEntity<List<ProjectDTO>> findAll(){
        return ResponseEntity.ok(this.projectService.findAll());
    }

    @PostMapping
    public ResponseEntity<ProjectDTO> saveProject(@RequestBody ProjectDTO project){
        return ResponseEntity.ok(this.projectService.saveProject(project));
    }

    @PutMapping(params = "id")
    public ResponseEntity<ProjectDTO> updateProjectDescription(@RequestBody ProjectDTO project, @RequestParam Long id){
        return ResponseEntity.ok(this.projectService.updateProjectDescription(project, id));
    }

}
