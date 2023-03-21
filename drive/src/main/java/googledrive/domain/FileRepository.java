package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "files", path = "files")
public interface FileRepository
    extends PagingAndSortingRepository<File, Long> {}
