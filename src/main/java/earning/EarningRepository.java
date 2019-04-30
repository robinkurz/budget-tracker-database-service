package earning;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource( collectionResourceRel = "earnings", path="earnings")
public interface EarningRepository extends PagingAndSortingRepository<Earning, Long> {
}
