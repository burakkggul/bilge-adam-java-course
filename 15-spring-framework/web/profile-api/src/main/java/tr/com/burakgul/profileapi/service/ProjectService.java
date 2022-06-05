package tr.com.burakgul.profileapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tr.com.burakgul.profileapi.model.dto.ProjectDTO;
import tr.com.burakgul.profileapi.repository.ProjectRepository;
import tr.com.burakgul.profileapi.model.entity.Project;

import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectDTO findProject(Long id){
        Optional<Project> project = this.projectRepository.findById(id);
        if(project.isPresent()){
            return new ProjectDTO(project.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Project is not found");
        }
    }

    public ProjectDTO saveProject(ProjectDTO project){
        Project projectEntity = new Project(project);
        Project savedProject = this.projectRepository.save(projectEntity);
        ProjectDTO projectDTO = new ProjectDTO(savedProject);
        return projectDTO;
    }

    public List<ProjectDTO> findAll(){
        List<Project> projects = this.projectRepository.findAll();
        List<ProjectDTO> projectDTOS = projects.stream()
                .map(project -> new ProjectDTO(project))
                .collect(Collectors.toList());

        return projectDTOS;
    }

    public ProjectDTO updateProjectDescription(ProjectDTO project, Long id){
        Project projectEntity = new Project(project);
        projectEntity.setId(id);
        Project updatedProject = this.projectRepository.save(projectEntity);
        ProjectDTO projectDTO = new ProjectDTO(updatedProject);
        return projectDTO;
    }
}
